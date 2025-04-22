package com.mycompany.pruebas;
import java.util.Scanner;

public class Ejercicio_1 {
    public void Ejecutar(){
        Scanner scan = new Scanner(System.in);
        boolean cantidadValida = false;
        int cantidad = 0;
        while (!cantidadValida) {
            System.out.println("Ingrese la cantidad de notas");
                cantidad = scan.nextInt();
                if (cantidad > 0) {
                    cantidadValida = true;
                } else {
                    System.out.println("Error: La cantidad debe ser un número positivo.");
                }
            }
        
        int[] vector_notas = new int[cantidad];
        int i = 0;
        int suma = 0;
        float promedio;
        while (i < cantidad) {
            System.out.println("Ingrese la nota N " + i);
            int nota = scan.nextInt();
            vector_notas[i] = nota;
            suma = suma + nota;
            i++;
        }
        promedio = (suma / i);
        int notaMasAlta = vector_notas[0];
        for (i=1;i < cantidad; i++) {
            if (vector_notas[i] > notaMasAlta) {
                notaMasAlta = vector_notas[i];
            }
        }
        
        for (i = 0; i < cantidad; i++) {
            System.out.print("Nota " + i +": "+ vector_notas[i] + ", ");
        }
        System.out.println("Promedio: " + promedio);
        System.out.println("Nota mas alta: " + notaMasAlta);
        System.out.println("------------------------");
        System.out.println("Ingrese cualquier valor para continuar");
        scan.next();
    }
}