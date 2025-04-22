package com.mycompany.pruebas;
import java.util.Scanner;

public class Ejercicio_2 {
    public void Ejecutar(){
        Scanner scan = new Scanner(System.in);
        int cantidad = 0;
        do {
        System.out.println("Ingrese la cantidad de notas");
        cantidad = scan.nextInt();
        if (cantidad <= 0) {
            System.out.println("Ingrese un valor valido mayor a 0");
        }
        } while(cantidad < 0);
        
        int[] vector_notas = new int[cantidad];
        int aprobados = 0;
        int desaprobados = 0;
        for (int i = 0;i < cantidad;i++) {
            System.out.println("Ingrese la nota N " + (i + 1));
            int nota = scan.nextInt();
            vector_notas[i] = nota;
            if (vector_notas[i] >= 6) {
                aprobados = aprobados + 1;
            } else {
                desaprobados = desaprobados + 1;
            }
        }
        System.out.println("Cantidad de aprobados: " + aprobados);
        System.out.println("Cantidad de desaprobados: " + desaprobados);
        scan.nextLine();
    }
}
