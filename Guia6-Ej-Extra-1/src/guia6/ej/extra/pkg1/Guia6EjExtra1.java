/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6.ej.extra.pkg1;

import java.util.Scanner;

/**
 *
 * @author hGauna
 */
public class Guia6EjExtra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese la cantidad de minutos");
        int minutos = leer.nextInt();
        int dias = (minutos/60)/24;
        int horas = (minutos/60)-(dias*24);
        System.out.println(dias);
        System.out.println(horas);
    }
    
}
