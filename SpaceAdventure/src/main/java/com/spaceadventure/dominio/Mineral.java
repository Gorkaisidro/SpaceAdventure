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
public class Mineral extends Item{
    
    // Conjunto de propiedades
    private int idMineral;
    private int nivel;
    private int combustible;
    private int precioCompra;
    
    public Mineral() {
        super();
    }
    
    public Mineral(int idMineral) {
        this.idMineral = idMineral;
    }
    
    public Mineral(int idMineral, int idItem) {
        this.idMineral = idMineral;
        this.idItem = idItem;
    }
        
    public Mineral(int idMineral, int nivel, int combustible, int precioCompra){
        this.idMineral = idMineral;
        this.nivel = nivel;
        this.combustible = combustible;
        this.precioCompra = precioCompra;
    }
    
    public Mineral(String nombre, int espacio, int idMineral, int nivel, int combustible, int precioCompra){
        super(nombre, espacio);
        this.idMineral = idMineral;
        this.nivel = nivel;
        this.combustible = combustible;
        this.precioCompra = precioCompra;
    }
    
    public Mineral(int idItem, String nombre, int espacio, int idMineral, int nivel, int combustible, int precioCompra){
        super(idItem, nombre, espacio);
        this.idMineral = idMineral;
        this.nivel = nivel;
        this.combustible = combustible;
        this.precioCompra = precioCompra;
    }

    public Mineral(int idItem, String nombre, int espacio) {
        super(idItem, nombre, espacio);
    }
    
    //Getter & Setter
    public int getIdMineral() {
        return idMineral;
    }

    public void setIdMineral(int idMineral) {
        this.idMineral = idMineral;
    }
    
    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getCombustible() {
        return combustible;
    }

    public void setCombustible(int combustible) {
        this.combustible = combustible;
    }

    public int getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(int precioCompra) {
        this.precioCompra = precioCompra;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Mineral{idItem= ").append(idItem);
        sb.append(", nombre= ").append(nombre);
        sb.append(", espacio= ").append(espacio);
        sb.append(", idMineral= ").append(idMineral);
        sb.append(", nivel=").append(nivel);
        sb.append(", combustible=").append(combustible);
        sb.append(", precioCompra=").append(precioCompra);
        sb.append('}');
        return sb.toString();
    }


    
}
