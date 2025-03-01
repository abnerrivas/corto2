package com.mycompany.corto2.newpackage;

public class Vehiculo {
    private String marca;
    private String modelo;
    private int año;
    private double velocidad;


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

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }


    public void acelerar() {
        System.out.println("frenar");
    }

    public void frenar() {
        System.out.println("frenar");
    }
}
