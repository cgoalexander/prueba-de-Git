/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.figuras_geometricas;

/**
 *
 * @author hp
 */
public class Cuadrado extends Figura{
    
    private double lado;

    public Cuadrado(double lado, String nombre) {
        super(nombre);
        this.lado = lado;       
    }

    public void setArea_figura() {
        this.area_figura = this.lado*this.lado;
    }

    public void setPerimetro() {
        this.perimetro = this.lado*4;
    }
    
    
    
    
}
