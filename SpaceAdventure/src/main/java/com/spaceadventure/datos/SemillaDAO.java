/*
 * 
 */
package com.spaceadventure.datos;

import static com.spaceadventure.datos.Conexion.*;
import com.spaceadventure.dominio.Semilla;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alumno Mañana
 */
public class SemillaDAO implements iSemillaDAO{
    
    private static final String SQL_SELECT = "SELECT *"
            + "FROM Semilla "
            + "INNER JOIN Item "
            + "ON Semilla.Item_idItem = Item.idItem";
    
    @Override
    public List<Semilla> ListaSemillas(){
        
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;
        List<Semilla> semillas = new ArrayList<>();
        
        try {
            conn = getConnection();
            st = conn.createStatement();
            rs = st.executeQuery(SQL_SELECT);
            
            while(rs.next()){
                semillas.add(new Semilla(
                    rs.getInt("idItem"),
                    rs.getString("nombre"),
                    rs.getInt("espacio"),
                    rs.getInt("idSemilla"),
                    rs.getInt("agua"),
                    rs.getInt("nivel"),
                    rs.getInt("precioCompra")));
            }
                                        
        } catch (SQLException ex) {
            Logger.getLogger(SemillaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                close(rs);
                close(st);
                close(conn);
            } catch (SQLException ex) {
                Logger.getLogger(SemillaDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        return semillas;
    }
}
