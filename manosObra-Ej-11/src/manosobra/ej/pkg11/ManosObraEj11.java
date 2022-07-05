/*
Escribir un programa que procese una secuencia de caracteres ingresada por teclado y terminada
en punto, y luego codifique la palabra o frase ingresada de la siguiente manera: cada vocal se
reemplaza por el carácter que se indica en la tabla y el resto de los caracteres (incluyendo a las
vocales acentuadas) se mantienen sin cambios. 
 */
package manosobra.ej.pkg11;

import java.util.Scanner;

/**
 *
 * @author hGauna
 */
public class ManosObraEj11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase que finalice con un punto");
        String fraseIngresada = leer.nextLine().toLowerCase();
        System.out.println("la frase ingresada es: " + fraseIngresada);
        System.out.println("la frase modificada es: " + codificacion(fraseIngresada));
    }
    
    public static String codificacion(String laFrase) {
        String fraseModificda = "";
        for (int i = 0; i < laFrase.length(); i++) {
            switch(laFrase.substring(i,i+1)) {
                case "a":
                    fraseModificda = fraseModificda + "@";
                    break;
                case "e":
                    fraseModificda = fraseModificda + "#";
                    break;
                case "i":
                    fraseModificda = fraseModificda + "$";
                    break;
                case "o":
                    fraseModificda = fraseModificda + "%";
                    break;
                case "u":
                    fraseModificda = fraseModificda + "*";
                    break;
                default:
                    fraseModificda = fraseModificda + laFrase.substring(i,i+1);
            }
        }
        return fraseModificda;
    }
}
