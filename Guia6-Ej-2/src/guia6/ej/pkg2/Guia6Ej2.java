/*
Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por
pantalla.
 */
package guia6.ej.pkg2;

import java.util.Scanner;

/**
 *
 * @author hGauna
 */
public class Guia6Ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Por favor ingrese su nombre");
        String nombre = leer.next();
        System.out.println("Bienvenido " + nombre);
    }
    
}
