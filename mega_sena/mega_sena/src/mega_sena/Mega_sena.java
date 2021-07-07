
package mega_sena;

import java.util.Random;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.WARNING_MESSAGE;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;

/**
 *
 * @author Jeferson Alves (@jeffalves33)
 */
public class Mega_sena {
    
    static void printElements(int[][] matrix,int[] vector,int amount){
        String text = "sorteios anteriores\n";
        
        for(int i = 0; i < (amount - 1); i++){
            for(int j = 0; j < 6; j++){
                text += matrix[i][j] + "   ";
            }
            text += "\n";
        }
        
        text += "último sorteio\n";
        
        for(int w = 0; w < 6; w++) text += vector[w] + "   ";
        
        JOptionPane.showMessageDialog(null, text, amount + " Draws", INFORMATION_MESSAGE);
    }
    
    //função necessária para fazer a verificação se o elemento já existe.
    static int checkOccurrence(int line, int column, int matrix[][], int vector[], int valueActual){
        Random gerator = new Random();
        int counter = 0;
        
        //se a função foi chamada para modificar a matriz
        if(vector == null) while(counter < column){
                //se o valor já existir
                if(valueActual == matrix[line][counter]){
                    valueActual = gerator.nextInt(61);
                    counter = 0;
                }else counter++;
            }
        
        //se a função foi chamada para modificar o vector
        if(matrix == null) while(counter < line){
                //se o valor já existir
                if(valueActual == vector[counter]){
                    valueActual = gerator.nextInt(61);
                    counter = 0;
                }else counter++;
            }
        return valueActual;
    }
    
    //função que cria os sorteios
    static void returnDraw(int matrix[][], int vector[], int amount){
        int valueActual;
        Random gerator = new Random();
        
        //se a função foi chamada para modificar a matriz
        if(vector == null){
            //laço necessário para criar a matrix
            for(int i = 0; i < (amount - 1); i++) for(int j = 0; j < 6; j++){
                valueActual = gerator.nextInt(61);
                valueActual = checkOccurrence(i, j, matrix, null, valueActual); //verifica ocorrência
                matrix[i][j] = valueActual;
            }  
        }
        //se a função foi chamada para modificar o vetor
        if(matrix == null){
            //laço necessário para criar o vetor
            for(int i = 0; i < 6; i++){
                valueActual = gerator.nextInt(61);
                valueActual = checkOccurrence(i, 0, null, vector, valueActual); //verifica ocorrência
                vector[i] = valueActual;
            }
        }
    }
    
    public static void main(String[] args) {
        int amount;
        
        //caso seja sempre adicionado o numero 0 (zero)
        do{
            amount = Math.abs(Integer.parseInt(JOptionPane.showInputDialog(
                     null, 
                     "number of bets: ",
                     "Amount",
                     WARNING_MESSAGE)));
        }while(amount == 0);
        
        int matrix[][] = new int[(amount - 1)][6];
        int vector[]   = new int[6];
    
    
        //seu primeiro argumento seria a matrix, o segundo o vecor. dependendo
        //aonde for null, ele modifica uma matrix sem o último sorteio, ou o vetor
        //(o último sorteio).
        returnDraw(matrix, null, amount); //modifica sorteio (matrix)
        returnDraw(null, vector, amount); //modifica sorteio (vector)
        
        printElements(matrix, vector, amount);
    }
    
}
