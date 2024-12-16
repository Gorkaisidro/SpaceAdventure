/*
 * 
 */
package com.spaceadventure.dominio;


/**
 *
 * @author Alumno Mañana
 */
public class Extraterrestre {
    
    // Conjunto de propiedades
    private int idExtraterrestre;
    private String nombre;
    private int nivel;
    private int defensa;
    private int ataque;
    private int moneda;
    private int agua;
    private Mineral mineral;
    
    
    //Contador para el ID del entrenador
    private static int contID = 0;
    
    public Extraterrestre(){
        this.idExtraterrestre = contID++;
    }
    
    public Extraterrestre(int idEstraterrestre){
        this.idExtraterrestre = idEstraterrestre;
    }
    
    public Extraterrestre(String nombre, int nivel, int defensa, int ataque, int moneda, int agua, Mineral mineral){
        this();
        this.nombre = nombre;
        this.nivel = nivel;
        this.defensa = defensa;
        this.ataque = ataque;
        this.moneda = moneda;
        this.agua = agua;
        this.mineral = mineral;
    }
    
    public Extraterrestre(int idExtraterrestre, String nombre, int nivel, int defensa, int ataque, int moneda, int agua, Mineral mineral){
        this.idExtraterrestre = idExtraterrestre;
        this.nombre = nombre;
        this.nivel = nivel;
        this.defensa = defensa;
        this.ataque = ataque;
        this.moneda = moneda;
        this.agua = agua;
        this.mineral = mineral;
    }

    // Getter & Setter
    public int getIdEstraterrestre() {
        return idExtraterrestre;
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

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getMoneda() {
        return moneda;
    }

    public void setMoneda(int moneda) {
        this.moneda = moneda;
    }

    public int getAgua() {
        return agua;
    }

    public void setAgua(int agua) {
        this.agua = agua;
    }
    
    public Mineral getMineral() {
        return mineral;
    }

    public void setMineral(Mineral mineral) {
        this.mineral = mineral;
    }

    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Extraterrestre{idExtraterrestre= ").append(idExtraterrestre);
        sb.append(", nombre= ").append(nombre);
        sb.append(", nivel= ").append(nivel);
        sb.append(", defensa= ").append(defensa);
        sb.append(", ataque= ").append(ataque);
        sb.append(", moneda= ").append(moneda);
        sb.append(", agua= ").append(agua);
        sb.append(", mineral= ").append(mineral);
        sb.append('}');
        return sb.toString();
    }


    
    
    
}
