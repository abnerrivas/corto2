package com.mycompany.corto2;

public class Moto extends Vehiculo {
    private String tipoManillar;

    public Moto(String marca, String modelo, int año, String tipoManillar) {
        super(marca, modelo, año);
        this.tipoManillar = tipoManillar;

    }
    
    @Override

    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Tipo de manillar: " + tipoManillar);
    }

    public String getTipoManillar() {
        return tipoManillar;
    }

    public void setTipoManillar(String tipoManillar) {
        this.tipoManillar = tipoManillar;
    }

}