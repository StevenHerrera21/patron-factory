package controlador;

import modelo.*;

public class VehiculoFactory implements VehiculoAbstractFactory {

    @Override
    public Vehiculo createVehiculo(TipoVehiculo tipoVehiculo) {
        switch (tipoVehiculo) {
            case AUTO:
                return new Auto();
            case CAMION:
                return new Camion();
            case CAMIONETA:
                return new Camioneta();
            default:
                return null;
        }
    }
}
