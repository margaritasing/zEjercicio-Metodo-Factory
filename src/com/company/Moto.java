package com.company;


public class Moto extends Vehiculo implements IVehiculo{

    public Moto() {
    }

    public Moto(String patente, String marca, Integer anio) {
        super(patente, marca, anio);
    }

    @Override
    public void acelerar() {
        System.out.println("acelera y acelera");
    }

    @Override
    public void frenar() {
        System.out.println("frena que te frena");
    }
}