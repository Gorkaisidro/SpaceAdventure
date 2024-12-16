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
public class Semilla extends Item {
    
    // Conjunto de propiedades
    private int idSemilla;
    private int agua;
    private int nivel;
    private int precioCompra;
    
    // Contructores
    public Semilla(){
        super();
    }
    
    public Semilla(int idSemilla){
        this.idSemilla = idSemilla;
    }
    
    public Semilla(String nombre, int espacio, int idSemilla, int agua, int nivel, int precioCompra){
        super(nombre, espacio);
        this.idSemilla = idSemilla;
        this.agua = agua;
        this.nivel = nivel;
        this.precioCompra = precioCompra;
    }
    
    public Semilla(int idItem, String nombre, int espacio, int idSemilla, int agua, int nivel, int precioCompra){
        super(idItem, nombre, espacio);
        this.idSemilla = idSemilla;
        this.agua = agua;
        this.nivel = nivel;
        this.precioCompra = precioCompra;
    }

    // Getter & Setter
    public int getIdSemilla() {
        return idSemilla;
    }

    public void setIdSemilla(int idSemilla) {
        this.idSemilla = idSemilla;
    }
    
    public int getAgua() {
        return agua;
    }

    public void setAgua(int agua) {
        this.agua = agua;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
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
        sb.append("Semilla{idItems= ").append(idItem);
        sb.append(", nombre= ").append(nombre);
        sb.append(", espacio= ").append(espacio);
        sb.append(", idSemilla= ").append(idSemilla);
        sb.append(", agua= ").append(agua);
        sb.append(", nivel= ").append(nivel);
        sb.append(", precioCompra= ").append(precioCompra);
        sb.append('}');
        return sb.toString();
    }


}
