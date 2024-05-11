package org.example;

import java.util.Scanner;

public class CajeroAutomatico {

    public static void main(String[] args) {
        // Clave registrada en el sistema
        int claveRegistrada = 1234;
        // Número máximo de intentos permitidos
        int intentosMaximos = 3;
        // Contador de intentos
        int intentos = 0;

        Scanner scanner = new Scanner(System.in);

        while (intentos < intentosMaximos) {
            // Solicitar la clave al usuario
            System.out.print("Ingrese su clave: ");
            // Leer la clave ingresada por el usuario
            int claveIngresada;
            try {
                claveIngresada = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Error: Ingrese solo números.");
                scanner.next(); // Limpiar el buffer del scanner
                intentos++;
                continue;
            }
            // Verificar si la clave ingresada es correcta

            String clave = String.valueOf(claveIngresada);

            if ( clave.length() == 4 ) {
                if (claveIngresada == claveRegistrada) {
                    System.out.println("Hola, Bienvenido cajero");
                    break; // Salir del bucle si la clave es correcta
                } else {
                    // Incrementar el contador de intentos
                    intentos++;
                    // Verificar si quedan intentos disponibles
                    if (intentos < intentosMaximos) {
                        // Mostrar mensaje de intento fallido y la cantidad de intentos restantes
                        System.out.println("Clave incorrecta. Intentos restantes: " + (intentosMaximos - intentos));
                    } else {
                        // Mostrar mensaje de tarjeta bloqueada y salir del programa
                        //System.out.println("#############3");
                        System.out.println("Tarjeta bloqueada");
                        break;
                    }
                }
            }else{

            }
        }

        // Cerrar el scanner
        scanner.close();
    }
}
