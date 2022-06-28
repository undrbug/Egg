/*
Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda
en minúsculas.
 */
package guia6.ej.pkg3;

import java.util.Scanner;

/**
 *
 * @author hGauna
 */
public class Guia6Ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la frase");
        String frase = leer.nextLine();
        System.out.println(frase);
        System.out.println("La frase en mayusculas es: " + frase.toUpperCase());
        System.out.println("La frase en minusculas es: " + frase.toLowerCase());
    }
    
}
