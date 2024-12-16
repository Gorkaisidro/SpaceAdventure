/*
 * Programa principal
 */
package com.spaceadventure;

import com.spaceadventure.datos.*;
import com.spaceadventure.dominio.*;
import com.spaceadventure.services.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Alumno Mañana
 */
public class SpaceAdventure {

    public static void main(String[] args) {

        // Instanciar una variables de las clases para acceder a los metodos
        iCommon iCommon = new CommonImpl();
        iNaveDAO iNaveDAO = new NaveDAO();
        iArmaDAO iArmaDAO = new ArmaDAO();
        iMineralDAO iMineralDAO = new MineralDAO();
        iSemillaDAO iSemillaDAO = new SemillaDAO();
        iPlantaDAO iPlantaDAO = new PlantaDAO();
        iExtraterrestreDAO iEstraterrestreDAO = new ExtraterrestreDAO();
        iPlanetaDAO iPlanetaDAO = new PlanetaDAO();
        Laboratorio laboratorio = new Laboratorio(0, "LABORATORIO", 0, 0, new ArrayList<>(), new ArrayList<>(), new ArrayList<>(), new ArrayList<>(), new ArrayList<>(), new ArrayList<>());

        // Creamos los ArrayList de cada una de las Clases
        List<Arma> armas = iArmaDAO.listaArmas();
        List<Mineral> minerales = iMineralDAO.listaMinerales();
        List<Semilla> semillas = iSemillaDAO.ListaSemillas();
        List<Planta> plantas = iPlantaDAO.listaPlantas();
        List<Extraterrestre> extraterrestres = iEstraterrestreDAO.listaExtraterrestres();
        List<Planeta> planetas = iPlanetaDAO.listaPlanetas();
        List<Nave> navesPuntuacion = iNaveDAO.puntuacion();
        ArrayList<Nave> naves = new ArrayList<>();

//        armas.forEach(arma -> {
//            System.out.println(arma);
//        });
//        System.out.println("\n");
//        minerales.forEach(mineral -> {
//            System.out.println(mineral);
//        });
//        System.out.println("\n");
//        semillas.forEach(semilla -> {
//            System.out.println(semilla);
//        });
//        System.out.println("\n");
//        plantas.forEach(planta -> {
//            System.out.println(planta);
//        });
//        System.out.println("\n");
//        extraterrestres.forEach(extraterrestre -> {
//            System.out.println(extraterrestre);
//        });
//        System.out.println("\n");
//        planetas.forEach(planeta -> {
//            System.out.println(planeta);
//        });
//        System.out.println("\n");
//        System.out.println(laboratorio);
//         Programa principal
        Scanner sc = new Scanner(System.in);

        System.out.println("\nSPACE ADVENTURE\n");
        while (true) {
            // MENU PARA EMPEZAR A JUGAR O VER LA PUNTUACION
            iCommon.dibujoMenu();
            int opcion = Integer.parseInt(sc.nextLine());
            switch (opcion) {
                case 1:
                    // EMPEZAR EL JUEGO
                    menuPrincipal(naves, armas, semillas, plantas, minerales, planetas, laboratorio);
                    break;
                case 2:
                    // VER PUNTUACION
                    System.out.println("JUGADOR     \t\tPUNTUACIÓN");
                    // SACAR PUNTUACION DE LA BASE DE DATOS
                    navesPuntuacion.forEach(nave -> {
                        System.out.println(nave.getPiloto() + " \t\t\t" + nave.getPuntuacion());
                    });
                    System.out.println("\n");
                    break;
                case 3:
                    System.out.println("SALIENDO DEL JUEGO");
                    return;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                    break;
            }
        }

    }

