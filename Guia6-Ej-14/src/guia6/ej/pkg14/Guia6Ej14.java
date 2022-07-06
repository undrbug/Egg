/*
Crea una aplicación que a través de una función nos convierta una cantidad de euros
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).

 */
package guia6.ej.pkg14;

import java.util.Scanner;

/**
 *
 * @author hGauna
 */
public class Guia6Ej14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el monto en euros a convertir");
        double monto = leer.nextDouble();
        int convertirA;
        do {
            System.out.println("Seleccione la moneda a la que quiere convertir");
            System.out.println("1 - para dolar");
            System.out.println("2 - para yen");
            System.out.println("3 - para libra");
            System.out.println("4 - para salir");
            convertirA = leer.nextInt();
            switch (convertirA) {
                case 1:
                    cambioDivisas(monto, "dolar");
                    break;
                case 2:
                    cambioDivisas(monto, "yen");
                    break;                
                case 3:
                    cambioDivisas(monto, "libra");                
                    break;   
                default:
                    System.out.println("Revise los datos ingresados");
            }
        }while (convertirA != 4);
    }
    
    public static void cambioDivisas(double monto, String cambiarA) {
        switch (cambiarA) {
            case "dolar":
                System.out.println(monto + " euros a " + cambiarA + " son " + (monto*1.03) + " uss");
                break;
            case "yen":
                System.out.println(monto + " euros a " + cambiarA + " son " + (monto*139.13) + " yenes");
                break;                
            case "libra":
                System.out.println(monto + " euros a " + cambiarA + " son " + (monto*0.86) + " libras");
        }
    }
}