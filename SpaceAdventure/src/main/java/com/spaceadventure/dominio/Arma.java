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
public class Arma extends Item {
    
    // Conjunto de propiedades
    private int idArma;
    private int nivel;
    private int ataque;
    private int defensa;
    private int precioCompra;
    
    //Constructores
    
    public Arma() {
        super();
    }
    
    public Arma(int idArma){
        this.idArma = idArma;
    }
    
    public Arma(String nombre, int espacio, int idArma, int nivel, int ataque, int defensa, int precioCompra){
        super(nombre, espacio);
        this.idArma = idArma;
        this.nivel = nivel;
        this.ataque = ataque;
        this.defensa = defensa;
        this.precioCompra = precioCompra;
    }
    
    public Arma(int idItem, String nombre, int espacio, int idArma, int nivel, int ataque, int defensa, int precioCompra){
        this.idItem = idItem;
        this.nombre = nombre;
        this.espacio = espacio;
        this.idArma = idArma;
        this.nivel = nivel;
        this.ataque = ataque;
        this.defensa = defensa;
        this.precioCompra = precioCompra;
    }
    
    // Getter & Setter
    public int getIdArma() {
        return idArma;
    }

    public void setIdArma(int idArma) {
        this.idArma = idArma;
    }
    
    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
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

    public int getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(int precioCompra) {
        this.precioCompra = precioCompra;
    }
    
    
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Arma{idItem= ").append(idItem);
        sb.append(", nombre= ").append(nombre);
        sb.append(", espacio= ").append(espacio);
        sb.append(", idArma= ").append(idArma);
        sb.append(", nivel= ").append(nivel);
        sb.append(", ataque= ").append(ataque);
        sb.append(", defensa= ").append(defensa);
        sb.append(", precio= ").append(precioCompra);
        sb.append('}');
        return sb.toString();
    }



}
