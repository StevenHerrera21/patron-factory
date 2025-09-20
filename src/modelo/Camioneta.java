package modelo;

public class Camioneta extends Vehiculo {
    protected String traccion;

    @Override
    public double calcularCostoMatricula() {
        double base = 200.0;
        double costo_variable = 100;
        System.out.println("Tracciib "+traccion);
        if (traccion == "4x4") {
            costo_variable = 250;
        }
        return base + costo_variable;
    }

    public String getTraccion() {
        return traccion;
    }

    public void setTraccion(String traccion) {
        this.traccion = traccion;
    }
}
