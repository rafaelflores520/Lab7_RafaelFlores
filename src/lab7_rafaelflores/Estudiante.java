/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7_rafaelflores;

import java.io.Serializable;

/**
 *
 * @author Faith
 */
public class Estudiante implements Serializable{
    private String nombre;
    private int edad, cuenta;
    private Parada parada;

    public Estudiante() {
    }

    public Estudiante(String nombre, int edad, int cuenta, Parada parada) {
        this.nombre = nombre;
        this.edad = edad;
        this.cuenta = cuenta;
        this.parada = parada;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setCuenta(int cuenta) {
        this.cuenta = cuenta;
    }

    public void setParada(Parada parada) {
        this.parada = parada;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public int getCuenta() {
        return cuenta;
    }

    public Parada getParada() {
        return parada;
    }

    @Override
    public String toString() {
        return nombre +","+ edad +","+ cuenta +","+ parada;
    }
    
    
}
