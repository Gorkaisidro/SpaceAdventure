/*
 * 
 */
package com.spaceadventure.datos;

import com.spaceadventure.dominio.Nave;
import java.util.List;

/**
 *
 * @author Alumno Mañana
 */
public interface iNaveDAO {    
    public List<Nave> puntuacion();
    public int insertar(Nave nave);
    public int actualizarPuntuacion(int idNave, int puntuacion);    
}
