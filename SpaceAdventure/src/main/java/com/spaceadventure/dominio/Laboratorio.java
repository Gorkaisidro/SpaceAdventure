/*
 * 
 */
package com.spaceadventure.dominio;

import com.spaceadventure.services.CommonImpl;
import com.spaceadventure.services.iCommon;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Alumno Mañana
 */
public class Laboratorio {

    // Conjunto de propiedades
    private int idLaboratorio;
    private String nombre;
    private int agua;
    private int combustible;
    private List<Semilla> semillaLaboratorio;
    private List<Semilla> semillaPlantada;
    private List<Planta> plantaLaboratorio;
    private List<Planta> plantaRegada;
    private List<Mineral> mineralLaboratorio;
    private List<Arma> armaLaboratorio;

    //Contador para el ID del laboratorio
    private static int contID = 0;

    public Laboratorio() {
        this.idLaboratorio = contID++;
    }

    public Laboratorio(int idLaboratorio) {
        this.idLaboratorio = idLaboratorio;
    }

    public Laboratorio(String nombre, int agua, int combustible, List<Semilla> semillaLaboratorio, List<Semilla> semillaPlantada, List<Planta> plantaLaboratorio, List<Planta> plantaRegada, List<Mineral> mineralLaboratorio, List<Arma> armaLaboratorio) {
        this();
        this.nombre = nombre;
        this.agua = agua;
        this.combustible = combustible;
        this.semillaLaboratorio = semillaLaboratorio;
        this.semillaPlantada = semillaPlantada;
        this.plantaLaboratorio = plantaLaboratorio;
        this.plantaRegada = plantaRegada;
        this.mineralLaboratorio = mineralLaboratorio;
        this.armaLaboratorio = armaLaboratorio;
    }

    public Laboratorio(int idLaboratorio, String nombre, int agua, int combustible, List<Semilla> semillaLaboratorio, List<Planta> plantaLaboratorio, List<Semilla> semillaPlantada, List<Planta> plantaRegada, List<Mineral> mineralLaboratorio, List<Arma> armaLaboratorio) {
        this.idLaboratorio = idLaboratorio;
        this.nombre = nombre;
        this.agua = agua;
        this.combustible = combustible;
        this.semillaLaboratorio = semillaLaboratorio;
        this.semillaPlantada = semillaPlantada;
        this.plantaLaboratorio = plantaLaboratorio;
        this.plantaRegada = plantaRegada;
        this.mineralLaboratorio = mineralLaboratorio;
        this.armaLaboratorio = armaLaboratorio;
    }

