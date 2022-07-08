/*
Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el
cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * *
*     *
*     *
* * * *
 */
package guia6.ej.pkg13;

import java.util.Scanner;

/**
 *
 * @author hGauna
 */
public class Guia6Ej13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un entero representado la cantidad de elementos");
        int elementos = leer.nextInt();
        for (int i=0; i <= elementos-1; i++){
            if (i==0 || i==elementos-1){
                for (int j=0; j < elementos; j++) {
                    System.out.print("*");
                }
                System.out.println("");
            } else {
                for (int j = 0; j <= elementos-1; j++){
                    if (j==0 || j==elementos-1){
                        System.out.print("*");
                    } else {
                        System.out.print(" 4");
                    }
                }
                System.out.println("");
            }
        }
    }
}
