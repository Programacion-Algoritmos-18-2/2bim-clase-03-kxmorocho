/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejemplo;

/**
 *
 * @author TOSHIBA
 */
public final class Estadio {

    String nombre_estado;
    double capacidad;
    String tipo_deporte;

    public Estadio(String nomb_estado, double capac, String tipo_depor) {
        nombre_estado = nomb_estado;
        capacidad = capac;
        tipo_deporte = tipo_depor;
    }

    public String getNombre_estado() {
        return nombre_estado;
    }

    public void setNombre_estado(String nomb_estado) {
        nombre_estado = nomb_estado;
    }

    public double getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(double capacid) {
        capacidad = capacid;
    }

    public String getTipo_deporte() {
        return tipo_deporte;
    }

    public void setTipo_deporte(String tipo_deport) {
        tipo_deporte = tipo_deport;
    }

    @Override
    public String toString() {

        return String.format("%s, %s, %s", getNombre_estado(), getCapacidad(), getTipo_deporte());
    }

}
