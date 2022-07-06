/*
Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al 
usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
numero y si se encuentra repetido 
 */
package guia6.ej.pkg16;

import java.util.Scanner;

/**
 *
 * @author hGauna
 */
public class Guia6Ej16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int limite = 10;
        int[] vector = new int[limite];
        for (int i = 0; i < limite; i++) {
            vector[i] = (int) (Math.random() * 10);
            System.out.println(vector[i]);
        }
        System.out.println("Ingrese un numero entero para buscar");
        int buscarNum = leer.nextInt(), contador = 0;
        for (int i = 0; i < limite; i++) {
            if (vector[i] == buscarNum) {
                contador++;
                System.out.println("El numero " + buscarNum + " esta en la posicion " + i);
            }
        }
        if (contador == 0) {
            System.out.println("No se encontro el numero buscado");
        } else if (contador > 1) {
            System.out.println("El numero esta repetido");
        }
    }
    
}
