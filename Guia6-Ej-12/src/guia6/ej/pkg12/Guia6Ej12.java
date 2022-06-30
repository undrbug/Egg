/*
Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser
X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia distinta
de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e
incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las
siguientes funciones de Java Substring(), Length(), equals().
*/
package guia6.ej.pkg12;

import java.util.Scanner;

/**
 *
 * @author hGauna
 */
public class Guia6Ej12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        //System.out.println("Ingrese una cadena");
        //String cadenaIngresada = leer.nextLine().toUpperCase();
        //int longitud;
        String cadenaIngresada;
        int contCorrectas = 0, contIncorrectas = 0;
        do {
            System.out.println("Ingrese una cadena de hasta 5 caracteres");
            cadenaIngresada = leer.nextLine().toUpperCase();
            if (cadenaIngresada.length() == 5) {
                //System.out.println(cadenaIngresada.substring(0,1));
                //System.out.println(cadenaIngresada.substring(4).equals("O"));
                if ((cadenaIngresada.substring(0,1).equals("X")) && (cadenaIngresada.substring(4).equals("O"))) {
                    contCorrectas++;
                } else {
                    contIncorrectas++;
                }
                System.out.println("Es igual a 5");
            } else {
                System.out.println("Por favor revise la cantidad de caracteres ingresados");
                
            }
        } while (!cadenaIngresada.equals("&&&&&"));
        System.out.println("Ingresos correctos: " + contCorrectas);
        System.out.println("Ingresos correctos: " + contIncorrectas);
    }
    
}


/*
    do {
        System.out.println("Ingrese una cadena");
        cadenaIngresada = leer.nextLine().toUpperCase();
        
        System.out.println(cadenaIngresada.length());
        
    } while (!((cadenaIngresada.length() == 5) || (cadenaIngresada.substring(0).equals("X")) || (cadenaIngresada.substring(4).equals("O") )));
       System.out.println("salimos");
*/