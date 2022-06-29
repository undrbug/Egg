/*
Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
números al usuario hasta que la suma de los números introducidos supere el límite inicial.
 */
package guia6.ej.pkg10;

import java.util.Scanner;

/**
 *
 * @author hGauna
 */
public class Guia6Ej10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        //String letra = leer.nextLine(); // ingreso por teclado un o unos caracteres
        //char caracter = letra.charAt(0); // extraigo el primer caracter por si es que ingreso varios
        //System.out.println(caracter); // imprimo el caracter extraido
        System.out.println("Ingrese un valor para el limite positivo");
        int limite = leer.nextInt();
        //int numIngresado;
        int suma = 0;
        while (suma < limite) {
            System.out.println("Ingrese un numero para ir sumando");
            suma = suma + leer.nextInt();
        }
        System.out.println("El total sumado es: " + suma);
    }
    
}
