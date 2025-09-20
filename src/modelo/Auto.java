package modelo;

public class Auto extends Vehiculo {
    protected int cilindraje;

    @Override
    public double calcularCostoMatricula() {
        double base = 120.0;
        double costo_variable = 140.0;
        if (cilindraje > 1.600) {
            costo_variable = 200;
        }
        return base + costo_variable;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }
}
