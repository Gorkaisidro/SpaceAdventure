/*
 * 
 */
package com.spaceadventure.services;

import com.spaceadventure.dominio.Nave;
import com.spaceadventure.dominio.Planeta;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alumno Mañana
 */
public interface iCommon {

    public void dibujoMenu();
    
    public void dibujoMenuPrincipal(ArrayList<Nave> naves);
    
    public void dibujoMenuLaboratorio();
    
    public void dibujoMenuAlmacen();
    
    public void dibujoMenuAlmacenObjetos();

    public void dibujoMenuAlmacenDejar();

    public void dibujoMenuAlmacenSacar();

    public void dibujoMenuTrabajar();

    public void dibujoMenuTrabajarRegar();

    public void dibujoMenuExplorar(List<Planeta> planetas, ArrayList<Nave> naves);
    
    public void dibujoMenuPlaneta(ArrayList<Nave> naves);

    public void dibujoMenuPlanetaConquista(ArrayList<Nave> naves);

    public void dibujoMenuTienda(ArrayList<Nave> naves);


    
}
