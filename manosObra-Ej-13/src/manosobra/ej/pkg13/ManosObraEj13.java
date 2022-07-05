/*
Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de compañeros de equipo y
define su tipo de dato de tal manera que te permita alojar sus nombres más adelante.  
 */
package manosobra.ej.pkg13;

import java.util.Scanner;

/**
 *
 * @author hGauna
 */
public class ManosObraEj13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de compañeros");
        int cantCompañeros = leer.nextInt();
        String Equipo[] = new String[cantCompañeros];
        for (String element:Equipo){
            System.out.println("Ingrese el nombre de su compañero");
            element = leer.next();
        }
        
    }
    
}
