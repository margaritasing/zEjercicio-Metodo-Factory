package com.company;

public interface IVehiculo {

    void acelerar();
    void frenar();

    String getPatente();
    void setPatente(String patente);

    void actualizarDatos(String patente, String marca, Integer anio);
}