package com.mycompany.sanatorio;

public class PacienteInternado extends Paciente implements INutricion, IClinicaMedica {
    //Atributos
    private int habitacion;
    private String presionArterial;
    private String rh;
    
    //Constructor
    public PacienteInternado(String dni, String nombre, String obraSocial, int habitacion, String presionArterial, String rh){
        super(dni, nombre, obraSocial);
        this.habitacion = habitacion;
        this.presionArterial = presionArterial;
        this.rh = rh;
    }

     public int getHabitacion() {
        return habitacion;
    }

    public String getPresionArterial() {
        return presionArterial;
    }

    public String getRh() {
        return rh;
    }
    
    @Override
    public String obtenerCoberturaOS() {
        return "Cobertura Internacion Plan Completo para " + getNombre() + " OS: " + getObrasocial();
    }

    @Override
    public double obtenerDescuento() {
        return 0.0; // Sin descuento adicional por internación (ejemplo)
    }

    @Override
    public String obtenerVademecum() {
        return "Vademecum Internacion Aprobado OS " + getObrasocial();
    }

    // Implementación del método de la interfaz INutricion
    @Override
    public String obtenerTipoDieta() {
        return "Dieta Hospitalaria Especifica para Habitacion " + this.habitacion;
    }

    // Implementación de los métodos de la interfaz IClinicaMedica
    @Override
    public void recetarEstudioRx() {
        System.out.println("RECETA URGENTE: Estudio Rayos X (Rx) para paciente internado: " + getNombre() + " (Hab: " + habitacion + ")");
    }

    @Override
    public void recetarEstudioSangre() {
        System.out.println("RECETA URGENTE: Estudio de Sangre para paciente internado: " + getNombre() + " (Hab: " + habitacion + ")");
    }

     // Sobrescribir toString
    @Override
    public String toString() {
        return super.toString() + " [Tipo=Internado, Habitacion=" + habitacion + ", P.A=" + presionArterial + ", Rh=" + rh + "]";
    }
}
