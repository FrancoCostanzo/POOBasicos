package org.example;

import org.example.classes.AutoElectrico;
import org.example.classes.Coche;
import org.example.classes.Deportivo;
import org.example.classes.Moto;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            mostrarMenuPrincipal();
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    menuCoche();
                    break;
                case 2:
                    menuMoto();
                    break;
                case 3:
                    menuAutoElectrico();
                    break;
                case 4:
                    menuDeportivo();
                    break;
                case 0:
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    return;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }
        }
    }

    // muestra el menú principal
    private static void mostrarMenuPrincipal() {
        System.out.println("\n--- SIMULADOR DE VEHÍCULOS ---");
        System.out.println("Seleccione un tipo de vehículo:");
        System.out.println("1. Coche");
        System.out.println("2. Moto");
        System.out.println("3. Auto Eléctrico");
        System.out.println("4. Deportivo");
        System.out.println("0. Salir");
        System.out.print("Ingrese su opción: ");
    }

    // muestra el menú del coche si se selecciona la opción 1
    private static void menuCoche() {
        System.out.print("Ingrese la marca del Coche: ");
        String marca = scanner.nextLine();
        Coche coche = new Coche(marca);

        while (true) {
            System.out.println("\n--- Menú Coche: " + marca + " ---");
            System.out.println("1. Acelerar");
            System.out.println("2. Frenar");
            System.out.println("3. Ver velocidad actual");
            System.out.println("0. Volver al menú principal");
            System.out.print("Ingrese su opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese cuánto desea acelerar: ");
                    int acelerar = scanner.nextInt();
                    scanner.nextLine(); // Limpiar buffer
                    coche.acelerar(acelerar);
                    break;
                case 2:
                    System.out.print("Ingrese cuánto desea frenar: ");
                    int frenar = scanner.nextInt();
                    scanner.nextLine(); // Limpiar buffer
                    coche.frenar(frenar);
                    break;
                case 3:
                    System.out.println("Velocidad actual: " + coche.getVelocidad() + " km/h");
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }
        }
    }

    // muestra el menú de la moto si se selecciona la opción 2
    private static void menuMoto() {
        System.out.print("Ingrese la marca de la Moto: ");
        String marca = scanner.nextLine();
        Moto moto = new Moto(marca);

        while (true) {
            System.out.println("\n--- Menú Moto: " + marca + " ---");
            System.out.println("1. Acelerar");
            System.out.println("2. Frenar");
            System.out.println("3. Ver velocidad actual");
            System.out.println("0. Volver al menú principal");
            System.out.print("Ingrese su opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese cuánto desea acelerar: ");
                    int acelerar = scanner.nextInt();
                    scanner.nextLine(); // Limpiar buffer
                    moto.acelerar(acelerar);
                    break;
                case 2:
                    System.out.print("Ingrese cuánto desea frenar: ");
                    int frenar = scanner.nextInt();
                    scanner.nextLine(); // Limpiar buffer
                    moto.frenar(frenar);
                    break;
                case 3:
                    System.out.println("Velocidad actual: " + moto.getVelocidad() + " km/h");
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }
        }
    }

    // muestra el menú del auto eléctrico si se selecciona la opción 3
    private static void menuAutoElectrico() {
        System.out.print("Ingrese la marca del Auto Eléctrico: ");
        String marca = scanner.nextLine();
        AutoElectrico autoElectrico = new AutoElectrico(marca);

        while (true) {
            System.out.println("\n--- Menú Auto Eléctrico: " + marca + " ---");
            System.out.println("1. Acelerar");
            System.out.println("2. Frenar");
            System.out.println("3. Cargar Batería");
            System.out.println("4. Ver velocidad actual");
            System.out.println("5. Ver nivel de batería");
            System.out.println("0. Volver al menú principal");
            System.out.print("Ingrese su opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese cuánto desea acelerar: ");
                    int acelerar = scanner.nextInt();
                    scanner.nextLine(); // Limpiar buffer
                    autoElectrico.acelerar(acelerar);
                    break;
                case 2:
                    System.out.print("Ingrese cuánto desea frenar: ");
                    int frenar = scanner.nextInt();
                    scanner.nextLine(); // Limpiar buffer
                    autoElectrico.frenar(frenar);
                    break;
                case 3:
                    autoElectrico.cargarBateria();
                    break;
                case 4:
                    System.out.println("Velocidad actual: " + autoElectrico.getVelocidad() + " km/h");
                    break;
                case 5:
                    System.out.println("Nivel de batería: " + autoElectrico.getNivelBateria() + "%");
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }
        }
    }

    // muestra el menú del deportivo si se selecciona la opción 4
    private static void menuDeportivo() {
        System.out.print("Ingrese la marca del Deportivo: ");
        String marca = scanner.nextLine();
        Deportivo deportivo = new Deportivo(marca);

        while (true) {
            System.out.println("\n--- Menú Deportivo: " + marca + " ---");
            System.out.println("1. Acelerar");
            System.out.println("2. Frenar");
            System.out.println("3. Activar Turbo");
            System.out.println("4. Desactivar Turbo");
            System.out.println("5. Verificar estado del Turbo");
            System.out.println("6. Ver velocidad actual");
            System.out.println("0. Volver al menú principal");
            System.out.print("Ingrese su opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese cuánto desea acelerar: ");
                    int acelerar = scanner.nextInt();
                    scanner.nextLine(); // Limpiar buffer
                    deportivo.acelerar(acelerar);
                    break;
                case 2:
                    System.out.print("Ingrese cuánto desea frenar: ");
                    int frenar = scanner.nextInt();
                    scanner.nextLine(); // Limpiar buffer
                    deportivo.frenar(frenar);
                    break;
                case 3:
                    deportivo.activarTurbo();
                    break;
                case 4:
                    deportivo.desactivarTurbo();
                    break;
                case 5:
                    System.out.println("Estado del Turbo: " +
                            (deportivo.isTurboActivo() ? "Activado" : "Desactivado"));
                    break;
                case 6:
                    System.out.println("Velocidad actual: " + deportivo.getVelocidad() + " km/h");
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }
        }
    }
}