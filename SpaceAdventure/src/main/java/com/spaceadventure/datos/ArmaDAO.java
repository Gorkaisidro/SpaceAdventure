/*
 * 
 */
package com.spaceadventure.datos;

import static com.spaceadventure.datos.Conexion.*;
import com.spaceadventure.dominio.Arma;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alumno Mañana
 */
public class ArmaDAO implements iArmaDAO{
    
    private static final String SQL_SELECT = "SELECT *"
            + "FROM Arma "
            + "INNER JOIN Item "
            + "ON Arma.Item_idItem = Item.idItem";
    
    @Override
    public List<Arma> listaArmas(){
        
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;
        List<Arma> armas = new ArrayList<>();
        
        try {
            conn = getConnection();
            st = conn.createStatement();
            rs = st.executeQuery(SQL_SELECT);
            
            while(rs.next()){
                armas.add(new Arma(
                    rs.getInt("idItem"),
                    rs.getString("nombre"),
                    rs.getInt("espacio"),
                    rs.getInt("idArma"),
                    rs.getInt("nivel"),
                    rs.getInt("ataque"),
                    rs.getInt("defensa"),
                    rs.getInt("precioCompra")));
            }
                                        
        } catch (SQLException ex) {
            Logger.getLogger(ArmaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                close(rs);
                close(st);
                close(conn);
            } catch (SQLException ex) {
                Logger.getLogger(ArmaDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        return armas;
    }
    
}
