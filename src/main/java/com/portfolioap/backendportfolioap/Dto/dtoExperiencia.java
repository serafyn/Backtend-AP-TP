package com.portfolioap.backendportfolioap.Dto;

import javax.validation.constraints.NotBlank;

public class dtoExperiencia {

    @NotBlank
    private String nombreE;
    @NotBlank
    private String descripcionE;

    //Constructor
    public dtoExperiencia() {
    }

    public dtoExperiencia(String nombreE, String descripcionE) {
        this.nombreE = nombreE;
        this.descripcionE = descripcionE;
    }
    //Getters & Setters

    public String getNombreE() {
        return nombreE;
    }

    public void setNombreE(String nombreE) {
        this.nombreE = nombreE;
    }

    public String getDescripcionE() {
        return descripcionE;
    }

    public void setDescripcionE(String descripcionE) {
        this.descripcionE = descripcionE;
    }

}
