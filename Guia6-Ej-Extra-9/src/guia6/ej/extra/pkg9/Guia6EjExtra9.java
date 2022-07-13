/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6.ej.extra.pkg9;

import java.util.Scanner;

/**
 *
 * @author hGauna
 */
public class Guia6EjExtra9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cociente = 0, dividendo, divisor, resto = 0;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el dividendo o numero a dividir");
        dividendo = leer.nextInt();
        System.out.println("Ingrese el divisor");
        divisor = leer.nextInt();
        do {
            resto = dividendo - divisor;
            dividendo = resto;
            cociente++;
        } while (resto > divisor);
        /*
        System.out.println("dividendo" + dividendo);
        System.out.println("divisor" + divisor);
        System.out.println("resto" + resto);
        System.out.println("cociente" + cociente);*/
        System.out.println("El resto de la division es " + cociente);
    }
    
}
