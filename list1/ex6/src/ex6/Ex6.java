
package ex6;

import java.util.Random;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;

/**
 *
 * @author Jeferson Alves (@jeffalves33)
 */
public class Ex6 {
    static void printVector (int[] vector,int[] copyVector){
        String textVector = "[     ";
        String textCopyVector = "[     ";
        
        for(int i = 0; i < 10; i++){
            textVector += vector[i] + "     ";
            textCopyVector += copyVector[i] + "     ";
        }
        textVector += "]";
        textCopyVector += "]";
        
        JOptionPane.showMessageDialog(null, textCopyVector + "\n" +
                                            textVector, "Result", INFORMATION_MESSAGE);
    }
    
    static void bubbleSort(int[] vector){
        int aux;
        for(int i = 0; i < 9; i++){
            for(int j = (i+1); j < 10; j++){
                if(vector[i] > vector[j]){
                    aux = vector[i];
                    vector[i] = vector[j];
                    vector[j] = aux;
                }
            }
        }
    }
    
    public static void main(String[] args) {
        int[] vector = new int[10];
        int[] copyVector = new int[10];
        Random generator = new Random();
        
        for(int i = 0; i < 10; i++){
            vector[i] = generator.nextInt(11);
            copyVector[i] = vector[i];
        }
        
        bubbleSort(vector);
        printVector(vector, copyVector);
    }
    
}
