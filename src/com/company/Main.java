package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        TipoVehiculo tipoVehiculo = TipoVehiculo.AUTO;
        IVehiculo vehiculoNuevo = VehiculoFactory.getVehiculo(tipoVehiculo);
        System.out.println("*****************************************************************");
        vehiculoNuevo.acelerar();
        vehiculoNuevo.frenar();
        System.out.println("*****************************************************************");
        vehiculoNuevo.setPatente("AA283FD");
        System.out.println("La patente es: "+vehiculoNuevo.getPatente());
        System.out.println("*****************************************************************");
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el tipo de vehiculo: (0) Moto, (1) Camion, (2) Auto");
        TipoVehiculo tipoVehiculo1 = TipoVehiculo.values()[Integer.parseInt(sc.nextLine())];
        String patente = "ASDF";
        String marca = "VW";
        Integer anio = 2029;
        IVehiculo nuevoVehiculo = VehiculoFactory.getVehiculo(tipoVehiculo1, patente, marca, anio);
        System.out.println("*****************************************************************");
        System.out.println(nuevoVehiculo);
        System.out.println("*****************************************************************");
    }
}
