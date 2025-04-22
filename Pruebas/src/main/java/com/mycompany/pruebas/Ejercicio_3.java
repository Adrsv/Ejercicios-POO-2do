package com.mycompany.pruebas;
import java.util.Scanner;

public class Ejercicio_3{
    public void Ejecutar(){
        Scanner scan = new Scanner(System.in);
        boolean cValido = false;
        int cantidadInventario = 0;
        while (!cValido){
            System.out.println("Ingrese la cantidad de productos en el inventario");
            cantidadInventario = scan.nextInt();
            scan.nextLine();
            if (cantidadInventario > 0) {
                cValido = true;
                break;
            } else {
                System.out.println("Ingrese una cantidad mayor a 0");
            }
        }
        
        String[] nombre = new String[cantidadInventario];
        int[] cantidades = new int[cantidadInventario];
        float[] precios = new float[cantidadInventario];
        
        for (int i = 0; i < cantidadInventario; i++) {
            boolean nValido = false;
            while (!nValido) {
                // Validar nombre del producto
                System.out.println("Ingrese el nombre del producto");
                nombre[i] = scan.nextLine();

                boolean existe = false;
                for (int j = 0; j < i; j++) {
                    if (nombre[j] != null && nombre[j].equals(nombre[i])) {
                        existe = true;
                        System.out.println("El producto ya existe. Intente nuevamente.");
                        break;
                    }
                }

                if (!existe) {
                    System.out.println("¡Producto agregado!");
                    nValido = true;

                    // Validar cantidad
                    boolean cValida = false;
                    while (!cValida) {
                        System.out.println("Ingrese la cantidad del producto (mayor a 0):");
                        int cantidad = scan.nextInt();
                        if (cantidad > 0) {
                            cValida = true;
                            cantidades[i] = cantidad;
                        } else {
                            System.out.println("La cantidad debe ser mayor a 0. Intente nuevamente.");
                        }
                    }

                    // Validar precio
                    boolean pValido = false;
                    while (!pValido) {
                        System.out.println("Ingrese el precio del producto (mayor a 0):");
                        float precio = scan.nextFloat();
                        if (precio > 0) {
                            pValido = true;
                            precios[i] = precio;
                        } else {
                            System.out.println("El precio debe ser mayor a 0. Intente nuevamente.");
                        }
                    }
                    scan.nextLine();
                }
            }
        }
        // Calcular el precio total e identificar productos que superen $1000
        float precioTotal = 0;
        System.out.println("\n--- Productos con precios superiores a $1000 ---");
        for (int i = 0; i < cantidadInventario; i++) {
            float precioProducto = cantidades[i] * precios[i];
            precioTotal += precioProducto;

            if (precioProducto > 1000) {
                System.out.println("Producto: " + nombre[i] +
                                   ", Cantidad = " + cantidades[i] +
                                   ", Costo por unidad = " + precios[i] +
                                   ", Precio total = " + precioProducto);
            }
        }

        // Mostrar el precio total de todos los productos
        System.out.println("\nEl precio total de todos los productos es: $" + precioTotal);
    }
}