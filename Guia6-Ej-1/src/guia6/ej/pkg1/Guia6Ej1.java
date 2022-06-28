/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6.ej.pkg1;

import java.util.Scanner;

/**
 *
 * @author hGauna
 */
public class Guia6Ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el primer numero entero");
        int firsNum = leer.nextInt();
        System.out.println("Ingrese el segundo numero entero");
        int secNum = leer.nextInt();  
        System.out.println("la suma de los numeros ingreados es: " + (firsNum + secNum));

    }
    
}
