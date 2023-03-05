/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio17;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class Ejercicio17 {

    public static void main(String[] args) {
        double radio,area,perimetro;
        
        Scanner input= new Scanner(System.in);
        
        System.out.println("Digite el radio de la circunferencia: ");
        radio= input.nextDouble();
        
        area= Math.PI*(Math.pow(radio,2));
        perimetro=2*Math.PI*radio;
        
        area=Math.round(area*100)/100d;
        perimetro=Math.round(perimetro*100)/100d;
        
        System.out.println("El area de la circunferencia es aproximadamente: "+area);
        System.out.println("El perimetro de la circunferencia es aproximadamente: "+perimetro);
        
    }
}
