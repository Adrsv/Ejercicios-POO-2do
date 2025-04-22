
package com.mycompany.pruebas;
class Camiones {
    private String patente;
    private String nombre_apellido;
    private String carga;
    private int hora_egreso; // Mantenido como int

    public Camiones(String patente, String nombre_apellido, String carga, int hora_egreso) {
        this.patente = patente;
        this.nombre_apellido = nombre_apellido;
        this.carga = carga;
        this.hora_egreso = hora_egreso;
    }

    // --- Getters y Setters ---
    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getPatente() {
        return patente;
    }

    public void setNombreApellido(String nombre_apellido) {
        this.nombre_apellido = nombre_apellido;
    }

    public String getNombreApellido() {
        return nombre_apellido;
    }

    public void setCarga(String carga) {
        this.carga = carga;
    }

    // CORREGIDO: Nombre del método getCarga()
    public String getCarga() {
        return carga;
    }

    public void setHoraEgreso(int hora_egreso) {
        this.hora_egreso = hora_egreso;
    }

    public int getHoraEgreso() {
        return hora_egreso;
    }

    @Override
    public String toString() { // Útil para imprimir
        return "Camion [patente=" + patente + ", chofer=" + nombre_apellido + ", carga=" + carga + ", hora_egreso=" + hora_egreso + "]";
    }
}
