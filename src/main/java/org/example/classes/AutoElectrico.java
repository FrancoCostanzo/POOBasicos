package org.example.classes;

// AutoElectrico hereda de Coche e implementa Electrico
public class AutoElectrico extends Coche implements Electrico {
    private int nivelBateria;

    public AutoElectrico(String marca) {
        super(marca);
        this.nivelBateria = 100; // Batería inicialmente al 100%
    }

    @Override
    public void acelerar(int incremento) {
        if (nivelBateria > 0) {
            super.acelerar(incremento);
            // Reducir nivel de batería al acelerar
            nivelBateria = Math.max(0, nivelBateria - incremento); // Nivel de batería no puede ser negativo
            System.out.println("Nivel de batería: " + nivelBateria + "%");
        } else {
            System.out.println("No se puede acelerar. Batería descargada. Por favor, recargue.");
        }
    }

    @Override
    public void cargarBateria() {
        nivelBateria = 100;
        System.out.println(getMarca() + " ha recargado su batería al 100%");
    }

    public int getNivelBateria() {
        return nivelBateria;
    }

    // Resto de metodos de "Vehiculo "ni se tocan
}