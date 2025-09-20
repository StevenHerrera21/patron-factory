package modelo;

public abstract class Vehiculo {
    protected String chasis;
    protected String modelo;
    protected String marca;
    protected String placa;

    public abstract double calcularCostoMatricula();
}
