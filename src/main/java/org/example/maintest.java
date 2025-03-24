package org.example;

import org.example.classes.AutoElectrico;
import org.example.classes.Coche;
import org.example.classes.Deportivo;
import org.example.classes.Moto;

public class maintest {
    public maintest(String[] args) {
        // Crear diferentes tipos de vehículos
        Coche coche = new Coche("Toyota");
        Moto moto = new Moto("Yamaha");
        AutoElectrico autoElectrico = new AutoElectrico("Tesla");
        Deportivo deportivo = new Deportivo("Ferrari");

        // Simulación de interacciones
        System.out.println("--- Simulación de Vehículos ---");

        // Coche
        System.out.println("\nProbando Coche:");
        coche.acelerar(50);
        coche.frenar(20);

        // Moto
        System.out.println("\nProbando Moto:");
        moto.acelerar(30);
        moto.frenar(10);

        // Auto Eléctrico
        System.out.println("\nProbando Auto Eléctrico:");
        autoElectrico.acelerar(40);
        System.out.println("Nivel de batería: " + autoElectrico.getNivelBateria() + "%");
        autoElectrico.cargarBateria();

        // Deportivo
        System.out.println("\nProbando Deportivo:");
        deportivo.acelerar(50);
        deportivo.activarTurbo();
        deportivo.acelerar(50);
        deportivo.desactivarTurbo();
        deportivo.acelerar(50);
    }
}