    public static void menuPrincipal(ArrayList<Nave> naves, List<Arma> armas, List<Semilla> semillas, List<Planta> plantas, List<Mineral> minerales, List<Planeta> planetas, Laboratorio laboratorio) {
        Scanner sc = new Scanner(System.in);
        iCommon iCommon = new CommonImpl();
        iNaveDAO iNaveDAO = new NaveDAO();
        crearJugador(naves, iNaveDAO);
        System.out.println("\nBIENVENIDO A LA AVENTURA " + naves.get(0).getPiloto());
        System.out.println("SERAS EL PILOTO DE LA NAVE " + naves.get(0).getNombre() + "\n");
        while (true) {
            iCommon.dibujoMenuPrincipal(naves);
            int opcion = Integer.parseInt(sc.nextLine());
            switch (opcion) {
                case 1:
                    naves.get(0).datosNave();
                    break;
                case 2:
                    iCommon.dibujoMenuLaboratorio();
                    int opcion1 = Integer.parseInt(sc.nextLine());
                    switch (opcion1) {
                        case 1:
                            naves.get(0).almacen(laboratorio, naves);
                            break;
                        case 2:
                            laboratorio.trabajar(laboratorio, plantas);
                            break;
                        case 3:
                            break;
                        default:
                            System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                            break;
                    }
                    break;
                case 3:
                    // COMPROBAR QUE EL COMBUSTIBLE ES MAYOR QUE 0
                    if (naves.get(0).getCombustible() > 0) {
                        naves.get(0).setCombustible(naves.get(0).getCombustible() - 1);
                        naves.get(0).explorar(planetas, naves, laboratorio);
                    } else {
                        // FINALIZAR JUEGO Y CALCULAR PUNTUACION
                        naves.get(0).puntuacionFinal(naves, laboratorio);
                        System.out.println("\nGAME OVER");
                        System.out.println("PUNTUACIÓN FINAL: " + naves.get(0).getPuntuacion());
                        iNaveDAO.actualizarPuntuacion(naves.get(0).getIdNave(), naves.get(0).getPuntuacion());
                        System.exit(0);
                    }
                    break;
                case 4:
                    // COMPROBAR QUE EL COMBUSTIBLE ES MAYOR QUE 0
                    if (naves.get(0).getCombustible() > 0) {
                        naves.get(0).setCombustible(naves.get(0).getCombustible() - 1);
                        naves.get(0).comprarVender(semillas, armas, plantas, minerales, naves);
                    } else {
                        // FINALIZAR JUEGO Y CALCULAR PUNTUACION
                        naves.get(0).puntuacionFinal(naves, laboratorio);
                        System.out.println("\nGAME OVER");
                        System.out.println("PUNTUACIÓN FINAL: " + naves.get(0).getPuntuacion());
                        iNaveDAO.actualizarPuntuacion(naves.get(0).getIdNave(), naves.get(0).getPuntuacion());
                        System.exit(0);
                    }
                    break;
                case 5:
                    // FINALIZAR JUEGO Y CALCULAR PUNTUACION
                    naves.get(0).puntuacionFinal(naves, laboratorio);
                    System.out.println("\nGAME OVER");
                    System.out.println("\nPUNTUACIÓN FINAL: " + naves.get(0).getPuntuacion());
                    iNaveDAO.actualizarPuntuacion(naves.get(0).getIdNave(), naves.get(0).getPuntuacion());
                    System.exit(0);
                    return;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                    break;
            }
        }

    }

    // METODO PARA CREAR EL JUGADOR
    public static void crearJugador(List<Nave> jugadores, iNaveDAO iNaveDAO) {

        Scanner sc = new Scanner(System.in);
        boolean repetir = true;
        while (repetir) {
            try {
                System.out.println("CREAR JUGADOR");
                System.out.println("\tINGRESE EL NOMBRE DEL PILOTO: ");
                String piloto = sc.nextLine().toUpperCase();
                // COMPROBAR QUE EL NOMBRE SOLO CONTIENE LETRAS
                if (piloto.matches("^[a-zA-z]+$")) {
                    Nave nave = new Nave("ALFA CENTAURI", 1, piloto, 50, 10, 5, 5, 5, 2, 3, 3, 3, 200, 0, new ArrayList<>(), new ArrayList<>(), new ArrayList<>(), new ArrayList<>());
                    // METER NAVE CREADA EN EL LIST
                    jugadores.add(nave);
                    // INSERTAR LA NAVE EN LA BASE DE DATOS
                    iNaveDAO.insertar(nave);
                    repetir = false;
                } else {
                    System.out.println("\tEL NOMBRE SOLO PUEDE CONTENER LETRAS. INTENTALO DE NUEVO.\n");
                }
            } catch (Exception e) {
                System.out.println("DATOS INVALIDOS");
                repetir = true;
            }
        }
    }

}
