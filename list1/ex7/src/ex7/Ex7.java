
package ex7;

import java.util.Random;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;
/**
 *
 * @author Jeferson Alves (@jeffalves33)
 */
public class Ex7 {
    
    //create random notes
    static void fillVector(int[][] turma){
        Random generator = new Random();
        
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 3; j++){
                turma[i][j] = generator.nextInt(11);
            }
        }
    }
    
    //insert in the fourth position: 1 - approved; -1 - failed; 0 - final test.
    static String checkNotes(int[][] turma){
        float currentGrade;
        String text = "";
        
        for(int i = 0; i < 10; i++){
            currentGrade = (turma[i][0] + turma[i][1] + turma[i][2])/3;
            text += "student " + (i+1) + " : " + currentGrade;
            
            //approved
            if(currentGrade > 7){
                turma[i][3] = 1;
                text += " -> approved :)\n";
            }
            
            //disapproved
            else if(currentGrade < 4){
                turma[i][3] = -1;
                text += " -> disapproved :(\n";
            }
            
            //final test
            else{
                turma[i][3] = 0;
                text += " -> finaltest :|\n";
            }
         
        }
        
        return text;
    }
    
    public static void main(String[] args) {
        int[][] turma = new int[10][4];
        
        //function that fills the vector
        fillVector(turma);
        
        //check student status
        String text = checkNotes(turma);
        
        JOptionPane.showMessageDialog(null, text, "Final Grades", INFORMATION_MESSAGE);
    }
}
