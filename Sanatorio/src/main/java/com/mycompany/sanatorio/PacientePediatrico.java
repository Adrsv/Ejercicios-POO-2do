package com.mycompany.sanatorio;

public class PacientePediatrico extends Paciente implements  INutricion{
    //Atributos especificos
    private double peso;
    private String celular;
    private String tutor;
    
    //Constructor
    public PacientePediatrico(String dni, String nombre, String obraSocial, double peso, String celular, String tutor){
        super(dni, nombre, obraSocial);
        this.peso = peso;
        this.celular = celular;
        this.tutor = tutor;
    }
    
    public double getPeso(){
        return peso;
    }
    
    public String getCelular(){
        return celular;
    }
    
    public String getTutor(){
        return tutor;
    }
    
    @Override
    public String obtenerCoberturaOS(){
        return "Cobertura Pediatrica Plan Infantil para: " + getNombre() + " OS: " + getObrasocial();
    }
    
    @Override 
    public double obtenerDescuento(){
        return 15.0;
    }
    
    @Override
    public String obtenerVademecum(){
        return "Vadecum pediatrico Aprobado OS " + getObrasocial();
    }
    
    @Override
    public String obtenerTipoDieta(){
        return "Dieta Balanceada segun peso: " + this.peso + "kg";
    }
    
    @Override
    public String toString(){
        return super.toString() + " [Tipo= Pediatrico, Peso= " + peso + ", Cecular Tutor= " + celular + ", Tutor= " + tutor;
    }
}
