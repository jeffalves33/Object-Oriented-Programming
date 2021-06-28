package ex4;

import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;

/**
 *
 * @author Jeferson Alves (@jeffalves33)
 */
public class Ex4 {

    public static void main(String[] args){
        String matrix = "";
        int j;
        for(int i = 0; i < 10; i++){
            for(j = 0; j < 10; j++){
                if(j == i) matrix += "1      ";
                else matrix += "0      ";
            }
            matrix += "\n";
        }
        JOptionPane.showMessageDialog(null, matrix, "MATRIX", INFORMATION_MESSAGE);
    }
    
}

