/*
Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */
package guia6.ej.pkg4;

import java.util.Scanner;

/**
 *
 * @author hGauna
 */
public class Guia6Ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese los grados centigrados");
        double gradosC = leer.nextDouble();
        double gradosF = 32 + (gradosC*9/5);
        System.out.println("Los " + gradosC + " grados Centigrados son " + gradosF + " grados Fahrenheit");
    }
}
