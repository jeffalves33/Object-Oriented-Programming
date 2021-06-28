
package ex14;

import java.util.Scanner;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;

/**
 *
 * @author Jeferson Alves (@jeffalves33)
 */
public class Ex14 {
    
    static float checkBigger(float[] vector, int size){
        float bigger = vector[0];
        
        for(int i = 0; i < size; i++) if(vector[i] > bigger) bigger = vector[i];
        
        return bigger;
    }
    
    static float checkMinor(float[] vector, int size){
        float minor = vector[0];
        
        for(int i = 0; i < size; i++) if(vector[i] < minor) minor = vector[i];
        
        return minor;
    }
    
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        System.out.println(":::::Print Notes:::::");
        System.out.print("enter the number of notes: ");
        int amount = Math.abs(entry.nextInt());
        float[] vectorInput = new float[amount];
        float mean = 0;
        float minorNote, biggerNote;
        String text = "";
        
        //input vector
        for(int i = 0; i < amount; i++){
            System.out.print("note[" + (i+1) + "] = ");
            vectorInput[i] = Math.abs(entry.nextFloat());
            mean += vectorInput[i]; //sum
        }
        
        //look for notes
        minorNote  = checkMinor(vectorInput, amount);
        biggerNote = checkBigger(vectorInput, amount);
        
        mean = mean/amount; //mean
        
        //filling in text
        text += "[   ";
        for(int i = 0; i < amount; i++) text+= vectorInput[i] + "   ";
        text += "]\n";
        text += "note minor : " + minorNote + "\n";
        text += "note bigger: " + biggerNote + "\n";
        text += "mean       : " + mean + "\n";
        
        //show
        JOptionPane.showMessageDialog(null, text, "Print Notes", INFORMATION_MESSAGE);
    }
    
}

