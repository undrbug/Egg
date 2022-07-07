/*
Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la
suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que
permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
El programa deberá comprobar que los números introducidos son correctos, es decir,
están entre el 1 y el 9. 
 */
package guia6.ej.pkg20;

/**
 *
 * @author hGauna
 */
public class Guia6Ej20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //int[][] matriz = new int[3][3];
        int lim = 3, sumaFila = 0, sumaCol = 0, diagPrinc = 0, diagSec = 0, cont = 0;
        int[][] matriz = {{2,7,6},{9,5,1},{4,3,8}};
        //sumo diagonal principal
        for (int i = 0; i < lim; i++) {
                    diagPrinc = diagPrinc + matriz[i][i];
        }
        for (int c = lim-1; c >= 0; c--) {
            diagSec = diagSec + matriz[(lim-1)-c][c];
        }
        for (int i = 0; i < lim; i++) {
            sumaFila = 0;
            sumaCol = 0;            
            for (int j = 0; j < lim; j++) {
                sumaFila = sumaFila + matriz[i][j];
                sumaCol = sumaCol + matriz[j][i];
            }
            if (sumaFila == sumaCol){
                cont++;
            }else{
                break;
            }
            System.out.println(sumaFila + " " +sumaCol + "# " + cont);
        }
        if (cont == 3 && diagPrinc == diagSec){
            System.out.println("Es maaagica");
        }else{
            System.out.println("no, no es maaagicaaa");
        }
    }
    
}
