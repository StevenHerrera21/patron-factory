package modelo;

public class Camion extends Vehiculo {
    protected int capacidadMaxima;

    @Override
    public double calcularCostoMatricula() {
        double base = 200.0;
        double costo_variable = 100;
        if (capacidadMaxima > 200) {
            costo_variable = 200;
        }
        return base + costo_variable;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }
}
