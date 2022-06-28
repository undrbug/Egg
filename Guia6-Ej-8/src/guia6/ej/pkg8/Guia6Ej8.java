/*
Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo. Si el
usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje por
pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”.
Nota: investigar la función Lenght() en Java.
 */
package guia6.ej.pkg8;

import java.util.Scanner;

/**
 *
 * @author hGauna
 */
public class Guia6Ej8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la frase de hasta 8 caracteres");
        String fraseIngresada = leer.nextLine();
        do {
            if (fraseIngresada.length() > 8) {
                System.out.println("Incorrecto, vuelva a intentar");
                System.out.println("Ingrese la frase de hasta 8 caracteres");
                fraseIngresada = leer.nextLine();
            }
        } while (fraseIngresada.length() > 8);
        System.out.println("Correcto!");
            
            
    }
    
}
