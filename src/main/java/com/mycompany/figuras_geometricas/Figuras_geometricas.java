/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.figuras_geometricas;



/**
 *
 * @author hp
 */
public class Figuras_geometricas {

    public static void main(String[] args) {
        
        //Cuadrado objcuadrado = new Cuadrado(5,"Cuadrado");
        //objcuadrado.setArea_figura();
        //objcuadrado.setPerimetro();        
        //System.out.println(objcuadrado.toString());
        
        Circulo objcirculo = new Circulo(7,"Círculo");
        objcirculo.setArea_figura();
        objcirculo.setPerimetro();
        System.out.println(objcirculo.toString());  
        
        Triangulo_equilatero objequilatero = 
                new Triangulo_equilatero(4,6,"Triángulo Equilatero");
        objequilatero.setArea_figura();
        objequilatero.setPerimetro();
        System.out.println(objequilatero.toString());
        
        Otro_Triangulo objOtroTriangulo =
                new Otro_Triangulo(4, 5, 7 , 8, "Otro Triangulo");
        objOtroTriangulo.setArea_figura();
        objOtroTriangulo.setPerimetro();
        System.out.println(objOtroTriangulo.toString());
        
        
    }
}
