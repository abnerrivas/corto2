package com.mycompany.corto2.newpackage;

import com.mycompany.corto2.newpackage.Vehiculo;

public class Auto extends Vehiculo {
    private int cantidadPuertas;


    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Cantidad de puertas: " + cantidadPuertas);
    }

    public int getCantidadPuertas() {
        return cantidadPuertas;
    }

    public void setCantidadPuertas(int cantidadPuertas) {
        this.cantidadPuertas = cantidadPuertas;
    }
}