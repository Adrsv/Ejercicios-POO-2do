package com.mycompany.sanatorio;

public abstract class Paciente {
    protected String dni;
    protected String nombre;
    protected String obraSocial;
    
    public Paciente(String dni, String nombre, String obraSocial){
        this.dni = dni;
        this.nombre = nombre;
        this.obraSocial = obraSocial;
    }
    
    public String getDni(){
        return dni;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String getObrasocial(){
        return obraSocial;
    }
    
    public abstract String obtenerCoberturaOS();
    public abstract double obtenerDescuento();
    public abstract String obtenerVademecum();
    
    @Override
    public String toString(){
        return "Paciente[DNI: " + dni + ", Nombre: " + nombre + ", Obra Social: " + obraSocial + "]";
    }
}
