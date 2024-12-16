/*
 * 
 */
package com.spaceadventure.datos;

import static com.spaceadventure.datos.Conexion.*;
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
public class MineralDAO implements iMineralDAO{
    
    private static final String SQL_SELECT = "SELECT *"
            + "FROM Mineral "
            + "INNER JOIN Item "
            + "ON Mineral.Item_idItem = Item.idItem";
    
    @Override
    public List<Mineral> listaMinerales(){
        
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;
        List<Mineral> minerales = new ArrayList<>();
        
        try {
            conn = getConnection();
            st = conn.createStatement();
            rs = st.executeQuery(SQL_SELECT);
            
            while(rs.next()){
                minerales.add(new Mineral(
                    rs.getInt("idItem"),
                    rs.getString("nombre"),
                    rs.getInt("espacio"),
                    rs.getInt("idMineral"),
                    rs.getInt("nivel"),
                    rs.getInt("combustible"),
                    rs.getInt("precioCompra")));
            }
                                        
        } catch (SQLException ex) {
            Logger.getLogger(MineralDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                close(rs);
                close(st);
                close(conn);
            } catch (SQLException ex) {
                Logger.getLogger(MineralDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        return minerales;
    }
}
