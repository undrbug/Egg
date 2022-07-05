/*
Crea un procedimiento EsMultiplo que reciba los dos números pasados por el usuario, validando
que el primer numero múltiplo del segundo y e imprima si el primer numero es múltiplo del
segundo, sino informe que no lo son. 
 */
package manosobra.ej.pkg12;

import java.util.Scanner;

/**
 *
 * @author hGauna
 */
public class ManosObraEj12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int primerNumero, segundoNumero;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        primerNumero = leer.nextInt();
        System.out.println("Ingrese el sefundo numero");
        segundoNumero = leer.nextInt();
        esMultiplo(primerNumero, segundoNumero);
    }
    
    public static void esMultiplo(int num1, int num2){
        if (num1 % num2 == 0) {
            System.out.println("Es multiplo");
        } else {
            System.out.println("No es multiplo");
        }
    }
}
