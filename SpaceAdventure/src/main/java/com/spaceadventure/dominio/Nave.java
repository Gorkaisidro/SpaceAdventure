/*
 * 
 */
package com.spaceadventure.dominio;

import com.spaceadventure.datos.NaveDAO;
import com.spaceadventure.datos.iNaveDAO;
import com.spaceadventure.services.CommonImpl;
import com.spaceadventure.services.iCommon;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Alumno Mañana
 */
public class Nave {

    // Conjunto de propiedades
    private int idNave;
    private String nombre;
    private int nivel;
    private String piloto;
    private int moneda;
    private int ataque;
    private int defensa;
    private int agua;
    private int combustible;
    private int espacioArma;
    private int espacioMineral;
    private int espacioSemilla;
    private int espacioPlanta;
    private int precio;
    private int puntuacion;
    private List<Semilla> semillaNave;
    private List<Planta> plantaNave;
    private List<Mineral> mineralNave;
    private List<Arma> armaNave;

    //Contador para el ID del laboratorio
    private static int contID = 0;

    public Nave() {
        this.idNave = contID++;
    }

    public Nave(int idNave) {
        this.idNave = idNave;
    }

    public Nave(String piloto, int puntuacion) {
        this.piloto = piloto;
        this.puntuacion = puntuacion;
    }

    public Nave(int idNave, String piloto, int puntuacion) {
        this.idNave = idNave;
        this.piloto = piloto;
        this.puntuacion = puntuacion;
    }

    public Nave(String nombre, int nivel, String piloto, int moneda, int ataque, int defensa, int agua, int combustible, int espacioArma, int espacioMineral, int espacioSemilla, int espacioPlanta, int precio, int puntuacion, List<Semilla> semillaNave, List<Planta> plantaNave, List<Mineral> mineralNave, List<Arma> armaNave) {
        this();
        this.nombre = nombre;
        this.nivel = nivel;
        this.piloto = piloto;
        this.moneda = moneda;
        this.ataque = ataque;
        this.defensa = defensa;
        this.agua = agua;
        this.combustible = combustible;
        this.espacioArma = espacioArma;
        this.espacioMineral = espacioMineral;
        this.espacioSemilla = espacioSemilla;
        this.espacioPlanta = espacioPlanta;
        this.precio = precio;
        this.puntuacion = puntuacion;
        this.semillaNave = semillaNave;
        this.plantaNave = plantaNave;
        this.mineralNave = mineralNave;
        this.armaNave = armaNave;
    }

    public Nave(int idNave, String nombre, int nivel, String piloto, int moneda, int ataque, int defensa, int agua, int combustible, int espacioArma, int espacioMineral, int espacioSemilla, int espacioPlanta, int precio, int puntuacion, List<Semilla> semillaNave, List<Planta> plantaNave, List<Mineral> mineralNave, List<Arma> armaNave) {
        this.idNave = idNave;
        this.nombre = nombre;
        this.nivel = nivel;
        this.piloto = piloto;
        this.moneda = moneda;
        this.ataque = ataque;
        this.defensa = defensa;
        this.agua = agua;
        this.combustible = combustible;
        this.espacioArma = espacioArma;
        this.espacioMineral = espacioMineral;
        this.espacioSemilla = espacioSemilla;
        this.espacioPlanta = espacioPlanta;
        this.precio = precio;
        this.puntuacion = puntuacion;
        this.semillaNave = semillaNave;
        this.plantaNave = plantaNave;
        this.mineralNave = mineralNave;
        this.armaNave = armaNave;
    }

    //Getter & Setter
    public int getIdNave() {
        return idNave;
    }

