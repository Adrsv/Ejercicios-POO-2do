package com.mycompany.sanatorio;

public class PacienteAdulto extends Paciente implements IClinicaMedica {
    //Atributos
    private String presionArterial;
    private double altura;
    private double peso;
    
    //Constructor
    public PacienteAdulto(String dni, String nombre, String obraSocial, String presionArterial, double altura, double peso){
        super(dni, nombre, obraSocial);
        this.presionArterial = presionArterial;
        this.altura = altura;
        this.peso = peso;
    }
    
    public String getPresionArterial(){
        return presionArterial;
    }
    
    public double getAltura(){
        return altura;
    }
    
    public double getPeso(){
        return peso;
    }
    
    @Override
    public String obtenerCoberturaOS(){
        return "Cobertura Adultos plan social para " + getNombre() + " OS: " + getObrasocial();
    }
    
    @Override
    public double obtenerDescuento(){
        return 5.0;
    }
    
    @Override
    public String obtenerVademecum(){
        return "Vademecum adultos aprobado OS " + getObrasocial();
    }
    
    @Override
    public void recetarEstudioRx(){
        System.out.println("Receta: Estudio Rayos X (Rx) para paciente adulto: " + getNombre() + "(DNI: " + getDni() + ")");
    }
    
    @Override
    public void recetarEstudioSangre(){
        System.out.println("Receta: Estudio de sangre para paciente adulto: " + getNombre() + "(DNI: " + getDni() + ")");
    }
    
    @Override
    public String toString(){
        return super.toString() + "[Tipo= Adulto, P.A= " + presionArterial + ", Altura: " + altura + ", Peso: " + peso + "]";
    }
    
    
}
