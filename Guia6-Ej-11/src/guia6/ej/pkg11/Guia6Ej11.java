/*
Realizar un programa que pida dos números enteros positivos por teclado y muestre por
pantalla el siguiente menú:
 */
package guia6.ej.pkg11;

import java.util.Scanner;

/**
 *
 * @author hGauna
 */
public class Guia6Ej11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        boolean quiereSalir = false;
        while (!quiereSalir) {
            //System.out.println("\033[H\033[2J");
            //System.out.flush();
            System.out.println("Ingrese un numero entero");
            double numIngr1 = leer.nextInt();
            System.out.println("Ingrese otro numero entero");
            double numIngr2 = leer.nextInt();
            System.out.println("Menu:");
            System.out.println("1.Sumar");
            System.out.println("2.Restar");
            System.out.println("3.Multiplicar");
            System.out.println("4.Dividir");
            System.out.println("5.Salir");
            System.out.println("Elija una opcion:");
            int opcion = leer.nextInt();
            switch (opcion) {
                case 1: System.out.println("La summa de " + numIngr1 + " + " + numIngr2 + " = " + (numIngr1+numIngr2));
                        break;
                case 2: System.out.println("La resta de " + numIngr1 + " - " + numIngr2 + " = " + (numIngr1-numIngr2));
                        break;
                case 3: System.out.println("La multiplicacion de " + numIngr1 + " * " + numIngr2 + " = " + (numIngr1*numIngr2));
                        break;
                case 4: System.out.println("La division de " + numIngr1 + " / " + numIngr2 + " = " + (numIngr1/numIngr2));
                        break;
                case 5: System.out.println("Esta seguro que desea salir? Oprima S para salir o cualquier tecla para continuar");
                        String salir = leer.next();
                        salir = salir.toUpperCase();
                        if (salir.equals("S")){
                            quiereSalir = true;
                            System.out.println("Hasta la proxima");
                            break;
                        } else {
                            System.out.println("Revise la opcion elegida");
                        }
            }
        }
    }
}
