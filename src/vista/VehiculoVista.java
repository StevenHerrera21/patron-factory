package vista;

import controlador.VehiculoFactory;
import controlador.VehiculoAbstractFactory;
import java.util.Scanner;
import modelo.*;

public class VehiculoVista {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        VehiculoAbstractFactory factory = new VehiculoFactory();
        boolean continuar = true;

        while (continuar) {
            System.out.println("\n=== Registro de Vehículos ===");
            System.out.println("1) Auto");
            System.out.println("2) Camioneta");
            System.out.println("3) Camion");
            System.out.println("0) Salir");
            System.out.print("Seleccione una opción: ");
            int op = leerEntero(sc);

            if (op == 0) {
                continuar = false;
                System.out.println("Saliendo del sistema...");
                break;
            }

            TipoVehiculo tipo;
            switch (op) {
                case 1: tipo = TipoVehiculo.AUTO; break;
                case 2: tipo = TipoVehiculo.CAMIONETA; break;
                case 3: tipo = TipoVehiculo.CAMION; break;
                default:
                    System.out.println("Opción inválida, intente de nuevo.");
                    continue;
            }

            // Crear por Factory
            Vehiculo objetoVehiculo = factory.createVehiculo(tipo);

            // Datos comunes
            System.out.println("\nIngrese datos comunes:");
            System.out.print("Chasis: ");
            objetoVehiculo.setChasis(sc.next());
            System.out.print("Marca: ");
            objetoVehiculo.setMarca(sc.next());
            System.out.print("Modelo: ");
            objetoVehiculo.setModelo(sc.next());
            System.out.print("Placa: ");
            objetoVehiculo.setPlaca(sc.next());

            // Datos específicos
            if (objetoVehiculo instanceof Auto) {
                Auto a = (Auto) objetoVehiculo;
                System.out.print("Cilindraje (ej. 1800): ");
                a.setCilindraje(leerEntero(sc));
            } else if (objetoVehiculo instanceof Camioneta) {
                Camioneta ca = (Camioneta) objetoVehiculo;
                System.out.print("Tracción (4x2/4x4): ");
                ca.setTraccion(sc.next());
            } else if (objetoVehiculo instanceof Camion) {
                Camion cm = (Camion) objetoVehiculo;
                System.out.print("Capacidad máxima (kg): ");
                cm.setCapacidadMaxima(leerEntero(sc));
            }

            // Resultado
            double costo = objetoVehiculo.calcularCostoMatricula();
            System.out.println("\nResumen:");
            System.out.println("Tipo: " + tipo);
            System.out.println("Marca/Modelo: " + objetoVehiculo.getMarca() + " " + objetoVehiculo.getModelo());
            System.out.println("Placa: " + objetoVehiculo.getPlaca());
            System.out.println("Costo de matrícula: $" + costo);
        }
        
    }
    private static int leerEntero(Scanner sc) {
        while (!sc.hasNextInt()) {
            System.out.print("Ingrese un número válido: ");
            sc.next();
        }
        return sc.nextInt();
    }
}
