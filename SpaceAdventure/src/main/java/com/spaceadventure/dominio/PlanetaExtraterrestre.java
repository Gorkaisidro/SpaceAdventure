/*
 * 
 */
package com.spaceadventure.dominio;

/**
 *
 * @author Alumno Mañana
 */
public class PlanetaExtraterrestre {
    
    // Conjunto de propiedades
    private Planeta planeta = new Planeta();
    private Extraterrestre extraterrestre = new Extraterrestre();

    public PlanetaExtraterrestre() {
    }
    
    public PlanetaExtraterrestre(Planeta planeta, Extraterrestre extraterrestre) {
        this.planeta = planeta;
        this.extraterrestre = extraterrestre;
    }

    public Planeta getPlaneta() {
        return planeta;
    }

    public Extraterrestre getExtraterrestre() {
        return extraterrestre;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PlanetaExtraterrestre{");
        sb.append("planeta=").append(planeta);
        sb.append(", extraterrestre=").append(extraterrestre);
        sb.append('}');
        return sb.toString();
    }
    
    
    
    
}
