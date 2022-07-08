/*
Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
de 2 dígitos, etcétera (hasta 5 dígitos). 
 */
package guia6.ej.pkg17;

/**
 *
 * @author hGauna
 */
public class Guia6Ej17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //String.valueOf(numEntero);
        int limite = 100, contador1D = 0, contador2D = 0, contador3D = 0, contador4D = 0, contador5D = 0;
        int[] vector = new int[limite];
        String intToString;
        for (int i = 0; i < limite; i++) {
            vector[i] = (int) (Math.random() * 10000);
        }
        for (int i = 0; i < limite; i++) {
            intToString = String.valueOf(vector[i]);
            switch (intToString.length()) {
                case 1:
                    contador1D++;
                    break;
                case 2:
                    contador2D++;
                    break;
                case 3:
                    contador3D++;
                    break;
                case 4:
                    contador4D++;
                    break;
                case 5:
                    contador5D++;
                    break;
            }
        }
        System.out.println(contador1D);
        System.out.println(contador2D);
        System.out.println(contador3D);
        System.out.println(contador4D);
        System.out.println(contador5D);
    }

}
