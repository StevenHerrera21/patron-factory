package controlador;

import modelo.TipoVehiculo;
import modelo.Vehiculo;

public interface VehiculoAbstractFactory {
    Vehiculo createVehiculo(TipoVehiculo tipoVehiculo);
}
