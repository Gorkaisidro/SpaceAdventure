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
public class CommonImpl implements iCommon {

    @Override
    public void dibujoMenu() {
        System.out.println("--------------------------");
        System.out.println("| 1.JUGAR 2.PUNTUACIONES |");
        System.out.println("|       3.SALIR          |");
        System.out.println("--------------------------");
    }

    @Override
    public void dibujoMenuPrincipal(ArrayList<Nave> naves) {
        System.out.println("-----------------------------");
        System.out.println("| 1.NAVE     2.LABORATORIO  | COMBUSTIBLE: " + naves.get(0).getCombustible());
        System.out.println("| 3.EXPLORAR 4.TIENDA       |");
        System.out.println("|       5.SALIR             |");
        System.out.println("-----------------------------");
    }

    @Override
    public void dibujoMenuLaboratorio() {
        System.out.println("------------------------");
        System.out.println("| 1.ALMACEN 2.TRABAJAR |");
        System.out.println("|       3.SALIR        |");
        System.out.println("------------------------");
    }

    @Override
    public void dibujoMenuAlmacen() {
        System.out.println("------------------------------------------");
        System.out.println("|             1.VER ALMACEN              |");
        System.out.println("| 2.DEJAR EN ALMACEN 3.SACAR DEL ALMACEN |");
        System.out.println("|                4.SALIR                 |");
        System.out.println("------------------------------------------");
    }

    @Override
    public void dibujoMenuAlmacenObjetos() {
        System.out.println("------------------");
        System.out.println("| 1. SEMILLA     |");
        System.out.println("| 2. PLANTA      |");
        System.out.println("| 3. MINERAL     |");
        System.out.println("| 4. COMBUSTIBLE |");
        System.out.println("| 5. ARMA        |");
        System.out.println("| 6. AGUA        |");
        System.out.println("| 7. SALIR       |");
        System.out.println("------------------");
    }

    @Override
    public void dibujoMenuAlmacenDejar() {
        System.out.println("------------------");
        System.out.println("| 1. SEMILLA     |");
        System.out.println("| 2. PLANTA      |");
        System.out.println("| 3. MINERAL     |");
        System.out.println("| 4. ARMA        |");
        System.out.println("| 5. AGUA        |");
        System.out.println("| 6. SALIR       |");
        System.out.println("------------------");
    }

    @Override
    public void dibujoMenuAlmacenSacar() {
        System.out.println("------------------");
        System.out.println("| 1. SEMILLA     |");
        System.out.println("| 2. PLANTA      |");
        System.out.println("| 3. COMBUSTIBLE |");
        System.out.println("| 4. ARMA        |");
        System.out.println("| 5. SALIR       |");
        System.out.println("------------------");
    }

    @Override
    public void dibujoMenuTrabajar() {
        System.out.println("----------------------------------");
        System.out.println("| 1.SEMILLAS PLANTADAS 2.PLANTAR |");
        System.out.println("| 3.PLANTAS PLANTADAS  4.REGAR   |");
        System.out.println("|     5. EXTRAER COMBUSTIBLE     |");
        System.out.println("|          6. SALIR              |");
        System.out.println("----------------------------------");
    }

    @Override
    public void dibujoMenuTrabajarRegar() {
        System.out.println("------------------------");
        System.out.println("| 1.SEMILLAS 2.PLANTAS |");
        System.out.println("|        3.SALIR       |");
        System.out.println("------------------------");
    }

    @Override
    public void dibujoMenuExplorar(List<Planeta> planetas, ArrayList<Nave> naves) {
        System.out.println("----------------");
        System.out.println("| 1. " + planetas.get(0).getNombre() + "  | COMBUSTIBLE: " + naves.get(0).getCombustible());
        System.out.println("| 2. " + planetas.get(1).getNombre() + "    |");
        System.out.println("| 3. " + planetas.get(2).getNombre() + " |");
        System.out.println("| 4. SALIR     |");
        System.out.println("----------------");
    }

    @Override
    public void dibujoMenuPlaneta(ArrayList<Nave> naves) {
        System.out.println("--------------------------");
        System.out.println("| 1.EXPLORAR 2.CONQUISTA | COMBUSTIBLE: " + naves.get(0).getCombustible());
        System.out.println("|        3.SALIR         |");
        System.out.println("--------------------------");
    }

    @Override
    public void dibujoMenuPlanetaConquista(ArrayList<Nave> naves) {
        System.out.println("----------------------");
        System.out.println("| 1.ATACAR 2.ESCAPAR | COMBUSTIBLE: " + naves.get(0).getCombustible());
        System.out.println("----------------------");
    }

    @Override
    public void dibujoMenuTienda(ArrayList<Nave> naves) {
        System.out.println("----------------------");
        System.out.println("| 1.COMPRAR 2.VENDER | COMBUSTIBLE: " + naves.get(0).getCombustible());
        System.out.println("| 3.ACTUALIZAR NAVE  |");
        System.out.println("|      4.SALIR       |");
        System.out.println("----------------------");
    }

}
