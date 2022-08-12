/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.figuras_geometricas;

/**
 *
 * @author hp
 */
public class Figura {
    
    String nombre;
    double area_figura;
    double perimetro;

    public Figura(String nombre) {
        this.nombre = nombre;
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public double getArea_figura() {
        return area_figura;
    }

    public double getPerimetro() {
        return perimetro;
    }

    @Override
    public String toString() {
        return "Figura{" + "nombre=" + nombre + ", area_figura=" + area_figura + ", perimetro=" + perimetro + '}';
    }   
}
