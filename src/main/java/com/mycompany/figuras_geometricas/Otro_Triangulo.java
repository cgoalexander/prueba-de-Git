/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.figuras_geometricas;

/**
 *
 * @author hp
 */
public class Otro_Triangulo extends Triangulo {

    private double lado1;
    private double lado2;

    public Otro_Triangulo(double lado1, double lado2, double base, double altura, String nombre) {
        super(base, altura, nombre);
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public void setPerimetro() {
        this.perimetro = this.base + this.lado1 + this.lado2;
    }
    
    
    
    
    
}
