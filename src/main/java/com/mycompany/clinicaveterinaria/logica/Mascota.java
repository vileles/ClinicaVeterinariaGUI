
package com.mycompany.clinicaveterinaria.logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Mascota implements Serializable {
    
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private int id;
    private String nombre;
    private String raza;
    private String color;
    private String especie;
    private float peso;
    private String sexo;
    private int edad;
    @OneToOne
    private Duenio unduenio;

    public Mascota() {
    }

    public Mascota(int id, String nombre, String raza, String color, String especie, float peso, String sexo, int edad, Duenio unduenio) {
        this.id = id;
        this.nombre = nombre;
        this.raza = raza;
        this.color = color;
        this.especie = especie;
        this.peso = peso;
        this.sexo = sexo;
        this.edad = edad;
        this.unduenio = unduenio;
    }

    public int getid() {
        return id;
    }

    public void setid(int ID) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Duenio getUnduenio() {
        return unduenio;
    }

    public void setUnduenio(Duenio unduenio) {
        this.unduenio = unduenio;
    }
    
    
}
