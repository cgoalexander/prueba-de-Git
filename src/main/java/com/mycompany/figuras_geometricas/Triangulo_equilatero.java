/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.figuras_geometricas;

/**
 *
 * @author hp
 */
public class Triangulo_equilatero extends Triangulo{

    public Triangulo_equilatero(double base, double altura, String nombre) {
        super(base, altura, nombre);
    }

    public void setPerimetro() {
        this.perimetro = this.base * 3;
    }    
}
