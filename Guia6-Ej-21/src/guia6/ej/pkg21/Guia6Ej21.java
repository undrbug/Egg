/*
Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz P de
3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está contenida
dentro de la matriz M. Para ello se debe verificar si entre todas las submatrices de 3x3 que
se pueden formar en la matriz M, desplazándose por filas o columnas, existe al menos una
que coincida con la matriz P. En ese caso, el programa debe indicar la fila y la columna de
la matriz M en la cual empieza el primer elemento de la submatriz P. 
 */
package guia6.ej.pkg21;

/**
 *
 * @author hGauna
 */
public class Guia6Ej21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    // TODO code application logic here
    int dim3 = 3, cont=0, dim10 = 10, f10x10, c10x10, posIniF, posIniC, posFila = 0, posCol = 0;
    int[][] matrizPrincipal = new int[dim10][dim10];
    int[][] matrizSecundaria = new int[dim3][dim3];
    carga10x10(matrizPrincipal);
    carga3x3(matrizSecundaria);
    imprimirMatriz(matrizSecundaria, dim3);
    imprimirMatriz(matrizPrincipal, dim10);
        for (int f = 0; f < dim10; f++) {
            for (int c = 0; c < dim10; c++) {
                f10x10 = f;
                c10x10 = c;                
                if (matrizPrincipal[f][c] == matrizSecundaria[0][0]){
                    posIniF = f;
                    posIniC = c;
                    cont = 0;
                    for (int f3x3 = 0; f3x3 < dim3; f3x3++) {
                        for (int c3x3 = 0; c3x3 < dim3; c3x3++) {
                            if (matrizPrincipal[f10x10][c10x10] == matrizSecundaria[f3x3][c3x3]){
                                cont++; 
                                if (cont == 1){
                                    posFila = f10x10;
                                    posCol = c10x10;
                                }
                                if (c3x3 < dim3-1){
                                    c10x10++;
                                } else {
                                    c10x10 = posIniC;
                                    //break;
                                }
                            } else {
                                //break;
                            }
                        }
                        if (f3x3 < dim3){
                            f10x10 = posIniF + 1;
                        } else {
                            //break;
                        }
                        
                    }
                }
            }
        }
        if (cont == 6) {
            System.out.println("La submatriz comienza en la fila " + posFila + " y columna " + posCol);
        } else {
            System.out.println("No hay submatrices dentro de la matriz principal");
        }
    }
    
    public static void carga3x3(int[][] matriz) {
        matriz[0][0] = 36;
        matriz[0][1] = 5;
        matriz[0][2] = 67;
        
        matriz[1][0] = 89;
        matriz[1][1] = 90;
        matriz[1][2] = 75;
        
        matriz[2][0] = 14;
        matriz[2][1] = 22;
        matriz[2][2] = 26;
    }
    
    public static void carga10x10(int[][] matriz) {
        matriz[0][0] = 1;
        matriz[0][1] = 26;
        matriz[0][2] = 36;
        matriz[0][3] = 47;
        matriz[0][4] = 5;
        matriz[0][5] = 6;
        matriz[0][6] = 72;
        matriz[0][7] = 81;
        matriz[0][8] = 95;
        matriz[0][9] = 10;
        
        matriz[1][0] = 11;
        matriz[1][1] = 12;
        matriz[1][2] = 13;
        matriz[1][3] = 21;
        matriz[1][4] = 41;
        matriz[1][5] = 22;
        matriz[1][6] = 67;
        matriz[1][7] = 20;
        matriz[1][8] = 10;
        matriz[1][9] = 61;
        
        matriz[2][0] = 56;
        matriz[2][1] = 78;
        matriz[2][2] = 87;
        matriz[2][3] = 90;
        matriz[2][4] = 9;
        matriz[2][5] = 90;
        matriz[2][6] = 17;
        matriz[2][7] = 12;
        matriz[2][8] = 87;
        matriz[2][9] = 67;
        
        matriz[3][0] = 41;
        matriz[3][1] = 87;
        matriz[3][2] = 24;
        matriz[3][3] = 66;
        matriz[3][4] = 97;
        matriz[3][5] = 74;
        matriz[3][6] = 87;
        matriz[3][7] = 42;
        matriz[3][8] = 64;
        matriz[3][9] = 35;
        
        matriz[4][0] = 32;
        matriz[4][1] = 76;
        matriz[4][2] = 79;
        matriz[4][3] = 1;
        matriz[4][4] = 20;
        matriz[4][5] = 5;
        matriz[4][6] = 67;
        matriz[4][7] = 96;
        matriz[4][8] = 12;
        matriz[4][9] = 11;
        
        matriz[5][0] = 99;
        matriz[5][1] = 13;
        matriz[5][2] = 54;
        matriz[5][3] = 88;
        matriz[5][4] = 89;
        matriz[5][5] = 90;
        matriz[5][6] = 75;
        matriz[5][7] = 12;
        matriz[5][8] = 41;
        matriz[5][9] = 76;
        
        matriz[6][0] = 67;
        matriz[6][1] = 79;
        matriz[6][2] = 87;
        matriz[6][3] = 45;
        matriz[6][4] = 14;
        matriz[6][5] = 22;
        matriz[6][6] = 26;
        matriz[6][7] = 42;
        matriz[6][8] = 56;
        matriz[6][9] = 78;
        
        matriz[7][0] = 98;
        matriz[7][1] = 45;
        matriz[7][2] = 34;
        matriz[7][3] = 29;
        matriz[7][4] = 32;
        matriz[7][5] = 56;
        matriz[7][6] = 74;
        matriz[7][7] = 16;
        matriz[7][8] = 19;
        matriz[7][9] = 18;
        
        matriz[8][0] = 24;
        matriz[8][1] = 67;
        matriz[8][2] = 97;
        matriz[8][3] = 46;
        matriz[8][4] = 87;
        matriz[8][5] = 13;
        matriz[8][6] = 67;
        matriz[8][7] = 89;
        matriz[8][8] = 93;
        matriz[8][9] = 24;
        
        matriz[9][0] = 21;
        matriz[9][1] = 68;
        matriz[9][2] = 78;
        matriz[9][3] = 98;
        matriz[9][4] = 90;
        matriz[9][5] = 67;
        matriz[9][6] = 12;
        matriz[9][7] = 41;
        matriz[9][8] = 65;
        matriz[9][9] = 12;
    }
    
    public static void imprimirMatriz(int[][] matriz, int dimension){
        for (int f = 0; f < dimension; f++) {
            for (int c = 0; c < dimension; c++) {
                System.out.print(matriz[f][c] + " ");
            }
            System.out.println("");
        }
        System.out.println("");
    }
}
