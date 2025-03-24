package org.example.classes;

public abstract class Vehiculo {
    private String marca;
    private int velocidad;

    // Constructor
    public Vehiculo(String marca) {
        this.marca = marca;
        this.velocidad = 0;
    }

    // Metodo abstracto acelerar
    public abstract void acelerar(int incremento);

    // Metodo frenar
    public void frenar(int decremento) {
        this.velocidad = Math.max(0, this.velocidad - decremento); // Velocidad no puede ser negativa
        System.out.println(marca + " ha frenado. Velocidad actual: " + velocidad + " km/h");
    }

    // Getters
    public String getMarca() {
        return marca;
    }

    public int getVelocidad() {
        return velocidad;
    }

    // Setter protegido para velocidad (para uso en subclases)
    protected void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
}