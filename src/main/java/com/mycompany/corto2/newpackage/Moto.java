package com.mycompany.corto2.newpackage;

import com.mycompany.corto2.newpackage.Vehiculo;

public class Moto extends Vehiculo {
    private String tipoManillar;

 
    
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