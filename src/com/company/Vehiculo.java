package com.company;

public abstract class Vehiculo implements IVehiculo{
    private String patente;
    private String marca;
    private Integer anio;

    @Override
    public void actualizarDatos(String patente, String marca, Integer anio) {
        this.patente = patente;
        this.marca = marca;
        this.anio = anio;
    }

    public Vehiculo(String patente, String marca, Integer anio) {
        this.patente = patente;
        this.marca = marca;
        this.anio = anio;
    }

    public Vehiculo() {
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "patente='" + patente + '\'' +
                ", marca='" + marca + '\'' +
                ", anio=" + anio +
                '}';
    }
}