/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.figuras_geometricas;

/**
 *
 * @author hp
 */
public class Circulo extends Figura{
    
    private double radio;

    public Circulo(double radio, String nombre) {
        super(nombre);
        this.radio = radio;
    }

    public void setArea_figura() {
        this.area_figura = Math.PI*Math.pow(this.radio,2);
    }

    public void setPerimetro() {
        this.perimetro = 2 * Math.PI * this.radio;
    }
    
    
    
    
    
    
    
    
    
    
}
