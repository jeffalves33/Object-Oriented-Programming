
package ex5;

import java.util.Scanner;

/**
 *
 * @author Jeferson Alves (@jeffalves33)
 */
public class Ex5 {
    
    //user input
    static void fillMatrix(int[][] matrix, int L, int C){
        Scanner entry = new Scanner(System.in);
        for(int i = 0; i < L; i++){
            for(int j = 0; j < C; j++){
                System.out.print("["+(i+1)+"]" + "["+(j+1)+"]" + ": ");
                matrix[i][j] = entry.nextInt();
            }
        }
    }
    
    //fill retult Matrix
    static void fillMatrixResult(int[][] matrixA, int CA,
                                 int[][] matrixB, int LB,
                                 int[][] matrixR){
        int sum = 0;
        
        //result matrix
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 2; j++){
                matrixR[i][j]  = matrixA[i][0]*matrixB[0][j];
                matrixR[i][j] += matrixA[i][1]*matrixB[1][j];
            }
        }
    }
    
    static void printMatrixResult(int[][] matrixResult, int L, int C){
        for(int i = 0; i < L; i++){
            System.out.print("| ");
            for(int j = 0; j < C; j++){
                System.out.print(matrixResult[i][j] + " ");
            }
            System.out.print("|\n");
        }
    }
    
    
    public static void main(String[] args) {
        int[][] matrizA = new int[2][2];
        int[][] matrizB = new int[2][2];
        int[][] matrizR = new int[2][2];
        
        fillMatrix(matrizA, 2, 2);
        fillMatrix(matrizB, 2, 2);
        fillMatrixResult(matrizA, 2,
                         matrizB, 2,
                         matrizR);
        printMatrixResult(matrizR, 2, 2);
    }
    
}
