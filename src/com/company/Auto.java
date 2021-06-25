package com.company;

public class Auto extends Vehiculo implements IVehiculo{

    public Auto() {
    }

    public Auto(String patente, String marca, Integer anio) {
        super(patente, marca, anio);
    }

    @Override
    public void acelerar() {
        System.out.println("Acelero como un auto");
    }

    @Override
    public void frenar() {
        System.out.println("freno como un auto");
    }
}