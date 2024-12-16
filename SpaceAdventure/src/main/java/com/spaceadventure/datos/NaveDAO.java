/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spaceadventure.datos;

import static com.spaceadventure.datos.Conexion.close;
import static com.spaceadventure.datos.Conexion.getConnection;
import com.spaceadventure.dominio.Nave;
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
 * @author Gorka
 */
public class NaveDAO implements iNaveDAO {

    private static final String SQL_SELECT_BYPUNTUACION = "SELECT piloto, puntuacion FROM nave ORDER BY puntuacion DESC LIMIT 10";
    private static final String SQL_INSERT = "INSERT INTO nave(piloto, puntuacion) VALUES (?, ?)";
    private static final String SQL_UPDATE = "UPDATE nave SET puntuacion = ? WHERE idNave = ?";

    @Override
    public List<Nave> puntuacion(){
        
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;
        List<Nave> naves = new ArrayList<>();
        
        try {
            conn = getConnection();
            st = conn.createStatement();
            rs = st.executeQuery(SQL_SELECT_BYPUNTUACION);
            
            while(rs.next()){
                naves.add(new Nave(
                    rs.getString("piloto"),
                    rs.getInt("puntuacion")));
            }
                                        
        } catch (SQLException ex) {
            Logger.getLogger(NaveDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                close(rs);
                close(st);
                close(conn);
            } catch (SQLException ex) {
                Logger.getLogger(NaveDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        return naves;
    }
    
    @Override
    public int insertar(Nave nave) {
        //Declaro las variables que necesito para insertar una persona
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        int registro = 0;

        try {
            // Establecemos la conexión
            conn = getConnection();
            // Praparar la instruccion con la sentencia SQL que quiero ejecutar
            stmt = conn.prepareStatement(SQL_INSERT, Statement.RETURN_GENERATED_KEYS);
            // Ahora tenemos que pasar los valores a los interrogantes(?)
            stmt.setString(1, nave.getPiloto());
            stmt.setInt(2, nave.getPuntuacion());

            int resultado = stmt.executeUpdate();

            if (resultado != 1) {
                throw new SQLException("ERROR");
            }

            rs = stmt.getGeneratedKeys();

            if (rs.next()) {
                int idNaveGenerado = rs.getInt(1);
                nave.setIdNave(idNaveGenerado);
            }
        } catch (SQLException ex) {
            Logger.getLogger(NaveDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                close(rs);
                close(stmt);
                close(conn);
            } catch (SQLException ex) {
                Logger.getLogger(NaveDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return registro;
    }

    @Override
    public int actualizarPuntuacion(int idNave, int puntuacion) {

        //Declaro las variables que necesito para insertar una persona
        Connection conn = null;
        PreparedStatement stmt = null;
        int registro = 0;

        try {
            // Establecemos la conexión
            conn = getConnection();
            // Praparar la instruccion con la sentencia SQL que quiero ejecutar
            stmt = conn.prepareStatement(SQL_UPDATE);
            // Ahora tenemos que pasar los valores a los interrogantes(?)
            stmt.setInt(1, puntuacion);
            stmt.setInt(2, idNave);

            // Ejecutamos la consulta
            registro = stmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(NaveDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                close(stmt);
                close(conn);
            } catch (SQLException ex) {
                Logger.getLogger(NaveDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return registro;
    }
}
