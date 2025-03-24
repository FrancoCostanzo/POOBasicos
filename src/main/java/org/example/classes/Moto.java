package org.example.classes;

public class Moto extends Vehiculo {
    public Moto(String marca) {
        super(marca);
    }

    @Override
    public void acelerar(int incremento) {
        // La moto acelera al doble de velocidad
        setVelocidad(getVelocidad() + (incremento * 2));
        System.out.println(getMarca() + " ha acelerado. Velocidad actual: " + getVelocidad() + " km/h");
    }

    // Resto de metodos de "Vehiculo "ni se tocan
    }