package com.company;

public abstract class VehiculoFactory {


    public static IVehiculo getVehiculo(TipoVehiculo tipoVehiculo) {
        switch (tipoVehiculo){
            case AUTO ->    { return new Auto();    }
            case MOTO ->    { return new Moto();    }
            case CAMION ->  { return new Camion();  }
            default ->      { return null;          }
        }
    }

    public static IVehiculo getVehiculo(TipoVehiculo tipoVehiculo, String patente, String marca, Integer anio) {
        IVehiculo nuevoVehiculo = switch (tipoVehiculo) {
            case MOTO -> new Moto();
            case CAMION -> new Camion();
            case AUTO -> new Auto();
            default -> null;
        };
        nuevoVehiculo.actualizarDatos(patente, marca, anio);
        return nuevoVehiculo;
    }
}
