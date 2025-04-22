
package com.mycompany.pruebas;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio_4 {

    public void Ejecutar() {
        
        Camiones[] vCamiones = new Camiones[3];
        Scanner scan = new Scanner(System.in);

        // Bucle para ingresar los 30 camiones (índices 0 a 29)
        for (int i = 0; i < vCamiones.length; i++) {

            System.out.println("\n--- Ingresando datos del Camión N° " + (i + 1) + " ---");

            // --- Patente del camion ---
            String patente = "";
            boolean pValido = false;
            while (!pValido) {
                System.out.print("Ingrese la patente del camion: ");
                String intentoPatente = scan.nextLine().toUpperCase();

                if (intentoPatente.trim().isEmpty()) {
                     System.out.println("Error: La patente no puede estar vacía.");
                     continue; 
                }

                boolean existe = false;
                // Verifica si existe la patente
                for (int j = 0; j < i; j++) {
                                        if (vCamiones[j] != null && vCamiones[j].getPatente().equalsIgnoreCase(intentoPatente)) {
                        existe = true;
                        break;
                    }
                }

                if (existe) {
                    System.out.println("Error: La patente '" + intentoPatente + "' ingresada ya existe. Intente con otra.");
                } else {
                    // Si no existe, la patente es válida
                    patente = intentoPatente;
                    pValido = true;
                }
            }
            
            // --- Nombre y apellido ---
            System.out.print("Ingrese el nombre y apellido del chofer: ");
            String nombre_apellido = scan.nextLine();
            
            // --- Tipo de cargas (con validación) ---
            String[] cargasValidas = {"madera", "yerba", "te"};
            boolean tcValido = false;
            String tipo_carga = "";
            while (!tcValido) {
                System.out.print("Ingrese el tipo de carga que lleva (madera, yerba, te): ");
                String intentoCarga = scan.nextLine().strip().toLowerCase(); 

                for (String cargaValida : cargasValidas) {
                    if (cargaValida.equals(intentoCarga)) {
                        tcValido = true;
                        tipo_carga = intentoCarga; // Guardar la carga válida
                        break;
                    }
                }

                if (!tcValido) {
                    System.out.println("Error: La carga '" + intentoCarga + "' no es valida. Intente de nuevo.");
                }
            }

            // --- Hora de egreso (con validación de número) ---
            int hora_egreso = 0; 
            boolean horaValida = false;
            while (!horaValida) {
                System.out.print("Ingrese la hora de egreso (como número entero, ej: 14): ");
                String horaStr = scan.nextLine();
                try {
                    hora_egreso = Integer.parseInt(horaStr);
                    horaValida = true;
                } catch (NumberFormatException e) {
                    System.out.println("Error: Ingrese un número entero válido para la hora.");
                }
            }
        
            // --- Crear y guardar el nuevo Camión ---
            Camiones nuevoCamion = new Camiones(patente, nombre_apellido, tipo_carga, hora_egreso);
            vCamiones[i] = nuevoCamion;
             System.out.println("Camión agregado exitosamente: " + vCamiones[i]);

            
        }

        System.out.println("\n--- Carga de todos los camiones completada ---");
        for (Camiones camion : vCamiones) {
            if (camion != null) { 
                System.out.println(camion);
            }
        }
    }
}

