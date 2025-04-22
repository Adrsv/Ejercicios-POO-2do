package com.mycompany.pruebas;
import java.util.Scanner;

public class Pruebas {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int opcion = -1;
        do{
            mostrarMenu();
            System.out.println("Ingrese una opcion: ");
            opcion = scan.nextInt();
            switch(opcion){
                case 1:
                    Ejercicio_1 ej1 = new Ejercicio_1();
                    ej1.Ejecutar();
                    break;
                case 2:
                    Ejercicio_2 ej2 = new Ejercicio_2();
                    ej2.Ejecutar();
                    break;
                case 3:
                    Ejercicio_3 ej3 = new Ejercicio_3();
                    ej3.Ejecutar();
                case 4:
                    Ejercicio_4 ej4 = new Ejercicio_4();
                    ej4.Ejecutar();
                case 0:
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        } while(opcion != 0);
        scan.close();
           
    }
    
    public static void mostrarMenu(){
        System.out.println("-------Menu-------");
        System.out.println("1. Ejercicio 1");
        System.out.println("2. Ejercicio 2");
        System.out.println("3. Ejercicio 3");
        System.out.println("4. Ejercicio 4");
        System.out.println("0. Salir");
        
        System.out.println("------------------");
    }
}