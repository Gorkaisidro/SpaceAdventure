/*
 * 
 */
package com.spaceadventure.datos;

import static com.spaceadventure.datos.Conexion.close;
import static com.spaceadventure.datos.Conexion.getConnection;
import com.spaceadventure.dominio.Extraterrestre;
import com.spaceadventure.dominio.Mineral;
import com.spaceadventure.dominio.Planeta;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Gorka Isidro
 */
public class PlanetaDAO implements iPlanetaDAO {

    private static final String SQL_SELECT = "SELECT p.idPlaneta, p.nombre, p.nivel, p.moneda, p.agua, \n"
            + "e.idExtraterrestre, e.nombre as nombreExtraterrestre, e.nivel as nivelExtraterrestre, e.defensa, e.ataque, e.moneda as monedaExtraterrestre, e.agua as aguaExtraterrestre, \n"
            + "m.idMineral, m.nivel as nivelMineral, m.combustible, m.precioCompra, \n"
            + "i.idItem, i.nombre as nombreMineral, i.espacio "
            + "FROM Planeta p "
            + "INNER JOIN planeta_extraterrestre pe "
            + "ON p.idPlaneta = pe.Planeta_idPlaneta "
            + "INNER JOIN Extraterrestre e "
            + "ON pe.Extraterrestre_idExtraterrestre = e.idExtraterrestre "
            + "INNER JOIN Mineral m "
            + "ON e.Mineral_idMineral = m.idMineral "
            + "INNER JOIN Item i "
            + "ON m.Item_idItem = i.idItem";

    private static final String SQL_ID = "SELECT *"
            + "FROM planeta "
            + "WHERE idPlaneta = ?";

    @Override
    public List<Planeta> listaPlanetas() {

        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;
        List<Planeta> planetas = new ArrayList<>();

        try {
            conn = getConnection();
            st = conn.createStatement();
            rs = st.executeQuery(SQL_SELECT);

            while (rs.next()) {
                List<Extraterrestre> extraterrestres = new ArrayList<>();
                Extraterrestre extraterrestre = new Extraterrestre(
                        rs.getInt("idExtraterrestre"),
                        rs.getString("nombreExtraterrestre"),
                        rs.getInt("nivelExtraterrestre"),
                        rs.getInt("defensa"),
                        rs.getInt("ataque"),
                        rs.getInt("monedaExtraterrestre"),
                        rs.getInt("aguaExtraterrestre"),
                        new Mineral(rs.getInt("idItem"),
                                rs.getString("nombreMineral"),
                                rs.getInt("espacio"),
                                rs.getInt("idMineral"),
                                rs.getInt("nivelMineral"),
                                rs.getInt("combustible"),
                                rs.getInt("precioCompra")));
                extraterrestres.add(extraterrestre);

                boolean encontrado = false;
                for (Planeta planeta : planetas) {
                    if (planeta.getIdPlaneta() == rs.getInt("idPlaneta")) {
                        planeta.getEstraterrestrePlaneta().add(extraterrestre);
                        encontrado = true;
                        break;
                    }
                }

                if (!encontrado) {
                    Planeta planeta = new Planeta(
                            rs.getInt("idPlaneta"),
                            rs.getString("nombre"),
                            rs.getInt("nivel"),
                            rs.getInt("moneda"),
                            rs.getInt("agua"),
                            extraterrestres);
                    planetas.add(planeta);
                }
            }

        } catch (SQLException ex) {
            Logger.getLogger(PlanetaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                close(rs);
                close(st);
                close(conn);
            } catch (SQLException ex) {
                Logger.getLogger(PlanetaDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return planetas;
    }

}
