package com.mycompany.sanatorio;
import java.util.ArrayList;
import java.util.List;

public class Sanatorio {

    public static void main(String[] args) {
        //pacientes de ejemplo
        Paciente p1 = new PacientePediatrico("50123456", "Ana Lopez", "OSDE", 15.5, "11-5555-1111", "Carlos Lopez");
        Paciente p2 = new PacienteAdulto("30987654", "Juan Perez", "OSECAC", "120/80", 1.75, 78.0);
        Paciente p3 = new PacienteInternado("25111222", "Maria Gomez", "PAMI", 305, "130/85", "A+");
        Paciente p4 = new PacientePediatrico("52654321", "Luisito Ramirez", "OSECAC", 22.0, "11-5555-2222", "Marta Ramirez");

        List<Paciente> listaPacientes = new ArrayList<>();
        listaPacientes.add(p1);
        listaPacientes.add(p2);
        listaPacientes.add(p3);
        listaPacientes.add(p4);

        System.out.println("--- Informacion General de Pacientes ---");
        for (Paciente pac : listaPacientes) {
            System.out.println(pac.toString()); // Llama al toString específico de cada tipo
        }

        System.out.println("\n--- Departamento de Administracion ---");
        for (Paciente pac : listaPacientes) {
            System.out.println("Paciente: " + pac.getNombre());
            System.out.println("  Cobertura: " + pac.obtenerCoberturaOS());
            System.out.println("  Descuento: " + pac.obtenerDescuento() + "%");
            System.out.println("  Vademecum: " + pac.obtenerVademecum());
            System.out.println("-----");
        }

        System.out.println("\n--- Departamento de Nutricion ---");
        for (Paciente pac : listaPacientes) {
            // Verificar si el paciente implementa la interfaz INutricion
            if (pac instanceof INutricion) {
                INutricion pacienteNutricion = (INutricion) pac; 
                System.out.println("Paciente: " + pac.getNombre());
                System.out.println("  Dieta: " + pacienteNutricion.obtenerTipoDieta());
                System.out.println("-----");
            }
        }

        System.out.println("\n--- Departamento de Clinica Medica ---");
        for (Paciente pac : listaPacientes) {
            // Verificar si el paciente implementa la interfaz IClinicaMedica
            if (pac instanceof IClinicaMedica) {
                IClinicaMedica pacienteClinica = (IClinicaMedica) pac;
                System.out.println("Paciente: " + pac.getNombre());
                pacienteClinica.recetarEstudioRx();
                pacienteClinica.recetarEstudioSangre();
                System.out.println("-----");
            }
        }
    }
}
