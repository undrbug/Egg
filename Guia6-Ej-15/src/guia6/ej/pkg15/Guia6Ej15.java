/*
Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los
muestre por pantalla en orden descendente. 
 */
package guia6.ej.pkg15;

/**
 *
 * @author hGauna
 */
public class Guia6Ej15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int limite = 10;
        int[] vectorEnteros = new int [limite];
        for (int i = 0; i < vectorEnteros.length; i++) {
            vectorEnteros[i] = i+1;
        }
        for (int i = limite-1; i >= 0 ; i--) {
            System.out.println("posicion " + i + " = " + vectorEnteros[i]);
        }
    }
}
