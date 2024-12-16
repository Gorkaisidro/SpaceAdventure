/*
 * Clase en la que tengo definida la conexión a mi base de datos y sus métodos
 */
package com.spaceadventure.datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.activation.DataSource;
import org.apache.commons.dbcp2.BasicDataSource;

/**
 *
 * @author Alumno Mañana
 */
public class Conexion {
    
    // URL de mi conexión
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/spaceadventure?useSSL=false&"
            +"useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";
    
    // Usuario de mi base de datos
    private static final String JDBC_USER = "root";
    
    // Contraseña de mi base de datos
    private static final String JDBC_PASS="1234";
    
    public static DataSource getDataSource(){
        BasicDataSource bs = new BasicDataSource();
        bs.setDriverClassName("com.mysql.jdbc.Driver");
        bs.setUrl(JDBC_URL);
        bs.setUsername(JDBC_USER);
        bs.setPassword(JDBC_PASS);
        //tamaño inicial del pool de conexiones. 
        //5 conexiones ya que cada conexion nos va a demandar muchos recursos
        bs.setInitialSize(5);
        
        return (DataSource) bs;
    }
    
    // Método que me permite establecer mi conexión contra mi base de datos
    public static Connection getConnection() throws SQLException{
        return DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASS);
    }
    
    // Método que me permite cerrar el ResultSet
    public static void close(ResultSet rs) throws SQLException{
        rs.close();
    }
    
    // Método que me permite cerrar el Statement
    public static void close(Statement st) throws SQLException{
        st.close();
    }
    
    // Método que me permite cerrar una Conexión
    public static void close(Connection conn) throws SQLException{
        conn.close();
    }
}