    public void setIdNave(int idNave) {
        this.idNave = idNave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public String getPiloto() {
        return piloto;
    }

    public void setPiloto(String piloto) {
        this.piloto = piloto;
    }

    public int getMoneda() {
        return moneda;
    }

    public void setMoneda(int moneda) {
        this.moneda = moneda;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public int getAgua() {
        return agua;
    }

    public void setAgua(int agua) {
        this.agua = agua;
    }

    public int getCombustible() {
        return combustible;
    }

    public void setCombustible(int combustible) {
        this.combustible = combustible;
    }

    public int getEspacioArma() {
        return espacioArma;
    }

    public void setEspacioArma(int espacioArma) {
        this.espacioArma = espacioArma;
    }

    public int getEspacioMineral() {
        return espacioMineral;
    }

    public void setEspacioMineral(int espacioMineral) {
        this.espacioMineral = espacioMineral;
    }

    public int getEspacioSemilla() {
        return espacioSemilla;
    }

    public void setEspacioSemilla(int espacioSemilla) {
        this.espacioSemilla = espacioSemilla;
    }

    public int getEspacioPlanta() {
        return espacioPlanta;
    }

    public void setEspacioPlanta(int espacioPlanta) {
        this.espacioPlanta = espacioPlanta;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    public List<Semilla> getSemillaNave() {
        return semillaNave;
    }

    public void setSemillaNave(List<Semilla> semillaNave) {
        this.semillaNave = semillaNave;
    }

    public List<Planta> getPlantaNave() {
        return plantaNave;
    }

    public void setPlantaNave(List<Planta> plantaNave) {
        this.plantaNave = plantaNave;
    }

    public List<Mineral> getMineralNave() {
        return mineralNave;
    }

    public void setMineralNave(List<Mineral> mineralNave) {
        this.mineralNave = mineralNave;
    }

    public List<Arma> getArmaNave() {
        return armaNave;
    }

    public void setArmaNave(List<Arma> armaNave) {
        this.armaNave = armaNave;
    }

    // METODO PARA VER LOS DATOS DE LA NAVE
    public void datosNave() {
        Scanner sc = new Scanner(System.in);
        System.out.println("DATOS DE LA NAVE\n");
        System.out.println("NOMBRE: " + this.nombre + " | NIVEL: " + this.nivel);
        System.out.println("PILOTO: " + this.piloto);
        System.out.println("---------------------------------");
        System.out.println("MONEDAS:        " + this.moneda);
        System.out.println("AGUA:           " + this.agua);
        System.out.println("COMBUSTIBLE:    " + this.combustible);
        System.out.println("---------------------------------");
        System.out.println("ARMAS:          " + this.armaNave.size() + "/" + this.espacioArma);
        System.out.println("ATAQUE:         " + this.ataque);
        System.out.println("DEFENSA:        " + this.defensa);
        System.out.println("---------------------------------");
        System.out.println("SEMILLAS:       " + this.semillaNave.size() + "/" + this.espacioSemilla);
        System.out.println("PLANTAS:        " + this.plantaNave.size() + "/" + this.espacioPlanta);
        System.out.println("MINERALES:      " + this.mineralNave.size() + "/" + this.espacioMineral);
        System.out.println("---------------------------------");
        System.out.println("1. VER RECURSOS   2. SALIR");
        int opcion = Integer.parseInt(sc.nextLine());
        switch (opcion) {
            case 1:
                if (this.semillaNave.isEmpty() && this.plantaNave.isEmpty() && this.mineralNave.isEmpty() && this.armaNave.isEmpty()) {
                    System.out.println("NO TIENES RECURSOS\n");
                } else {
                    System.out.println("SEMILLAS: " + this.semillaNave.size() + "/" + this.espacioSemilla);
                    for (int i = 0; i < this.semillaNave.size(); i++) {
                        System.out.println("\tNOMBRE: " + this.semillaNave.get(i).getNombre());
                        System.out.println("\tESPACIO: " + this.semillaNave.get(i).getEspacio());
                        System.out.println("\tNIVEL: " + this.semillaNave.get(i).getNivel());
                        System.out.println("\tAGUA: " + this.semillaNave.get(i).getAgua());
                        System.out.println("\n");
                    }
                    System.out.println("PLANTAS: " + this.plantaNave.size() + "/" + this.espacioPlanta);
                    for (int i = 0; i < this.plantaNave.size(); i++) {
                        System.out.println("\tNOMBRE: " + this.plantaNave.get(i).getNombre());
                        System.out.println("\tESPACIO: " + this.plantaNave.get(i).getEspacio());
                        System.out.println("\tAGUA: " + this.plantaNave.get(i).getAgua());
                        System.out.println("\tCANTIDAD RIEGO: " + this.plantaNave.get(i).getCantidadRiego());
                        System.out.println("\tPRECIO VENTA: " + this.plantaNave.get(i).getPrecioVenta());
                    }
                    System.out.println("MINERALES: " + this.mineralNave.size() + "/" + this.espacioMineral);
                    for (int i = 0; i < this.mineralNave.size(); i++) {
                        System.out.println("\tNOMBRE: " + this.mineralNave.get(i).getNombre());
                        System.out.println("\tESPACIO: " + this.mineralNave.get(i).getEspacio());
                        System.out.println("\tNIVEL: " + this.mineralNave.get(i).getNivel());
                        System.out.println("\tCOMBUSTIBLE: " + this.mineralNave.get(i).getCombustible());
                    }
                    System.out.println("ARMAS " + this.armaNave.size() + "/" + this.espacioArma);
                    for (int i = 0; i < this.armaNave.size(); i++) {
                        System.out.println("\tNOMBRE: " + this.armaNave.get(i).getNombre());
                        System.out.println("\tESPACIO: " + this.armaNave.get(i).getEspacio());
                        System.out.println("\tNIVEL: " + this.armaNave.get(i).getNivel());
                        System.out.println("\tATAQUE: " + this.armaNave.get(i).getAtaque());
                        System.out.println("\tDEFENSA: " + this.armaNave.get(i).getDefensa());
                    }

                }
            case 2:
                System.out.println("\nSALIENDO DE LA NAVE\n");
                break;
            default:
                System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                break;
        }
    }

    // METODO QUE ENTRA EN LOS PLANETAS QUE SALE DEL METODO EXPLORAR
    public void planeta(List<Planeta> planetas, ArrayList<Nave> naves, Laboratorio laboratorio, int idPlaneta) { // IDPLANETA PARA ENTRAR EN EL PLANETA QUE CORRESPONDE
        iNaveDAO iNaveDAO = new NaveDAO();
        iCommon iCommon = new CommonImpl();
        Scanner sc = new Scanner(System.in);
        // COMPROBAR SI EL PLANETA TIENE EXTRATERRESTRES
        if (planetas.get(idPlaneta).getEstraterrestrePlaneta().isEmpty()) {
            System.out.println("EL PLANETA HA SIDO CONQUISTADO\n");
        } else {
            boolean seguirEnPlaneta = true;
            do {
                // CREAR UNA VARIABLE DE PLANETA PARA TENER EL PLANETA DEL IDPLANETA CORRESPONDIENTE
                Planeta planeta = planetas.get(idPlaneta);
                System.out.println("\nNOS ENCONTRAMOS EN EL PLANETA " + planeta.getNombre().toUpperCase());
                System.out.println("¿QUE QUIERES HACER?\n");
                iCommon.dibujoMenuPlaneta(naves);
                int opcion1 = Integer.parseInt(sc.nextLine());
                switch (opcion1) {
                    case 1:
                        // INFORMACION DEL PLANETA CON SU LISTA DE EXTRATERRESTRES
                        System.out.println("COMENCEMOS A EXPLORAR\n");
                        System.out.println("MONEDAS DE CONQUISTA: " + planeta.getMoneda());
                        System.out.println("AGUA DE CONQUISTA: " + planeta.getAgua() + "\n");
                        // LISTA DE EXTRATERRESTRES
                        for (int i = 0; i < planeta.getEstraterrestrePlaneta().size(); i++) {
                            Extraterrestre extraterrestre = planeta.getEstraterrestrePlaneta().get(i);
                            System.out.println("EXTRATERRESTRE: " + (i + 1));
                            System.out.println("\tNOMBRE: " + extraterrestre.getNombre());
                            System.out.println("\tNIVEL: " + extraterrestre.getNivel());
                            System.out.println("\tATAQUE: " + extraterrestre.getAtaque());
                            System.out.println("\tDEFENSA: " + extraterrestre.getDefensa() + "\n");
                        }
                        // COMPROBAR QUE EL PLANETA NO TENGA EXTRATERRESTRES
                        if (planeta.getEstraterrestrePlaneta().isEmpty()) {
                            System.out.println("NO HAY EXTRATERRESTRES EN ESTE PLANETA\n");

                            // TRANSFERIR LOS RECURSOS A LA NAVE
                            naves.get(0).setAgua(naves.get(0).getAgua() + planeta.getAgua());
                            naves.get(0).setMoneda(naves.get(0).getMoneda() + planeta.getMoneda());
                            // COMPROBAR SI TENEMOS ESPACIO PARA EL MINERAL
                            if (naves.get(0).getMineralNave().size() < naves.get(0).getEspacioMineral()) {
                                System.out.println("EL MINERAL HA SIDO ALMACENADO EN LA NAVE");
                            } else {
                                System.out.println("NO TIENES ESPACIO PARA EL MINERAL");
                                System.out.println("EL MINERAL SE HA PERDIDO");
                            }

                            // REINICIAR LOS RECURSOS DEL PLANETA
                            planeta.setAgua(0);
                            planeta.setMoneda(0);
                            seguirEnPlaneta = false;
                        }
                        break;
                    case 2:
                        // COMPROBAR EL COMBUSTIBLE DE LA NAVE
                        if (naves.get(0).getCombustible() <= 0) {
                            // CALCULAR LA PUNTUACION Y TERMINAR EL JUEGO
                            puntuacionFinal(naves, laboratorio);
                            System.out.println("\nGAME OVER");
                            System.out.println("PUNTUACIÓN FINAL: " + naves.get(0).getPuntuacion());
                            iNaveDAO.actualizarPuntuacion(naves.get(0).getIdNave(), naves.get(0).getPuntuacion());
                            System.exit(0);
                        } else {
                            // RESTAR UNA DE COMBUSTIBLE
                            naves.get(0).setCombustible(naves.get(0).getCombustible() - 1);
                            // COMPROBAR SI EL PLANETA TIENE EXTRATERRESTRES
                            if (planeta.getEstraterrestrePlaneta().isEmpty()) {
                                System.out.println("EL PLANETA NO TIENE EXTRATERRESTRES\n");
                            } else {
                                // SACAR EL EXTRATERRESTRE RANDOM DEL PLANETA Y METERLO EN UNA VARIABLE
                                List<Extraterrestre> listaExtraterrestres = planeta.getEstraterrestrePlaneta();
                                int extraterrestreRandomIndex = (int) (Math.random() * listaExtraterrestres.size());
                                Extraterrestre extraterrestreRandom = listaExtraterrestres.get(extraterrestreRandomIndex);

                                System.out.println("\nNOS HEMOS ENCONTRADO CON EL EXTRATERRESTRE " + extraterrestreRandom.getNombre());
                                System.out.println(extraterrestreRandom.getAtaque() + " DE ATAQUE");
                                System.out.println(extraterrestreRandom.getDefensa() + " DE DEFENSA\n");
                                System.out.println("¿QUE HACEMOS?\n");
                                iCommon.dibujoMenuPlanetaConquista(naves);
                                int opcion2 = Integer.parseInt(sc.nextLine());
                                switch (opcion2) {
                                    case 1:
                                        // COMENZAR EL ATAQUE
                                        // GUARDAR LOS DATOS EN VARIABLES
                                        int defensaNave = naves.get(0).getDefensa();
                                        int ataqueNave = naves.get(0).getAtaque();
                                        int defensaExtraterrestre = extraterrestreRandom.getDefensa();
                                        int ataqueExtraterrestre = extraterrestreRandom.getAtaque();
                                        // HACER UN RANDOM PARA SABER QUIEN EMPIEZA ATACANDO, CON UN 70% DE PROBABILIDAD PARA EL JUGADOR
                                        boolean comienzaAtaque = Math.random() < 0.5;
                                        // COMPROBAR QUE NINGUNA DEFENSA ESTE EN 0
                                        while (defensaNave > 0 && defensaExtraterrestre > 0) {
                                            // EMPEZAR ATACANDO
                                            if (comienzaAtaque) {
                                                System.out.println("EMPECEMOS ATACANDO\n");
                                                // RESTAR ATAQUE DE JUGADOR A LA DEFENSA DEL EXTRATERRESTRE
                                                defensaExtraterrestre -= ataqueNave;
                                                // COMPROBAR SI LA DEFENSA ES 0 O MENOR
                                                if (defensaExtraterrestre <= 0) {
                                                    defensaExtraterrestre = 0;
                                                    System.out.println("LA VIDA DEL EXTRATERRESTRE ES " + defensaExtraterrestre);
                                                    System.out.println("HEMOS DERROTADO AL EXTRATERRESTRE\n");
                                                    int puntuacion1 = 0;
                                                    // CALCULAR LA PUNTUACION DEL EXTRATERRESTRE DERROTADO
                                                    if (extraterrestreRandom.getNivel() == 1) {
                                                        puntuacion1 = 40;
                                                    } else if (extraterrestreRandom.getNivel() == 2) {
                                                        puntuacion1 = 80;
                                                    } else if (extraterrestreRandom.getNivel() == 3) {
                                                        puntuacion1 = 130;
                                                    }
                                                    // SETEAR LA PUNTUACION
                                                    puntuacion(naves, puntuacion1);
                                                    iNaveDAO.actualizarPuntuacion(naves.get(0).getIdNave(), naves.get(0).getPuntuacion());
                                                    // TRANFERIR LOS RECURSOS DEL EXTRATERRESTRE DERROTADO
                                                    naves.get(0).setMoneda(naves.get(0).getMoneda() + extraterrestreRandom.getMoneda());
                                                    System.out.println("LAS MONEDAS HAN SIDO ALMACENADAS EN LA NAVE: " + extraterrestreRandom.getMoneda() + " MONEDAS");
                                                    naves.get(0).setAgua(naves.get(0).getAgua() + extraterrestreRandom.getAgua());
                                                    System.out.println("EL AGUA HA SIDO ALMACENADA EN LA NAVE: " + extraterrestreRandom.getAgua() + " AGUA");
                                                    // COMPROBAR EL ESPACIO DEL MINERAL
                                                    if (naves.get(0).getMineralNave().size() < naves.get(0).getEspacioMineral()) {
                                                        naves.get(0).getMineralNave().add(extraterrestreRandom.getMineral());
                                                        System.out.println("EL MINERAL " + extraterrestreRandom.getMineral().getNombre() + " HA SIDO ALMACENADO EN LA NAVE\n");
                                                    } else {
                                                        System.out.println("NO TIENES ESPACIO PARA EL MINERAL");
                                                        System.out.println("EL MINERAL SE HA PERDIDO");
                                                    }
                                                    // ELIMINAR EL EXTRATERRESTRE DEL PLANETA
                                                    if (!planeta.getEstraterrestrePlaneta().isEmpty()) {
                                                        planeta.getEstraterrestrePlaneta().remove(extraterrestreRandom);
                                                    }

                                                } else {
                                                    System.out.println("EL EXTRATERRESTRE SE DEBILITA");
                                                    System.out.println("SU DEFENSA ES " + defensaExtraterrestre);
                                                }
                                                // RESTAR EL ATAQUE DEL EXTRATERRESTRE AL JUGADOR
                                                defensaNave -= ataqueExtraterrestre;
                                                // COMPROBAR SI LA DEL EXTRATERRESTRE ES MAYOR DE 0
                                                if (defensaExtraterrestre > 0) {
                                                    // ATACA EL EXTRATERRESTRE
                                                    System.out.println("NOS ESTA ATACANDO\n");
                                                    // COMPROBAR QUE LA DEFENSA DEL JUGADOR NO SEA 0 O MENOR
                                                    if (defensaNave <= 0) {
                                                        defensaNave = 0;
                                                        System.out.println("LA DEFENSA DE NUESTRA NAVE ES " + defensaNave);
                                                        System.out.println("EL ESTRATERRESTRE NOS HA GANADO");
                                                        // FINALIZAR JUEGO Y CALCULAR PUNTUACION
                                                        System.out.println("GAME OVER");
                                                        naves.get(0).setDefensa(naves.get(0).getDefensa() - ataqueExtraterrestre);
                                                        puntuacionFinal(naves, laboratorio);
                                                        System.out.println("PUNTUACIÓN FINAL: " + naves.get(0).getPuntuacion());
                                                        iNaveDAO.actualizarPuntuacion(naves.get(0).getIdNave(), naves.get(0).getPuntuacion());
                                                        System.exit(0);
                                                    } else {
                                                        System.out.println("LA NAVE SE DEBILITA");
                                                        System.out.println("NUESTRA DEFENSA ES " + defensaNave);
                                                        naves.get(0).setDefensa(naves.get(0).getDefensa() - ataqueExtraterrestre);
                                                    }
                                                }
                                            } else {
                                                // EXTRATERRESTRE EMPIEZA ATACANDO
                                                System.out.println("EL EXTRATERRESTRE COMIENZA ATACANDO\n");
                                                // RESTAR EL ATAQUE DEL EXTRATERRESTRE AL JUGADOR
                                                defensaNave -= ataqueExtraterrestre;
                                                //COMPROBAR QUE LA VIDA DEL EXTRATERRESTRE ES MAYOR DE 0
                                                if (defensaExtraterrestre > 0) {
                                                    System.out.println("NOS ESTA ATACANDO\n");
                                                    // COMPROBAR QUE LA DEFENSA DEL JUGADOR NO SEA 0 O MENOR
                                                    if (defensaNave <= 0) {
                                                        defensaNave = 0;
                                                        System.out.println("LA DEFENSA DE NUESTRA NAVE ES " + defensaNave);
                                                        System.out.println("EL ESTRATERRESTRE NOS HA GANADO");
                                                        // FINALIZAR JUEGO Y CALCULAR PUNTUACION
                                                        System.out.println("GAME OVER");
                                                        naves.get(0).setDefensa(naves.get(0).getDefensa() - ataqueExtraterrestre);
                                                        puntuacionFinal(naves, laboratorio);
                                                        System.out.println("PUNTUACIÓN FINAL: " + naves.get(0).getPuntuacion());
                                                        iNaveDAO.actualizarPuntuacion(naves.get(0).getIdNave(), naves.get(0).getPuntuacion());
                                                        System.exit(0);
                                                    } else {
                                                        System.out.println("LA NAVE SE DEBILITA");
                                                        System.out.println("NUESTRA DEFENSA ES " + defensaNave);
                                                        naves.get(0).setDefensa(naves.get(0).getDefensa() - ataqueExtraterrestre);
                                                    }
                                                }
                                                // RESTAR ATAQUE DEL JUGADOR A LA DEFENSA DEL EXTRATERRESTRE
                                                defensaExtraterrestre -= ataqueNave;
                                                if (defensaExtraterrestre <= 0) {
                                                    defensaExtraterrestre = 0;
                                                    System.out.println("LA VIDA DEL EXTRATERRESTRE ES " + defensaExtraterrestre);
                                                    System.out.println("HEMOS DERROTADO AL EXTRATERRESTRE");
                                                    // CALCULAR LA PUNTUACION DEL EXTRATERRESTRE DERROTADO
                                                    int puntuacion1 = 0;
                                                    if (extraterrestreRandom.getNivel() == 1) {
                                                        puntuacion1 = 40;
                                                    } else if (extraterrestreRandom.getNivel() == 2) {
                                                        puntuacion1 = 80;
                                                    } else if (extraterrestreRandom.getNivel() == 3) {
                                                        puntuacion1 = 130;
                                                    }
                                                    // SETEAR LA PUNTUACION
                                                    puntuacion(naves, puntuacion1);
                                                    iNaveDAO.actualizarPuntuacion(naves.get(0).getIdNave(), naves.get(0).getPuntuacion());
                                                    // TRANFERIR LOS RECURSOS DEL EXTRATERRESTRE DERROTADO
                                                    naves.get(0).setMoneda(naves.get(0).getMoneda() + extraterrestreRandom.getMoneda());
                                                    System.out.println("LAS MONEDAS HAN SIDO ALMACENADAS EN LA NAVE: " + extraterrestreRandom.getMoneda() + " MONEDAS");
                                                    naves.get(0).setAgua(naves.get(0).getAgua() + extraterrestreRandom.getAgua());
                                                    System.out.println("EL AGUA HA SIDO ALMACENADA EN LA NAVE: " + extraterrestreRandom.getAgua() + " AGUA");
                                                    // COMPROBAR EL ESPACIO DEL MINERAL
                                                    if (naves.get(0).getMineralNave().size() < naves.get(0).getEspacioMineral()) {
                                                        naves.get(0).getMineralNave().add(extraterrestreRandom.getMineral());
                                                        System.out.println("EL MINERAL " + extraterrestreRandom.getMineral().getNombre() + " HA SIDO ALMACENADO EN LA NAVE");
                                                    } else {
                                                        System.out.println("NO TIENES ESPACIO PARA EL MINERAL");
                                                        System.out.println("EL MINERAL SE HA PERDIDO");
                                                    }
                                                    // ELIMINAR EL EXTRATERRESTRE DEL PLANETA
                                                    if (!planeta.getEstraterrestrePlaneta().isEmpty()) {
                                                        planeta.getEstraterrestrePlaneta().remove(extraterrestreRandom);
                                                    }

                                                } else {
                                                    System.out.println("EL EXTRATERRESTRE SE DEBILITA");
                                                    System.out.println("SU DEFENSA ES " + defensaExtraterrestre);
                                                }
                                            }
                                        }
                                        break;

                                    case 2:
                                        // ESCAPAR DEL COMBATE
                                        System.out.println("ESCAPASTE CON EXITO");
                                        break;
                                    default:
                                        System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                                        break;
                                }
                            }
                        }
                        break;

                    case 3:
                        System.out.println("SALIENDO DEL PLANETA\n");
                        seguirEnPlaneta = false;
                        break;
                    default:
                        System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                        break;
                }

                if (seguirEnPlaneta) {
                    // SEGUIR EN EL PLANETA
                    System.out.println("¿QUIERES SEGUIR EN EL PLANETA?");
                    System.out.println("1.SI   2.NO\n");
                    int seguir = Integer.parseInt(sc.nextLine());
                    if (seguir == 2) {
                        seguirEnPlaneta = false;
                    }
                }
            } while (seguirEnPlaneta);
        }
    }

    // METODO PARA EXPLORAR
    public void explorar(List<Planeta> planetas, ArrayList<Nave> naves, Laboratorio laboratorio) {
        iCommon iCommon = new CommonImpl();
        Scanner sc = new Scanner(System.in);
        boolean seguirExplorando = true;
        do {
            System.out.println("¿QUE PLANETA QUIERES EXPLORAR?\n");
            // ELEGIR EL PLANETA QUE QUIERES IR
            iCommon.dibujoMenuExplorar(planetas, naves);
            int opcion = Integer.parseInt(sc.nextLine());
            switch (opcion) {
                case 1:
                    planeta(planetas, naves, laboratorio, 0);
                    break;
                case 2:
                    // COMPROBAR QUE EL PLANETA 1 NO TIENE EXTRATERRESTRES
                    if (!planetas.get(0).getEstraterrestrePlaneta().isEmpty()) {
                        System.out.println("CONQUISTA EL PLANETA " + planetas.get(0).getNombre() + "\n");
                    } else {
                        planeta(planetas, naves, laboratorio, 1);
                    }
                    break;
                case 3:
                    // COMPROBAR QUE EL PLANETA 1 NO TIENE EXTRATERRESTRES
                    if (!planetas.get(0).getEstraterrestrePlaneta().isEmpty()) {
                        System.out.println("CONQUISTA EL PLANETA " + planetas.get(0).getNombre() + "\n");
                        // COMPROBAR QUE EL PLANETA 2 NO TIENE EXTRATERRESTRES
                    } else if (!planetas.get(1).getEstraterrestrePlaneta().isEmpty()) {
                        System.out.println("CONQUISTA EL PLANETA " + planetas.get(1).getNombre() + "\n");
                    } else {
                        planeta(planetas, naves, laboratorio, 2);
                    }
                    break;
                case 4:
                    System.out.println("VOLVEMOS A CASA");
                    return;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                    break;
            }

            if (seguirExplorando) {
                System.out.println("¿QUIERES SEGUIR EXPLORANDO?");
                System.out.println("1.SI   2.NO\n");
                int seguir = Integer.parseInt(sc.nextLine());
                if (seguir == 2) {
                    seguirExplorando = false;
                }
            }
        } while (seguirExplorando);
    }

    // METODO PARA ACTUALIZAR LA NAVE
    public void actualizarNave(ArrayList<Nave> naves) {
        // COMPROBAR QUE LAS MONEDAS SEAN IGUAL O MAYOR QUE EL PRECIO Y EL NIVEL
        if (naves.get(0).getMoneda() >= naves.get(0).getPrecio() && naves.get(0).getNivel() == 1) {
            naves.get(0).setMoneda(naves.get(0).getMoneda() - naves.get(0).getPrecio());
            naves.get(0).setNivel(2);
            naves.get(0).setNombre("VANGUARDIA CELESTIAL");
            naves.get(0).setAtaque(20);
            naves.get(0).setDefensa(10);
            naves.get(0).setEspacioArma(4);
            naves.get(0).setEspacioMineral(5);
            naves.get(0).setEspacioPlanta(5);
            naves.get(0).setEspacioSemilla(5);
            naves.get(0).setPrecio(400);
            System.out.println("LA NAVE A SIDO ACTUALIZADA");
            System.out.println("SE TE HAN RESTADO 200 MONEDAS\n");
            // COMPROBAR QUE LAS MONEDAS SEAN IGUAL O MAYOR QUE EL PRECIO Y EL NIVEL
        } else if (naves.get(0).getMoneda() > naves.get(0).getPrecio() && naves.get(0).getNivel() == 2) {
            naves.get(0).setMoneda(naves.get(0).getMoneda() - naves.get(0).getPrecio());
            naves.get(0).setNivel(3);
            naves.get(0).setNombre("AURORA NOVA");
            naves.get(0).setAtaque(30);
            naves.get(0).setDefensa(15);
            naves.get(0).setEspacioArma(6);
            naves.get(0).setEspacioMineral(6);
            naves.get(0).setEspacioPlanta(6);
            naves.get(0).setEspacioSemilla(6);
            System.out.println("LA NAVE A SIDO ACTUALIZADA");
            System.out.println("SE TE HAN RESTADO 400 MONEDAS\n");
        } else if (naves.get(0).getNivel() == 3) {
            System.out.println("NO HAY MAS ACTUALIZACIONES\n");
        } else {
            if (naves.get(0).getNivel() == 1) {
                System.out.println("NO TIENES SUFICIENTE DINERO PARA ACTUALIZAR LA NAVE");
                System.out.println("NECESITAS 200 MONEDAS\n");
            } else {
                System.out.println("NO TIENES SUFICIENTE DINERO PARA ACTUALIZAR LA NAVE");
                System.out.println("NECESITAS 400 MONEDAS\n");
            }
        }
    }

    // MEOTODO PARA VENDER Y COMPRAR ARTICULOS
    public void comprarVender(List<Semilla> semillas, List<Arma> armas, List<Planta> plantas, List<Mineral> minerales, ArrayList<Nave> naves) {
        iCommon iCommon = new CommonImpl();
        boolean seguirEnTienda = true;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("BIENVENIDO A LA TIENDA");
            iCommon.dibujoMenuTienda(naves);
            int opcion = Integer.parseInt(sc.nextLine());
            switch (opcion) {
                case 1:
                    // ELEGIR LO QUE QUIERES COMPRAR
                    System.out.println("QUE QUIERES COMPRAR?");
                    System.out.println("----------------");
                    System.out.println("| 1. SEMILLAS  |");
                    System.out.println("| 2. ARMAS     |");
                    System.out.println("| 3. MINERALES |");
                    System.out.println("| 4. SALIR     |");
                    System.out.println("----------------");
                    int opcion1 = Integer.parseInt(sc.nextLine());
                    switch (opcion1) {
                        case 1:
                            // MOSTRAR SEMILLAS DE LA TIENDA
                            System.out.println("SEMILLAS:\n");
                            for (int i = 0; i < semillas.size(); i++) {
                                System.out.println("ID: " + semillas.get(i).getIdSemilla());
                                System.out.println("NOMBRE: " + semillas.get(i).getNombre());
                                System.out.println("ESPACIO: " + semillas.get(i).getEspacio());
                                System.out.println("NIVEL: " + semillas.get(i).getNivel());
                                System.out.println("AGUA: " + semillas.get(i).getAgua());
                                System.out.println("PRECIO: " + semillas.get(i).getPrecioCompra());
                                System.out.println("\n");
                            }
                            System.out.println("INDIQUE EL ID DE LA SEMILLA QUE QUIERE COMPRAR");
                            int idSemilla = Integer.parseInt(sc.nextLine());
                            idSemilla = idSemilla - 1;
                            // COMPROBAR EL NOVEL, EL ESPACIO Y LAS MONEDAS
                            if (naves.get(0).getNivel() < semillas.get(idSemilla).getNivel()) {
                                System.out.println("NO TIENES SUFICIENTE NIVEL\n");
                            } else if (naves.get(0).getSemillaNave().size() >= naves.get(0).getEspacioSemilla()) {
                                System.out.println("NO TIENE SUFICIENTE ESPACIO\n");
                            } else if (naves.get(0).getMoneda() < semillas.get(idSemilla).getPrecioCompra()) {
                                System.out.println("NO TIENE SUFICIENTE DINERO\n");
                            } else {
                                System.out.println("¿QUIERES COMPRARLA?");
                                System.out.println("1.SI   2.NO\n");
                                int respuesta = Integer.parseInt(sc.nextLine());
                                if (respuesta == 1) {
                                    // RESTAR EL DINERO Y TRANSFERIR LA SEMILLA
                                    naves.get(0).setMoneda(naves.get(0).getMoneda() - semillas.get(idSemilla).getPrecioCompra());
                                    naves.get(0).getSemillaNave().add(semillas.get(idSemilla));
                                    System.out.println("COMPRA REALIZADA CON EXITO\n");
                                }
                            }
                            break;
                        case 2:
                            // MOSTRAR ARMAS DE LA TIENDA
                            System.out.println("ARMAS:\n");
                            for (int i = 0; i < armas.size(); i++) {
                                System.out.println("ID: " + armas.get(i).getIdArma());
                                System.out.println("NOMBRE: " + armas.get(i).getNombre());
                                System.out.println("ESPACIO: " + armas.get(i).getEspacio());
                                System.out.println("NIVEL: " + armas.get(i).getNivel());
                                System.out.println("ATAQUE: " + armas.get(i).getAtaque());
                                System.out.println("DEFENSA: " + armas.get(i).getDefensa());
                                System.out.println("PRECIO: " + armas.get(i).getPrecioCompra());
                                System.out.println("\n");
                            }
                            System.out.println("INDIQUE EL ID DEL ARMA QUE QUIERE COMPRAR");
                            int idArma = Integer.parseInt(sc.nextLine());
                            idArma = idArma - 1;
                            // COMPROBAR EL NOVEL, EL ESPACIO Y LAS MONEDAS
                            if (naves.get(0).getNivel() < armas.get(idArma).getNivel()) {
                                System.out.println("NO TIENES SUFICIENTE NIVEL\n");
                            } else if (naves.get(0).getArmaNave().size() >= naves.get(0).getEspacioArma()) {
                                System.out.println("NO TIENE SUFICIENTE ESPACIO\n");
                            } else if (naves.get(0).getMoneda() < armas.get(idArma).getPrecioCompra()) {
                                System.out.println("NO TIENE SUFICIENTE DINERO\n");
                            } else {
                                System.out.println("¿QUIERES COMPRARLA?");
                                System.out.println("1.SI   2.NO\n");
                                int respuesta = Integer.parseInt(sc.nextLine());
                                if (respuesta == 1) {
                                    // RESTAR EL DINERO Y TRANSFERIR LA ARMA
                                    naves.get(0).setMoneda(naves.get(0).getMoneda() - armas.get(idArma).getPrecioCompra());
                                    naves.get(0).getArmaNave().add(armas.get(idArma));
                                    naves.get(0).setAtaque(naves.get(0).getAtaque() + armas.get(idArma).getAtaque());
                                    naves.get(0).setDefensa(naves.get(0).getDefensa() + armas.get(idArma).getDefensa());
                                    System.out.println("COMPRA REALIZADA CON EXITO\n");
                                }
                            }
                            break;
                        case 3:
                            // MOSTRAR MINERALES DE LA TIENDA
                            System.out.println("MINERALES:\n");
                            for (int i = 0; i < minerales.size(); i++) {
                                System.out.println("ID: " + minerales.get(i).getIdMineral());
                                System.out.println("NOMBRE: " + minerales.get(i).getNombre());
                                System.out.println("ESPACIO: " + minerales.get(i).getEspacio());
                                System.out.println("NIVEL: " + minerales.get(i).getNivel());
                                System.out.println("COMBUSTIBLE: " + minerales.get(i).getCombustible());
                                System.out.println("PRECIO: " + minerales.get(i).getPrecioCompra());
                                System.out.println("\n");
                            }
                            System.out.println("INDIQUE EL ID DEL MINERAL QUE QUIERE COMPRAR");
                            int idMineral = Integer.parseInt(sc.nextLine());
                            idMineral = idMineral - 1;
                            // COMPROBAR EL NOVEL, EL ESPACIO Y LAS MONEDAS
                            if (naves.get(0).getNivel() < minerales.get(idMineral).getNivel()) {
                                System.out.println("NO TIENES SUFICIENTE NIVEL\n");
                            } else if (naves.get(0).getMineralNave().size() >= naves.get(0).getEspacioMineral()) {
                                System.out.println("NO TIENE SUFICIENTE ESPACIO\n");
                            } else if (naves.get(0).getMoneda() < minerales.get(idMineral).getPrecioCompra()) {
                                System.out.println("NO TIENE SUFICIENTE DINERO\n");
                            } else {
                                System.out.println("¿QUIERES COMPRARLA?");
                                System.out.println("1.SI   2.NO\n");
                                int respuesta = Integer.parseInt(sc.nextLine());
                                if (respuesta == 1) {
                                    // RESTAR EL DINERO Y TRANSFERIR EL MINERAL
                                    naves.get(0).setMoneda(naves.get(0).getMoneda() - minerales.get(idMineral).getPrecioCompra());
                                    naves.get(0).getMineralNave().add(minerales.get(idMineral));
                                    System.out.println("COMPRA REALIZADA CON EXITO\n");
                                }
                            }
                            break;
                        case 4:
                            System.out.println("GRACIAS POR COMPRAR\n");
                            break;
                        default:
                            System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                            break;
                    }
                    break;
                case 2:
                    // COMPROBAR SI TIENES PLANTAS
                    if (naves.get(0).getPlantaNave().isEmpty()) {
                        System.out.println("NO TIENES PLANTAS PARA VENDER\n");
                    } else {
                        System.out.println("¿QUE PLANTA QUIERES VENDER?\n");
                        System.out.println("PLANTAS:\n");
                        // MOSTRAR LAS PLANTAS
                        for (int i = 0; i < naves.get(0).getPlantaNave().size(); i++) {
                            System.out.println((i + 1) + ". " + naves.get(0).getPlantaNave().get(i).getNombre());
                            System.out.println("PRECIO: " + naves.get(0).getPlantaNave().get(i).getPrecioVenta());
                            System.out.println("\n");
                        }
                        System.out.println("INDIQUE LA PLANTA QUE QUIERE VENDER");
                        int idPlanta = Integer.parseInt(sc.nextLine());
                        idPlanta = idPlanta - 1;
                        System.out.println("¿QUIERES VENDERLA?");
                        System.out.println("1.SI   2.NO\n");
                        int respuesta = Integer.parseInt(sc.nextLine());
                        if (respuesta == 1) {
                            // SUMAR EL DINERO Y ELIMINAR LA PLANTA
                            naves.get(0).setMoneda(naves.get(0).getMoneda() + plantas.get(idPlanta).getPrecioVenta());
                            naves.get(0).getPlantaNave().remove(plantas.get(idPlanta));
                            System.out.println("VENTA REALIZADA CON EXITO.\n");
                        }
                    }
                    break;
                case 3:
                    actualizarNave(naves);
                    break;
                case 4:
                    System.out.println("SALISTE DE LA TIENDA");
                    seguirEnTienda = false;
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                    break;
            }
            if (seguirEnTienda) {
                System.out.println("¿QUIERES SEGUIR EN LA TIENDA?");
                System.out.println("1.SI   2.NO\n");
                int seguir = Integer.parseInt(sc.nextLine());
                if (seguir == 2) {
                    seguirEnTienda = false;
                }
            }
        } while (seguirEnTienda);

    }

    // METODO PARA PODER ELEGIR DE QUE OBJETO QUIERES RELLENAR LA LISTA PARA LUEGO UTILIZARLO EN EL METODO DEJAROBJETO
    public List<?> objetosTipo(Object objeto, String tipoObjeto) {
        // CREAR UN OBJETO SIN DETERMINAR DE QUE TIPO DE OBJETO ES Y SE DECLARA NULO
        List<?> objetos = null;
        // VERIFICAR SI EL OBJETO ES UNA INSTANCIA DE LA CLASE NAVE Y LE PASAMOS EL TIPO DE OBJETO QUE ES
        if (objeto instanceof Nave) {
            Nave nave = (Nave) objeto;
            switch (tipoObjeto) {
                case "semilla":
                    objetos = nave.getSemillaNave();
                    break;
                case "planta":
                    objetos = nave.getPlantaNave();
                    break;
                case "mineral":
                    objetos = nave.getMineralNave();
                    break;
                case "arma":
                    objetos = nave.getArmaNave();
                    break;
                default:
                    break;
            }
            // VERIFICAR SI EL OBJETO ES UNA INSTANCIA DE LA CLASE LABORATORIO Y LE PASAMOS EL TIPO DE OBJETO QUE ES
        } else if (objeto instanceof Laboratorio) {
            Laboratorio laboratorio = (Laboratorio) objeto;
            switch (tipoObjeto) {
                case "semilla":
                    objetos = laboratorio.getSemillaLaboratorio();
                    break;
                case "planta":
                    objetos = laboratorio.getPlantaLaboratorio();
                    break;
                case "mineral":
                    objetos = laboratorio.getMineralLaboratorio();
                    break;
                case "arma":
                    objetos = laboratorio.getArmaLaboratorio();
                    break;
                default:
                    break;
            }
        }
        return objetos;
    }

    // METODO PARA DEJAR OBJETOS EN EL ALMACEN
    public void dejarObjeto(Laboratorio laboratorio, ArrayList<Nave> naves, String tipoObjeto) {
        Scanner sc = new Scanner(System.in);
        Nave nave = naves.get(0);
        // OBTENER LA LISTA DEL OFJETO ESPECIFICADO
        List<?> objetoNave = objetosTipo(nave, tipoObjeto);
        // COMPROBAR SI EL OBEJETO NO ESTA VACIO
        if (!objetoNave.isEmpty()) {
            System.out.println("SELECCIONA EL QUE QUIERES DEJAR\n ");
            // VERIFICAR TIPO DE OBJETO CON EL INSTANCEOF
            for (int i = 0; i < objetoNave.size(); i++) {
                Object obj = objetoNave.get(i);
                if (obj instanceof Semilla) {
                    Semilla semilla = (Semilla) obj;
                    System.out.println((i + 1) + ". " + semilla.getNombre());
                } else if (obj instanceof Planta) {
                    Planta planta = (Planta) obj;
                    System.out.println((i + 1) + ". " + planta.getNombre());
                } else if (obj instanceof Mineral) {
                    Mineral mineral = (Mineral) obj;
                    System.out.println((i + 1) + ". " + mineral.getNombre());
                } else if (obj instanceof Arma) {
                    Arma arma = (Arma) obj;
                    System.out.println((i + 1) + ". " + arma.getNombre());
                }
            }
            int indiceObjeto = Integer.parseInt(sc.nextLine());
            Object objetoDejar = objetoNave.get(indiceObjeto - 1);
            // CON EL OBJETO ELEGIDO HACEMOS LO QUE CORRESPONDA
            if (objetoDejar instanceof Semilla) {
                Semilla semillaDejar = (Semilla) objetoDejar;
                laboratorio.getSemillaLaboratorio().add(semillaDejar);
                objetoNave.remove(objetoDejar);
                System.out.println("SE HA ALMACENADO CORRECTAMENTE\n");
            } else if (objetoDejar instanceof Planta) {
                Planta plantaDejar = (Planta) objetoDejar;
                laboratorio.getPlantaLaboratorio().add(plantaDejar);
                objetoNave.remove(objetoDejar);
                System.out.println("SE HA ALMACENADO CORRECTAMENTE\n");
            } else if (objetoDejar instanceof Mineral) {
                Mineral mineralDejar = (Mineral) objetoDejar;
                laboratorio.getMineralLaboratorio().add(mineralDejar);
                objetoNave.remove(objetoDejar);
                System.out.println("SE HA ALMACENADO CORRECTAMENTE\n");
            } else if (objetoDejar instanceof Arma) {
                Arma armaDejar = (Arma) objetoDejar;
                laboratorio.getArmaLaboratorio().add(armaDejar);
                nave.setDefensa(nave.getDefensa() - nave.getArmaNave().get(indiceObjeto - 1).getDefensa());
                nave.setAtaque(nave.getAtaque() - nave.getArmaNave().get(indiceObjeto - 1).getAtaque());
                objetoNave.remove(objetoDejar);
                System.out.println("SE HA ALMACENADO CORRECTAMENTE\n");
            } else {
                System.out.println("NO SE PUEDE DEJAR EL OBJETO EN EL ALMACEN\n");
            }
        } else {
            System.out.println("NO TIENES " + tipoObjeto.toUpperCase() + "S PARA DEJAR EN EL ALMACEN\n");
        }
    }

    // METODO PARA DEJAR AGUA
    public void dejarAgua(Laboratorio laboratorio, ArrayList<Nave> naves) {
        Nave nave = naves.get(0);
        // COMPROBAR QUE EL AGUA DE LA NAVE NO ES 0
        if (nave.getAgua() != 0) {
            // TRANFERIR EL AGUA AL LABORATORIO
            laboratorio.setAgua(laboratorio.getAgua() + nave.getAgua());
            nave.setAgua(0);
            System.out.println("EL AGUA SE HA ALMACENADO EN EL LABORATORIO CORRECTAMENTE\n");
        } else {
            System.out.println("NO TIENES AGUA PARA DEJAR EN EL ALMACEN\n");
        }
    }

    // METODO PARA SACAR OBJETOS DEL ALMACEN
    public void sacarObjeto(Laboratorio laboratorio, ArrayList<Nave> naves, String tipoObjeto) {
        Scanner sc = new Scanner(System.in);
        Nave nave = naves.get(0);
        // OBTENER LA LISTA DEL OFJETO ESPECIFICADO
        List<?> objetoLaboratorio = objetosTipo(laboratorio, tipoObjeto);
        // COMPROBAR SI EL OBEJETO NO ESTA VACIO
        if (!objetoLaboratorio.isEmpty()) {
            System.out.println("SELECCIONE EL QUE QUIERES SACAR\n ");
            // VERIFICAR TIPO DE OBJETO CON EL INSTANCEOF
            for (int i = 0; i < objetoLaboratorio.size(); i++) {
                Object obj = objetoLaboratorio.get(i);
                if (obj instanceof Semilla) {
                    Semilla semilla = (Semilla) obj;
                    System.out.println((i + 1) + ". " + semilla.getNombre());
                    System.out.println(semilla.getEspacio());
                } else if (obj instanceof Planta) {
                    Planta planta = (Planta) obj;
                    System.out.println((i + 1) + ". " + planta.getNombre());
                } else if (obj instanceof Arma) {
                    Arma arma = (Arma) obj;
                    System.out.println((i + 1) + ". " + arma.getNombre());
                }
            }
            int indiceObjeto = Integer.parseInt(sc.nextLine());
            indiceObjeto = indiceObjeto - 1;
            Object objetoCojer = objetoLaboratorio.get(indiceObjeto);
            // CON EL OBJETO ELEGIDO HACEMOS LO QUE CORRESPONDA
            if (objetoCojer instanceof Semilla) {
                Semilla semillaDejar = (Semilla) objetoCojer;
                if (nave.getSemillaNave().size() < nave.espacioSemilla) {
                    nave.getSemillaNave().add(semillaDejar);
                    objetoLaboratorio.remove(objetoCojer);
                    System.out.println("LA SEMILLA SE HA ALMACENADO EN LA NAVE CORRECTAMENTE");
                } else {
                    System.out.println("NO TIENES ESPACIO EN LA NAVE");
                }
            } else if (objetoCojer instanceof Planta) {
                Planta plantaDejar = (Planta) objetoCojer;
                if (nave.getPlantaNave().size() < nave.espacioPlanta) {
                    nave.getPlantaNave().add(plantaDejar);
                    objetoLaboratorio.remove(objetoCojer);
                    System.out.println("LA PLANTA SE HA ALMACENADO EN LA NAVE CORRECTAMENTE");
                } else {
                    System.out.println("NO TIENES ESPACIO EN LA NAVE");
                }
            } else if (objetoCojer instanceof Arma) {
                Arma armaDejar = (Arma) objetoCojer;
                if (nave.getArmaNave().size() < nave.espacioArma) {
                    nave.getArmaNave().add(armaDejar);
                    nave.setDefensa(nave.getDefensa() + nave.getArmaNave().get(indiceObjeto).getDefensa());
                    nave.setAtaque(nave.getAtaque() + nave.getArmaNave().get(indiceObjeto).getAtaque());
                    objetoLaboratorio.remove(objetoCojer);
                    System.out.println("EL ARMA SE HA ALMACENADO EN LA NAVE CORRECTAMENTE");
                } else {
                    System.out.println("NO TIENES ESPACIO EN LA NAVE");
                }
            } else {
                System.out.println("NO SE PUEDE DEJAR EL OBJETO EN EL ALMACEN");
            }
        } else {
            System.out.println("NO TIENES " + tipoObjeto.toUpperCase() + "S PARA SACAR DEL ALMACEN\n");
        }

    }

    // METODO PARA SACAR COMBUSTIBLE
    public void sacarCombustible(Laboratorio laboratorio, ArrayList<Nave> naves) {
        Nave nave = naves.get(0);
        // COMPROBAR SI EL COMBUSTIBLE NO ES 0
        if (laboratorio.getCombustible() != 0) {
            // TRANSFERIR EL COMBUSTIBLE A LA NAVE
            nave.setCombustible(nave.getCombustible() + laboratorio.getCombustible());
            laboratorio.setCombustible(0);
            System.out.println("EL COMBUSTIBLE SE HA ALMACENADO EN LA NAVE CORRECTAMENTE\n");
        } else {
            System.out.println("NO TIENES COMBUSTIBLE PARA SACAR DEL ALMACEN\n");
        }
    }

    // METODO PARA VER EL ALMACEN DEL LABORATORIO
    public void almacen(Laboratorio laboratorio, ArrayList<Nave> naves) {
        iCommon iCommon = new CommonImpl();
        boolean seguirEnAlmacen = true;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("ESTAMOS EN EL ALMACEN");
            System.out.println("¿QUE QUIERES HACER?");
            iCommon.dibujoMenuAlmacen();
            int opcion = Integer.parseInt(sc.nextLine());
            switch (opcion) {
                case 1:
                    System.out.println("¿EL ALMACENAMIENTO DE QUE OBJETO QUIERES VER?");
                    iCommon.dibujoMenuAlmacenObjetos();
                    int opcion1 = Integer.parseInt(sc.nextLine());
                    switch (opcion1) {
                        case 1:
                            if (laboratorio.getSemillaLaboratorio().isEmpty()) {
                                System.out.println("NO TIENES NINGUNA SEMILLA\n");
                            } else {
                                for (int i = 0; i < laboratorio.getSemillaLaboratorio().size(); i++) {
                                    System.out.println("NOMBRE: " + laboratorio.getSemillaLaboratorio().get(i).getNombre());
                                    System.out.println("ESPACIO: " + laboratorio.getSemillaLaboratorio().get(i).getEspacio());
                                    System.out.println("AGUA: " + laboratorio.getSemillaLaboratorio().get(i).getAgua());
                                    System.out.println("\n");
                                }
                            }
                            break;
                        case 2:
                            if (laboratorio.getPlantaLaboratorio().isEmpty()) {
                                System.out.println("NO TIENES NINGUNA PLANTA\n");
                            } else {
                                for (int i = 0; i < laboratorio.getPlantaLaboratorio().size(); i++) {
                                    System.out.println("NOMBRE: " + laboratorio.getPlantaLaboratorio().get(i).getNombre());
                                    System.out.println("ESPACIO: " + laboratorio.getPlantaLaboratorio().get(i).getEspacio());
                                    System.out.println("AGUA: " + laboratorio.getPlantaLaboratorio().get(i).getAgua());
                                    System.out.println("CANTIDAD RIEGO: " + laboratorio.getPlantaLaboratorio().get(i).getCantidadRiego());
                                    System.out.println("PRECIO VENTA: " + laboratorio.getPlantaLaboratorio().get(i).getPrecioVenta());
                                    System.out.println("\n");
                                }
                            }
                            break;
                        case 3:
                            if (laboratorio.getMineralLaboratorio().isEmpty()) {
                                System.out.println("NO TIENES NINGUN MINERAL\n");
                            } else {
                                for (int i = 0; i < laboratorio.getMineralLaboratorio().size(); i++) {
                                    System.out.println("NOMBRE: " + laboratorio.getMineralLaboratorio().get(i).getNombre());
                                    System.out.println("ESPACIO: " + laboratorio.getMineralLaboratorio().get(i).getEspacio());
                                    System.out.println("ESPACIO: " + laboratorio.getMineralLaboratorio().get(i).getEspacio());
                                    System.out.println("COMBUSTIBLE: " + laboratorio.getMineralLaboratorio().get(i).getCombustible());
                                    System.out.println("\n");
                                }
                            }
                            break;
                        case 4:
                            if (laboratorio.getCombustible() == 0) {
                                System.out.println("NO TIENES COMBUSTIBLE\n");
                            } else {
                                System.out.println("COMBUSTIBLE: " + laboratorio.getCombustible());
                            }
                            break;
                        case 5:
                            if (laboratorio.getArmaLaboratorio().isEmpty()) {
                                System.out.println("NO TIENES NINGUNA ARMA\n");
                            } else {
                                for (int i = 0; i < laboratorio.getArmaLaboratorio().size(); i++) {
                                    System.out.println("NOMBRE: " + laboratorio.getArmaLaboratorio().get(i).getNombre());
                                    System.out.println("ESPACIO: " + laboratorio.getArmaLaboratorio().get(i).getEspacio());
                                    System.out.println("DAÑOS DE ATAQUE: " + laboratorio.getArmaLaboratorio().get(i).getAtaque());
                                    System.out.println("DAÑOS DE DEFENSA: " + laboratorio.getArmaLaboratorio().get(i).getDefensa());
                                    System.out.println("\n");
                                }
                            }
                            break;
                        case 6:
                            if (laboratorio.getAgua() == 0) {
                                System.out.println("NO TIENES AGUA\n");
                            } else {
                                System.out.println("AGUA: " + laboratorio.getAgua());
                            }
                            break;
                        case 7:
                            break;
                        default:
                            System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                            break;
                    }
                    break;
                case 2:
                    System.out.println("¿QUE QUIERES DEJAR?");
                    iCommon.dibujoMenuAlmacenDejar();
                    int opcionDejar = Integer.parseInt(sc.nextLine());
                    switch (opcionDejar) {
                        case 1:
                            dejarObjeto(laboratorio, naves, "semilla");
                            break;
                        case 2:
                            dejarObjeto(laboratorio, naves, "planta");
                            break;
                        case 3:
                            dejarObjeto(laboratorio, naves, "mineral");
                            break;
                        case 4:
                            dejarObjeto(laboratorio, naves, "arma");
                            break;
                        case 5:
                            dejarAgua(laboratorio, naves);
                            break;
                        case 6:

                            break;
                        default:
                            System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                            break;
                    }
                    break;
                case 3:
                    System.out.println("¿QUE QUIERES SACAR?");
                    iCommon.dibujoMenuAlmacenSacar();
                    int opcionSacar = Integer.parseInt(sc.nextLine());
                    switch (opcionSacar) {
                        case 1:
                            sacarObjeto(laboratorio, naves, "semilla");
                            break;
                        case 2:
                            sacarObjeto(laboratorio, naves, "planta");
                            break;
                        case 3:
                            sacarCombustible(laboratorio, naves);
                            break;
                        case 4:
                            sacarObjeto(laboratorio, naves, "arma");
                            break;
                        case 5:

                            return;
                        default:
                            System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                            break;
                    }
                    break;
                case 4:
                    System.out.println("SALIENDO DEL ALMACEN");
                    seguirEnAlmacen = false;
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                    break;
            }
            if (seguirEnAlmacen) {
                System.out.println("¿QUIERES SEGUIR EN EL ALMACEN?");
                System.out.println("1.SI   2.NO\n");
                int seguir = Integer.parseInt(sc.nextLine());
                if (seguir == 2) {
                    seguirEnAlmacen = false;
                }
            }
        } while (seguirEnAlmacen);
    }

    // METODO PARA SETEAR LA PUNTUACION
    public void puntuacion(ArrayList<Nave> naves, int puntuacion) {
        naves.get(0).setPuntuacion(naves.get(0).getPuntuacion() + puntuacion);
    }

    // METODO PARA LA PUNTUACION FINAL: PUNTUACION NAVE * PUNTUACION LABORATORIO
    public void puntuacionFinal(ArrayList<Nave> naves, Laboratorio laboratorio) {
        puntuacionNave(naves);
        puntuacionLaboratorio(laboratorio, naves);
    }

    // METODO PARA SUMAR LA PUNTUACION DE LA NAVE
    public void puntuacionNave(ArrayList<Nave> naves) {
        int puntuacionTotal = 0;
        int cont1 = 0;
        int cont2 = 0;
        int cont3 = 0;
        for (int i = 0; i < naves.get(0).getMineralNave().size(); i++) {
            if (naves.get(0).getMineralNave().get(i).getNivel() == 1) {
                cont1++;
            } else if (naves.get(0).getMineralNave().get(i).getNivel() == 2) {
                cont2++;
            } else if (naves.get(0).getMineralNave().get(i).getNivel() == 3) {
                cont3++;
            }
        }
        puntuacionTotal = (cont1 * 20) + (cont2 * 40) + (cont3 * 60);
        cont1 = 0;
        cont2 = 0;
        cont3 = 0;
        for (int i = 0; i < naves.get(0).getSemillaNave().size(); i++) {
            if (naves.get(0).getSemillaNave().get(i).getNivel() == 1) {
                cont1++;
            } else if (naves.get(0).getSemillaNave().get(i).getNivel() == 2) {
                cont2++;
            } else if (naves.get(0).getSemillaNave().get(i).getNivel() == 3) {
                cont3++;
            }
        }
        puntuacionTotal = puntuacionTotal + (cont1 * 10) + (cont2 * 20) + (cont3 * 30);
        cont1 = 0;
        cont2 = 0;
        cont3 = 0;
        for (int i = 0; i < naves.get(0).getPlantaNave().size(); i++) {
            if (naves.get(0).getPlantaNave().get(i).getPrecioVenta() == 20 || naves.get(0).getPlantaNave().get(i).getPrecioVenta() == 25) {
                cont1++;
            } else if (naves.get(0).getPlantaNave().get(i).getPrecioVenta() == 30 || naves.get(0).getPlantaNave().get(i).getPrecioVenta() == 35) {
                cont2++;
            } else if (naves.get(0).getPlantaNave().get(i).getPrecioVenta() == 40 || naves.get(0).getPlantaNave().get(i).getPrecioVenta() == 45) {
                cont3++;
            }
        }
        puntuacionTotal = puntuacionTotal + (cont1 * 30) + (cont2 * 60) + (cont3 * 90);
        cont1 = 0;
        cont2 = 0;
        cont3 = 0;
        for (int i = 0; i < naves.get(0).getArmaNave().size(); i++) {
            if (naves.get(0).getArmaNave().get(i).getNivel() == 1) {
                cont1++;
            } else if (naves.get(0).getArmaNave().get(i).getNivel() == 2) {
                cont2++;
            } else if (naves.get(0).getArmaNave().get(i).getNivel() == 3) {
                cont3++;
            }
        }
        puntuacionTotal = puntuacionTotal + (cont1 * 10) + (cont2 * 20) + (cont3 * 30);
        int combustible = naves.get(0).getCombustible() * 10;
        int agua = naves.get(0).getAgua() * 5;
        puntuacionTotal = puntuacionTotal + combustible + agua;
        naves.get(0).setPuntuacion(naves.get(0).getPuntuacion() + puntuacionTotal);
    }

    // METODO PARA SUMAR LA PUNTUACION DEL LABORATORIO
    private void puntuacionLaboratorio(Laboratorio laboratorio, ArrayList<Nave> naves) {
        int puntuacionTotal = 0;
        int cont1 = 0;
        int cont2 = 0;
        int cont3 = 0;
        for (int i = 0; i < laboratorio.getMineralLaboratorio().size(); i++) {
            if (laboratorio.getMineralLaboratorio().get(i).getNivel() == 1) {
                cont1++;
            } else if (laboratorio.getMineralLaboratorio().get(i).getNivel() == 2) {
                cont2++;
            } else if (laboratorio.getMineralLaboratorio().get(i).getNivel() == 3) {
                cont3++;
            }
        }
        puntuacionTotal = (cont1 * 20) + (cont2 * 40) + (cont3 * 60);
        cont1 = 0;
        cont2 = 0;
        cont3 = 0;
        for (int i = 0; i < laboratorio.getSemillaLaboratorio().size(); i++) {
            if (laboratorio.getSemillaLaboratorio().get(i).getNivel() == 1) {
                cont1++;
            } else if (laboratorio.getSemillaLaboratorio().get(i).getNivel() == 2) {
                cont2++;
            } else if (laboratorio.getSemillaLaboratorio().get(i).getNivel() == 3) {
                cont3++;
            }
        }
        puntuacionTotal = puntuacionTotal + (cont1 * 10) + (cont2 * 20) + (cont3 * 30);
        cont1 = 0;
        cont2 = 0;
        cont3 = 0;
        for (int i = 0; i < laboratorio.getPlantaLaboratorio().size(); i++) {
            if (laboratorio.getPlantaLaboratorio().get(i).getPrecioVenta() == 20 || laboratorio.getPlantaLaboratorio().get(i).getPrecioVenta() == 25) {
                cont1++;
            } else if (laboratorio.getPlantaLaboratorio().get(i).getPrecioVenta() == 30 || laboratorio.getPlantaLaboratorio().get(i).getPrecioVenta() == 35) {
                cont2++;
            } else if (laboratorio.getPlantaLaboratorio().get(i).getPrecioVenta() == 40 || laboratorio.getPlantaLaboratorio().get(i).getPrecioVenta() == 45) {
                cont3++;
            }
        }
        puntuacionTotal = puntuacionTotal + (cont1 * 30) + (cont2 * 60) + (cont3 * 90);
        cont1 = 0;
        cont2 = 0;
        cont3 = 0;
        for (int i = 0; i < laboratorio.getArmaLaboratorio().size(); i++) {
            if (laboratorio.getArmaLaboratorio().get(i).getNivel() == 1) {
                cont1++;
            } else if (laboratorio.getArmaLaboratorio().get(i).getNivel() == 2) {
                cont2++;
            } else if (laboratorio.getArmaLaboratorio().get(i).getNivel() == 3) {
                cont3++;
            }
        }
        puntuacionTotal = puntuacionTotal + (cont1 * 10) + (cont2 * 20) + (cont3 * 30);
        int combustible = laboratorio.getCombustible() * 10;
        int agua = laboratorio.getAgua() * 5;
        puntuacionTotal = puntuacionTotal + combustible + agua;
        naves.get(0).setPuntuacion(naves.get(0).getPuntuacion() + puntuacionTotal);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nave{idNave= ").append(idNave);
        sb.append(", nombre= ").append(nombre);
        sb.append(", nivel= ").append(nivel);
        sb.append(", piloto= ").append(piloto);
        sb.append(", moneda= ").append(moneda);
        sb.append(", ataque= ").append(ataque);
        sb.append(", defensa= ").append(defensa);
        sb.append(", agua= ").append(agua);
        sb.append(", combustible= ").append(combustible);
        sb.append(", precio= ").append(precio);
        sb.append(", puntuacion= ").append(puntuacion);
        sb.append(", espacioArmas= ").append(espacioArma);
        sb.append(", espacioMineral= ").append(espacioMineral);
        sb.append(", espacioSemilla= ").append(espacioSemilla);
        sb.append(", espacioPlanta= ").append(espacioPlanta);
        sb.append(", semillaNave= ").append(semillaNave);
        sb.append(", plantaNave= ").append(plantaNave);
        sb.append(", mineralNave= ").append(mineralNave);
        sb.append(", armaNave= ").append(armaNave);
        sb.append('}');
        return sb.toString();
    }

}
