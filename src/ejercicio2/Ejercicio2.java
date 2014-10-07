/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import java.util.Scanner;

/**
 *
 * @author Oscar
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float area,lado;
        
        System.out.println("Lado:");
        Scanner dato=new Scanner(System.in);
        lado=dato.nextFloat();
        
        area=lado*lado;
        System.out.println("Area="+area);
    
    
    }
    
}
