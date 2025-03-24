package org.example.classes;

public class Coche extends Vehiculo {
    public Coche(String marca) {
        super(marca);
    }

    @Override
    public void acelerar(int incremento) {
        setVelocidad(getVelocidad() + incremento);
        System.out.println(getMarca() + " ha acelerado. Velocidad actual: " + getVelocidad() + " km/h");
    }

    // Resto de metodos de "Vehiculo "ni se tocan
}
