
package com.mycompany.corto2;

public class Corto2 {
        
    public static void main(String[] args) {
        Vehiculo miVehiculo = new Vehiculo("Toyota", "Camry", 2023);
        Auto miAuto = new Auto("Honda", "Civic", 2022, 4);
        Moto miMoto = new Moto("Harley-Davidson", "Sportster", 2021, "Alto");
        Camion miCamion = new Camion("Volvo", "FH16", 2020, 40.0);

        System.out.println("Información del Vehículo:");
        miVehiculo.mostrarInformacion();

        System.out.println("\nInformación del Auto:");
        miAuto.mostrarInformacion();
        miAuto.acelerar();

        System.out.println("\nInformación de la Moto:");
        miMoto.mostrarInformacion();
        miMoto.frenar();

        System.out.println("\nInformación del Camión:");
        miCamion.mostrarInformacion();
    }
       
    }

