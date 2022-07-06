/*
Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la
traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se obtiene
cambiando sus filas por columnas (o viceversa). 
 */
package guia6.ej.pkg18;

import java.util.Scanner;

/**
 *
 * @author hGauna
 */
public class Guia6Ej18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int limite = 4;
        int[][] matrizA = new int[limite][limite];
        int[][] matrizB = new int[limite][limite];
        //cargo con valores aleatorios la matriz
        for (int i = 0; i < limite; i++) {
            for (int j = 0; j < limite; j++) {
                matrizA[i][j] = (int) (Math.random() * 100);
                System.out.print(matrizA[i][j] + " ");
            }
            System.out.println("");
        }
        //Genero la trspuesta supuestamente 
        for (int i = 0; i < limite; i++) {
            for (int j = 0; j < limite; j++) {
                matrizB[j][i] = matrizA[i][j];
            }
        }
        System.out.println("");
        //para mostra como queda la matriz
        for (int i = 0; i < limite; i++) {
            for (int j = 0; j < limite; j++) {
                System.out.print(matrizB[i][j] + " ");
            }
            System.out.println("");
        }
    }
    
}
