/*
 * 
 */
package com.spaceadventure.datos;

import static com.spaceadventure.datos.Conexion.*;
import com.spaceadventure.dominio.Extraterrestre;
import com.spaceadventure.dominio.Mineral;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alumno Mañana
 */
public class ExtraterrestreDAO implements iExtraterrestreDAO {

    private static final String SQL_SELECT = "SELECT e.idExtraterrestre, e.nombre, e.nivel, e.defensa, e.ataque, e.moneda, e.agua, \n"
            + "m.idMineral, m.nivel as nivelMineral, m.combustible, m.precioCompra, \n"
            + "i.idItem, i.nombre as nombreMineral, i.espacio "
            + "FROM Extraterrestre e "
            + "INNER JOIN Mineral m "
            + "ON e.Mineral_idMineral = m.idMineral "
            + "INNER JOIN Item i "
            + "ON m.Item_idItem = i.idItem";
    
    private static final String SQL_ID = "SELECT e.idExtraterrestre, e.nombre, e.nivel, e.defensa, e.ataque, e.moneda, e.agua, \n"
            + "m.idMineral, m.nivel as nivelMineral, m.combustible, m.precioCompra, \n"
            + "i.idItem, i.nombre as nombreMineral, i.espacio "
            + "FROM Extraterrestre e "
            + "INNER JOIN Mineral m "
            + "ON e.Mineral_idMineral = m.idMineral "
            + "INNER JOIN Item i "
            + "ON m.Item_idItem = i.idItem "
            + "WHERE e.idextraterrestre = ? ";

    @Override
    public List<Extraterrestre> listaExtraterrestres() {

        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;
        List<Extraterrestre> extraterrestres = new ArrayList<>();

        try {
            conn = getConnection();
            st = conn.createStatement();
            rs = st.executeQuery(SQL_SELECT);

            while (rs.next()) {
                extraterrestres.add(new Extraterrestre(
                        rs.getInt("idExtraterrestre"),
                        rs.getString("nombre"),
                        rs.getInt("nivel"),
                        rs.getInt("defensa"),
                        rs.getInt("ataque"),
                        rs.getInt("moneda"),
                        rs.getInt("agua"),
                        new Mineral(rs.getInt("idItem"),
                                rs.getString("nombreMineral"),
                                rs.getInt("espacio"),
                                rs.getInt("idMineral"),
                                rs.getInt("nivelMineral"),
                                rs.getInt("combustible"),
                                rs.getInt("precioCompra"))));
            }

        } catch (SQLException ex) {
            Logger.getLogger(ExtraterrestreDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                close(rs);
                close(st);
                close(conn);
            } catch (SQLException ex) {
                Logger.getLogger(ExtraterrestreDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return extraterrestres;
    }

}
