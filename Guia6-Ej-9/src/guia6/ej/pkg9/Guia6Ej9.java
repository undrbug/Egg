/*
Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase
es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla que
diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar
la función Substring y equals() de Java.
 */
package guia6.ej.pkg9;

import java.util.Scanner;

/**
 *
 * @author hGauna
 */
public class Guia6Ej9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase que comience con A");
        String fraseIng = leer.nextLine();
        String caracter = fraseIng.substring(0,1);
        System.out.println(caracter);
        if (caracter.toUpperCase().equals("A")) { //aca transformo el primer caracter a mayusculas pero inicialmente no lo hacia. 
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }
    }
}
