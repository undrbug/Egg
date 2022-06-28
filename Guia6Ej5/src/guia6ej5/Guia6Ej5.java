/*
Escribir un programa que lea un número entero por teclado y muestre por pantalla el
doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt().
 */
package guia6ej5;

import java.util.Scanner;

/**
 *
 * @author hGauna
 */
public class Guia6Ej5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero entero positivo");
        int numIngresado = leer.nextInt();
        System.out.println("El doble de " + numIngresado + " es: " + numIngresado*2);
        System.out.println("El triple de " + numIngresado + " es: " + numIngresado*3);
        System.out.println("La raiz cuadra de " + numIngresado + " es: " + Math.sqrt(numIngresado));
    }
    
}
