/*
 * 
 */
package com.spaceadventure.datos;

import static com.spaceadventure.datos.Conexion.*;
import com.spaceadventure.dominio.Planta;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alumno Mañana
 */
public class PlantaDAO implements iPlantaDAO{
    
    private static final String SQL_SELECT = "SELECT *"
            + "FROM Planta "
            + "INNER JOIN Item "
            + "ON Planta.Item_idItem = Item.idItem";
    
    @Override
    public List<Planta> listaPlantas(){
        
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;
        List<Planta> plantas = new ArrayList<>();
        
        try {
            conn = getConnection();
            st = conn.createStatement();
            rs = st.executeQuery(SQL_SELECT);
            
            while(rs.next()){
                plantas.add(new Planta(
                    rs.getInt("idItem"),
                    rs.getString("nombre"),
                    rs.getInt("espacio"),
                    rs.getInt("idPlanta"),
                    rs.getInt("agua"),
                    rs.getInt("cantidadRiego"),
                    rs.getInt("riego"),
                    rs.getInt("precioVenta")));
            }
                                        
        } catch (SQLException ex) {
            Logger.getLogger(PlantaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                close(rs);
                close(st);
                close(conn);
            } catch (SQLException ex) {
                Logger.getLogger(PlantaDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        return plantas;
    }
}
