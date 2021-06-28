
package ex13;

import java.util.Scanner;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;
/**
 *
 * @author Jeferson Alves (@jeffalves33)
 */
public class Ex13 {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        System.out.println(":::::Print Squares:::::");
        System.out.print("enter the number: ");
        int amount = Math.abs(entry.nextInt());
        int[] vectorInput = new int[amount];
        int[] vectorOutput = new int[amount];
        String text = "";
        
        //input vector
        for(int i = 0; i < amount; i++){
            System.out.print("[" + (i+1) + "] = ");
            vectorInput[i] = Math.abs(entry.nextInt());
        }
        
        //creating output vector
        for(int i = 0; i < amount; i++){
            vectorOutput[i] = vectorInput[i] * vectorInput[i];
        }
        
        //filling out text
        text += "input  :  [   ";
        for(int i = 0; i < amount; i++) text += vectorInput[i] + "   ";
        text += "]\noutput : [   ";
        for(int i = 0; i < amount; i++) text += vectorOutput[i] + "   ";
        text += "]";
        
        //show message
        JOptionPane.showMessageDialog(null, text, "Print Squares", INFORMATION_MESSAGE);
    }
    
}

