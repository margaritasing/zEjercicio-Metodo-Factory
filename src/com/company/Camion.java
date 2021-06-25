package com.company;


public class Camion extends Vehiculo implements IVehiculo{

    public Camion() {
    }

    public Camion(String patente, String marca, Integer anio) {
        super(patente, marca, anio);
    }

    @Override
    public void acelerar() {
        System.out.println("soy un camión que cada vez va más rápido");
    }

    @Override
    public void frenar() {
        System.out.println("soy un camión frenando");
    }
}