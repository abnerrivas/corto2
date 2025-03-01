package com.mycompany.corto2.newpackage;

public class Camion extends Vehiculo {
    private double capacidadCarga;

  
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


