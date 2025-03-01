package com.mycompany.corto2;

public class Camion extends Vehiculo {
    private double capacidadCarga;

    public Camion(String marca, String modelo, int año, double velocidad) {
        super(marca, modelo, año);
        this.capacidadCarga = capacidadCarga;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Capacidad de carga: " + capacidadCarga);
    }

    // Getter y setter para capacidadCarga (opcional)
    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }
}


