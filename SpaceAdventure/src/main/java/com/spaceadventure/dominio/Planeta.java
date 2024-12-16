/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.spaceadventure.dominio;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alumno Mañana
 */
public class Planeta {
    
    // Conjunto de propiedades
    private int idPlaneta;
    private String nombre;
    private int nivel;
    private int moneda;
    private int agua;
    private List<Extraterrestre> estraterrestrePlaneta;
    
    //Contador para el ID del entrenador
    private static int contID = 0;
    
    // Constructores
    
    public Planeta(){
        this.idPlaneta = contID++;
    }
    
    public Planeta(int idPlaneta){
        this.idPlaneta = idPlaneta;
    }
    
    public Planeta(String nombre, int nivel){
        this();
        this.nivel = nivel;
    }
    
    public Planeta(int idPlaneta, String nombre, int nivel, int moneda, int agua){
        this.idPlaneta = idPlaneta;
        this.nombre = nombre;
        this.nivel = nivel;
        this.moneda = moneda;
        this.agua = agua;
    }

    public Planeta(String nombre, int nivel, int moneda, int agua, List<Extraterrestre> estraterrestrePlaneta) {
        this();
        this.nombre = nombre;
        this.nivel = nivel;
        this.moneda = moneda;
        this.agua = agua;
        this.estraterrestrePlaneta = estraterrestrePlaneta;
    }
    
    public Planeta(int idPlaneta, String nombre,  int nivel, int moneda, int agua, List<Extraterrestre> estraterrestrePlaneta) {
        this.idPlaneta = idPlaneta;
        this.nombre = nombre;
        this.nivel = nivel;
        this.moneda = moneda;
        this.agua = agua;
        this.estraterrestrePlaneta = estraterrestrePlaneta;
    }
    
    //Getter & Setter
    public int getIdPlaneta() {
        return idPlaneta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Extraterrestre> getEstraterrestrePlaneta() {
        return estraterrestrePlaneta;
    }

    public void setEstraterrestrePlaneta(List<Extraterrestre> estraterrestrePlaneta) {
        this.estraterrestrePlaneta = estraterrestrePlaneta;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
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
       
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Planeta{idPlaneta= ").append(idPlaneta);
        sb.append(", nombre= ").append(nombre);
        sb.append(", nivel= ").append(nivel);
        sb.append(", moneda= ").append(moneda);
        sb.append(", agua= ").append(agua);
        sb.append(", estraterrestrePlaneta= ").append(estraterrestrePlaneta);
        sb.append('}');
        return sb.toString();
    }
    
    
}
