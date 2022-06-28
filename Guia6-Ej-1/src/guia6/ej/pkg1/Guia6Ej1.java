/*
Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
dos. El programa deberá después mostrar el resultado de la suma
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
