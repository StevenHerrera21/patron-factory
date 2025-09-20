package vista;

import controlador.VehiculoFactory;
import controlador.VehiculoAbstractFactory;
import modelo.TipoVehiculo;
import modelo.Vehiculo;

public class VehiculoVista {

    public static void main(String[] args) {
        VehiculoAbstractFactory factory = new VehiculoFactory();
        Vehiculo vehiculo = factory.createVehiculo(TipoVehiculo.AUTO);
        System.out.println("El costo de matricula es: " + vehiculo.calcularCostoMatricula());
    }
}
