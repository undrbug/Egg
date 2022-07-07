/*
Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que una
matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada de
signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se
denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).  
 */
package guia6.ej.pkg19;

import java.util.Random;

/**
 *
 * @author hGauna
 */
public class Guia6Ej19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int lim = 3, contador = 0;
        //int[][] matrizA = new int[lim][lim];
        //cargarMatriz(matrizA,lim);
        int[][] matrizA = {{1,2,3},{8,5,3},{2,3,4}};
        imprimirMatriz(matrizA,lim);
        //int[][] matrizAt = new int[lim][lim];
        //cargarMatriz(matrizAt,lim);
        int[][] matrizAt = {{-1,-8,-2},{-2,-5,-3},{-3,-3,-4}};
        imprimirMatriz(matrizAt,lim);
        //comparo con la trspuesta para ver si es anti simetrica
        for (int i = 0; i < lim; i++) {
            for (int j = 0; j < lim; j++) {
                if (matrizA[i][j] == (matrizAt[j][i])*-1){
                    contador++;
                    //System.out.println("hay alguno que cumple");
                }
            }
        }
        if (contador == lim*lim){
            System.out.println("Es antiSimetrica");
        }else{
            System.out.println("No es antiSimetrica");
        }
    }
    
    public static void cargarMatriz(int matriz[][], int lim) {
        Random random=new Random();
        for (int i = 0; i < lim; i++) {
            for (int j = 0; j < lim; j++) {
                matriz[i][j] = (random.nextInt(20)-10); //-10 + (int) (Math.random()*10);
            }
        }
    }
    
    public static void imprimirMatriz(int matriz[][], int lim){
        for (int i = 0; i < lim; i++) {
            for (int j = 0; j < lim; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("");
    }
}
