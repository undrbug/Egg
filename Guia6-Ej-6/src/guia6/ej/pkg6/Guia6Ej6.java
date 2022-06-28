/*
Crear un programa que dado un numero determine si es par o impar.
 */
package guia6.ej.pkg6;

import java.util.Scanner;

/**
 *
 * @author hGauna
 */
public class Guia6Ej6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero entero");
        int numIngresado = leer.nextInt();
        if ((numIngresado%2)== 0) {
            System.out.println("El numero " + numIngresado + " es par");
        } else {
            System.out.println("El numero " + numIngresado + " es impar");
        }
    }
    
}
