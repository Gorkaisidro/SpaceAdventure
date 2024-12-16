/*
 * 
 */
package com.spaceadventure.dominio;

/**
 *
 * @author Alumno Mañana
 */
public class Item {
    
    // Conjunto de propiedades
    protected int idItem;
    protected String nombre;
    protected int espacio;
    
    // Contador para el ID del pokemon
    private static int contID = 0;

    // Constructores
    public Item(){
        this.idItem = contID++;
    }
    
    public Item(int idItems){
        this.idItem = contID++;
    }
    
    public Item(String nombre) {
        this();
        this.nombre = nombre;
    }
    
    public Item(int idItems, String nombre) {
        this.idItem = idItems;
        this.nombre = nombre;
    }
    
    public Item(String nombre, int espacio) {
        this();
        this.nombre = nombre;
        this.espacio = espacio;
    }

    public Item(int idItems, String nombre, int espacio) {
        this.idItem = idItems;
        this.nombre = nombre;
        this.espacio = espacio;
    }
    
    // Getter & Setter
    public int getIdItems() {
        return idItem;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEspacio() {
        return espacio;
    }

    public void setEspacio(int espacio) {
        this.espacio = espacio;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Items{idItem=").append(idItem);
        sb.append(", nombre=").append(nombre);
        sb.append(", espacio=").append(espacio);
        sb.append('}');
        return sb.toString();
    }
    
}
