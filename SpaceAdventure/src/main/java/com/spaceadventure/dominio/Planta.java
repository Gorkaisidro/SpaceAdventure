/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spaceadventure.dominio;

/**
 *
 * @author Gorka
 */
public class Planta extends Item {
    
    // Conjunto de propiedades
    private int idPlanta;
    private int agua;
    private int cantidadRiego;
    private int riego;
    private int precioVenta;
    
    // Constructores

    public Planta() {
        super();
    }
    
    public Planta(int idPlanta){
        this.idPlanta = idPlanta;
    }
    
    public Planta(String nombre, int espacio, int idPlanta, int agua, int cantidadRiego, int riego, int precioVenta){
        super(nombre, espacio);
        this.idPlanta = idPlanta;
        this.agua = agua;
        this.cantidadRiego = cantidadRiego;
        this.riego = riego;
        this.precioVenta = precioVenta;
    }
    
    public Planta(int idItem, String nombre, int espacio, int idPlanta, int agua, int cantidadRiego, int riego, int precioVenta){
        super(idItem, nombre, espacio);
        this.idPlanta = idPlanta;
        this.agua = agua;
        this.cantidadRiego = cantidadRiego;
        this.riego = riego;
        this.precioVenta = precioVenta;
    }
    
    // Getter & Setter
    public int getIdPlanta() {
        return idPlanta;
    }

    public void setIdPlanta(int idPlanta) {
        this.idPlanta = idPlanta;
    }
    
    public int getAgua() {
        return agua;
    }

    public void setAgua(int agua) {
        this.agua = agua;
    }

    public int getCantidadRiego() {
        return cantidadRiego;
    }

    public void setCantidadRiego(int cantidadRiego) {
        this.cantidadRiego = cantidadRiego;
    }

    public int getRiego() {
        return riego;
    }

    public void setRiego(int riego) {
        this.riego = riego;
    }
    
    public int getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(int precioVenta) {
        this.precioVenta = precioVenta;
    }
    
    

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Planta{idItems= ").append(idItem);
        sb.append(", nombre= ").append(nombre);
        sb.append(", espacio= ").append(espacio);
        sb.append(", idPlanta= ").append(idPlanta);
        sb.append(", agua= ").append(agua);
        sb.append(", cantidadRiego= ").append(cantidadRiego);
        sb.append(", riego= ").append(riego);
        sb.append(", precioVenta= ").append(precioVenta);
        sb.append('}');
        return sb.toString();
    }



}
