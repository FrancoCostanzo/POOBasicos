package org.example.classes;

public class Deportivo extends Coche {
    private boolean turboActivo;

    public Deportivo(String marca) {
        super(marca);
        this.turboActivo = false;
    }

    @Override
    public void acelerar(int incremento) {
        if (turboActivo) {
            // Si el turbo está activo, triplicamos el incremento
            // En la consigna no aclara cuanto asi que le puse 3 que es mas que la moto
            super.acelerar(incremento * 3);
            System.out.println("Turbo activado! Aceleración extra.");
        } else {
            super.acelerar(incremento);
        }
    }

    public void activarTurbo() {
        turboActivo = true;
        System.out.println(getMarca() + " - Turbo activado");
    }

    public void desactivarTurbo() {
        turboActivo = false;
        System.out.println(getMarca() + " - Turbo desactivado");
    }

    public boolean isTurboActivo() {
        return turboActivo;
    }
}
