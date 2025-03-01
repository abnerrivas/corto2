package com.mycompany.corto2;

public class Vehiculo {
    private String marca;
    private String modelo;
    private int año;
    private double velocidad;

    public Vehiculo(String marca, String modelo, int año) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.velocidad = velocidad;
    }

    public void acelerar() {
        System.out.println("frenar");
    }

    public void frenar() {
       System.out.println("frenar");
    }

    public void mostrarInfo() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + año);
        System.out.println("Velocidad: " + velocidad);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void mostrarInformacion() {
    }
}