    //Getter & Setter
    public int getIdLaboratorio() {
        return idLaboratorio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public List<Semilla> getSemillaLaboratorio() {
        return semillaLaboratorio;
    }

    public void setSemillaLaboratorio(List<Semilla> semillaLaboratorio) {
        this.semillaLaboratorio = semillaLaboratorio;
    }

    public List<Semilla> getSemillaPlantada() {
        return semillaPlantada;
    }

    public void setSemillaPlantada(List<Semilla> semillaPlantada) {
        this.semillaPlantada = semillaPlantada;
    }

    public List<Planta> getPlantaLaboratorio() {
        return plantaLaboratorio;
    }

    public void setPlantaLaboratorio(List<Planta> plantaLaboratorio) {
        this.plantaLaboratorio = plantaLaboratorio;
    }

    public List<Mineral> getMineralLaboratorio() {
        return mineralLaboratorio;
    }

    public List<Planta> getPlantaRegada() {
        return plantaRegada;
    }

    public void setPlantaRegada(List<Planta> plantaRegada) {
        this.plantaRegada = plantaRegada;
    }

    public void setMineralLaboratorio(List<Mineral> mineralLaboratorio) {
        this.mineralLaboratorio = mineralLaboratorio;
    }

    public List<Arma> getArmaLaboratorio() {
        return armaLaboratorio;
    }

    public void setArmaLaboratorio(List<Arma> armaLaboratorio) {
        this.armaLaboratorio = armaLaboratorio;
    }

    // METODO PARA VER LOS OBJETOS PLANTADOS
    public void verPlantado(Laboratorio laboratorio, String tipoObjeto) {
        // COMPROBAR QUE EL STRING TIPOOBJETO SEA IGUAL QUE SEMILLA
        if (tipoObjeto.equals("semilla")) {
            // COMPROBAR QUE NO ESTE VACIA
            if (!laboratorio.getSemillaPlantada().isEmpty()) {
                // MOSTRAR LAS SEMILLAS
                for (int i = 0; i < laboratorio.getSemillaPlantada().size(); i++) {
                    System.out.println("NOMBRE: " + laboratorio.getSemillaPlantada().get(i).getNombre());
                    System.out.println("AGUA: " + laboratorio.getSemillaPlantada().get(i).getAgua());
                    System.out.println("\n");
                }
            } else {
                System.out.println("NO TIENES SEMILLAS PLANTADAS\n");
            }
        // COMPROBAR QUE EL STRING TIPOOBJETO SEA IGUAL A PLANTA
        } else if (tipoObjeto.equals("planta")) {
            // COMPROBAR QUE NO ESTE VACIA
            if (!laboratorio.getPlantaRegada().isEmpty()) {
                // MOSTRAR LAS PLANTAS
                for (int i = 0; i < laboratorio.getPlantaRegada().size(); i++) {
                    System.out.println("NOMBRE: " + laboratorio.getPlantaRegada().get(i).getNombre());
                    System.out.println("AGUA: " + laboratorio.getPlantaRegada().get(i).getAgua());
                    System.out.println("RIEGO: " + laboratorio.getPlantaRegada().get(i).getRiego() + "/" + laboratorio.getPlantaRegada().get(i).getCantidadRiego());
                    System.out.println("PRECIO VENTA: " + laboratorio.getPlantaRegada().get(i).getPrecioVenta());
                    System.out.println("\n");
                }
            } else {
                System.out.println("NO TIENES PLANTAS PLANTADAS\n");
            }
        }
    }

    //METODO PARA PLANTAR SEMILLAS
    public void plantarSemillas(List<Semilla> semillaLaboratorio, List<Semilla> semillaPlantada) {
        Scanner sc = new Scanner(System.in);
        // COMPROBAR QUE ESTA VACIO
        if (semillaLaboratorio.isEmpty()) {
            System.out.println("NO TIENES SEMILLAS PARA PLANTAR\n");
        } else {
            System.out.println("ELIGE LA SEMILLA QUE DESEAS PLANTAR");
            // MOSTRAR LAS SEMILLAS
            for (int i = 0; i < semillaLaboratorio.size(); i++) {
                System.out.println((i + 1) + ". " + semillaLaboratorio.get(i).getNombre());
            }
            int idSemilla = Integer.parseInt(sc.nextLine());
            idSemilla = idSemilla - 1;
            Semilla semillaElegida = semillaLaboratorio.get(idSemilla);
            // INSERTAR LA SEMILLA EN SEMILLASPLANTADAS
            semillaPlantada.add(semillaElegida);
            // ELIMINAR LA SEMILLA DE SEMILLASLABORATORIO
            semillaLaboratorio.remove(semillaElegida);
            System.out.println("LA SEMILLA SE HA PLANTADO CORRECTAMENTE\n");
        }
    }

    // METODO PARA REGAR PLANTAS
    public void regar(Laboratorio laboratorio, List<Planta> plantas) {
        iCommon iCommon = new CommonImpl();
        Scanner sc = new Scanner(System.in);
        System.out.println("¿QUE QUIERES REGAR?");
        iCommon.dibujoMenuTrabajarRegar();
        int opcionRegar = Integer.parseInt(sc.nextLine());
        switch (opcionRegar) {
            case 1:
                // COMPROBAR SI ESTA VACIO
                if (laboratorio.getSemillaPlantada().isEmpty()) {
                    System.out.println("NO TIENES NINGUNA SEMILLA PLANTADA\n");
                } else {
                    System.out.println("INDIQUE LA SEMILLA QUE QUIERE REGAR");
                    // MOSTRAR LAS SEMILLAS
                    for (int i = 0; i < laboratorio.getSemillaPlantada().size(); i++) {
                        System.out.println((i+1) + ". " + laboratorio.getSemillaPlantada().get(i).getNombre());
                        System.out.println("\tAGUA: " + laboratorio.getSemillaPlantada().get(i).getAgua());
                    }
                        System.out.println("\n");
                    int idSemilla = Integer.parseInt(sc.nextLine());
                    idSemilla = idSemilla - 1;
                    // COMPROBAR SI EL AGUA DEL LABORATORIO ES MAYOR O IGUAL QUE EL AGUA DE LA SEMILLA
                    if (laboratorio.getAgua() >= laboratorio.getSemillaPlantada().get(idSemilla).getAgua()) {
                        // RESTAR EL AGUA
                        laboratorio.setAgua(laboratorio.getAgua() - laboratorio.getSemillaPlantada().get(idSemilla).getAgua());
                        // METER LA SEMILLA EN UNA VARIABLE Y ELIMINARLA DEL SEMILLAPLANTADA
                        Semilla semillaEliminada = laboratorio.getSemillaPlantada().remove(idSemilla);
                        // METER EL IDSEMILLA EN UNA VARIABLE IDPLANTA
                        int idPlanta = semillaEliminada.getIdSemilla();
                        idPlanta = idPlanta - 1;
                        // CREAR UNA NUEVAPLANTA CON EL IDPLANTA
                        Planta nuevaPlanta = plantas.get(idPlanta);
                        // INSERTAR LA PLANTA EN PLANTAREGADA
                        laboratorio.getPlantaRegada().add(nuevaPlanta);
                        System.out.println("LA SEMILLA HA SIDO REGADA");
                        System.out.println("Y HA CRECIDO LA PLANTA " + nuevaPlanta.getNombre() + "\n");
                    } else {
                        System.out.println("NO TIENES AGUA SUFICIENTE PARA REGAR\n");
                    }
                }
                break;
            case 2:
                // COMPROBAR SI ESTA VACIO
                if (laboratorio.getPlantaRegada().isEmpty()) {
                    System.out.println("NO TIENES NINGUNA PLANTA\n");
                } else {
                    System.out.println("INDIQUE LA PLANTA QUE QUIERE REGAR");
                    // MOSTRAR LAS PLANTAS
                    for (int i = 0; i < laboratorio.getPlantaRegada().size(); i++){
                        System.out.println((i+1) + ". " + laboratorio.getPlantaRegada().get(i).getNombre());
                        System.out.println("\tAGUA: " + laboratorio.getPlantaRegada().get(i).getAgua());
                        System.out.println("\tRIEGO: " + laboratorio.getPlantaRegada().get(i).getRiego() + "/" + laboratorio.getPlantaRegada().get(i).getCantidadRiego());
                    }
                    int idPlanta = Integer.parseInt(sc.nextLine());
                    idPlanta = idPlanta - 1;
                    // COMPROBAR SI EL AGUA DEL LABORATORIO ES MAYOR O IGUAL QUE EL AGUA DE LA PLANTA
                    if (laboratorio.getAgua() >= laboratorio.getPlantaRegada().get(idPlanta).getAgua()) {
                        // RESTAR EL AGUA
                        laboratorio.setAgua(laboratorio.getAgua() - laboratorio.getPlantaRegada().get(idPlanta).getAgua());
                        // SUMAR UNO AL RIEGO DE LA PLANTA
                        laboratorio.getPlantaRegada().get(idPlanta).setRiego(laboratorio.getPlantaRegada().get(idPlanta).getRiego() + 1);
                        System.out.println("LA PLANTA HA SIDO REGADA\n");
                        // COMPROBAR SI LA CANTIDAD DE  RIEGO ES IGUAL AL RIEGO
                        if (laboratorio.getPlantaRegada().get(idPlanta).getCantidadRiego() == laboratorio.getPlantaRegada().get(idPlanta).getRiego()) {
                            // INSERTAR LA PLANTA EN PLANTALABORATORIO
                            laboratorio.getPlantaLaboratorio().add(laboratorio.getPlantaRegada().get(idPlanta));
                            // ELIMINAR DEL PLANTAREGADA
                            laboratorio.getPlantaRegada().remove(idPlanta);
                            System.out.println("TERMINASTE DE REGAR LA PLANTA\n");
                        }
                    } else {
                        System.out.println("NO TIENES AGUA SUFICIENTE PARA REGAR LA PLANTA");
                    }
                }
                break;
            case 3:
                System.out.println("SALIENDO DE REGAR\n");
                break;
            default:
                System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                break;
        }
    }

    // METODO PARA EXTRAER COMBUSTIBLE
    public void extraerCombustible (Laboratorio laboratorio) {
        Scanner sc = new Scanner(System.in);
        // COMPROBAR QUE ESTA VACIO
        if (mineralLaboratorio.isEmpty()) {
            System.out.println("NO TIENES MINERALES PARA EXTRAER COMBUSTIBLE\n");
        } else {
            System.out.println("ELIGE EL MINERAL DEL QUE DESEAS EXTRAER EL COMBUSTIBLE\n");
            // MOSTRAR LOS MINERALES
            for (int i=0; i < mineralLaboratorio.size(); i++) {
                System.out.println((i + 1) + ". " + mineralLaboratorio.get(i).getNombre());
                System.out.println("\tCOMBUSTIBLE: " + mineralLaboratorio.get(i).getCombustible());
            }
            int idMineral = Integer.parseInt(sc.nextLine());
            idMineral = idMineral - 1;
            Mineral mineralElegido = mineralLaboratorio.get(idMineral);
            // SETEAR COMBUSTIBLE DEL LABORATORIO
            laboratorio.setCombustible(laboratorio.getCombustible() + mineralElegido.getCombustible());
            mineralLaboratorio.remove(mineralElegido);
            System.out.println("COMBUSTIBLE EXTRAIDO\n");
            
        }
    }
    
    // METODO PARA TRABAJAR (MENU)
    public void trabajar(Laboratorio laboratorio, List<Planta> plantas) {
        iCommon iCommon = new CommonImpl();
        boolean seguirEnTrabajo = true;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("¿QUE TRABAJO QUIERES REALIZAR?");
            iCommon.dibujoMenuTrabajar();
            int opcion1 = Integer.parseInt(sc.nextLine());
            switch (opcion1) {
                case 1:
                    verPlantado(laboratorio, "semilla");
                    break;
                case 2:
                    plantarSemillas(semillaLaboratorio, semillaPlantada);
                    break;
                case 3:
                    verPlantado(laboratorio, "planta");
                    break;
                case 4:
                    regar(laboratorio, plantas);
                    break;
                case 5:
                    extraerCombustible(laboratorio);
                    break;
                case 6:
                    System.out.println("SALIENDO DE TRABAJAR");
                    return;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                    break;
            }
            if (seguirEnTrabajo) {
                System.out.println("¿QUIERES SEGUIR TRABAJANDO?");
                System.out.println("1.SI   2.NO\n");
                int seguir = Integer.parseInt(sc.nextLine());
                if (seguir == 2) {
                    seguirEnTrabajo = false;
                }
            }
        } while (seguirEnTrabajo);

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Laboratorio{idLaboratorio= ").append(idLaboratorio);
        sb.append(", nombre= ").append(nombre);
        sb.append(", agua= ").append(agua);
        sb.append(", combustible= ").append(combustible);
        sb.append(", semillaLaboratorio= ").append(semillaLaboratorio);
        sb.append(", semillaPlantada= ").append(semillaPlantada);
        sb.append(", plantaLaboratorio= ").append(plantaLaboratorio);
        sb.append(", plantaRegada= ").append(plantaRegada);
        sb.append(", mineralLaboratorio= ").append(mineralLaboratorio);
        sb.append(", armaLaboratorio= ").append(armaLaboratorio);
        sb.append('}');
        return sb.toString();
    }

}
