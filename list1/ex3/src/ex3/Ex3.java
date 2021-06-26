package ex3;

import java.util.ArrayList; //required for dynamic array allocation
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;
import static javax.swing.JOptionPane.QUESTION_MESSAGE;
import static javax.swing.JOptionPane.WARNING_MESSAGE;

public class Ex3 { 
    static void checkCousin(int[] vector){
        boolean check = true;
        int counter;
        ArrayList<Integer> newVector = new ArrayList<>();
        String a = "[ ", b = "[ ";
        
        for(int i = 0 ; i < vector.length; i++){
            if(vector[i] == 2 || vector[i] == 3 || vector[i] == 5 || vector[i] == 7){
                check = true;
            }else{
                if(vector[i]%2 == 0) check = false;
                if(vector[i]%3 == 0) check = false;
                if(vector[i]%5 == 0) check = false;
                if(vector[i]%7 == 0) check = false;
            }

            if(check) newVector.add(vector[i]);
            check = true;
        }
        
        for(int j = 0; j < vector.length; j++){ //creating vector string 
            a += vector[j] + " ";
        }
        counter = newVector.size();
        for(int w = 0; w < counter; w++){ //creating newVector string
            b += newVector.get(w) + " ";
        }
        a += "]";
        b += "]";
        
        JOptionPane.showMessageDialog(null, 
                                      "vector: " + a + "\n" + 
                                      "prime vector: " + b,
                                      "Prime Numbers",
                                      INFORMATION_MESSAGE);
    }
    
    public static void main(String[] args) {
        int amount;
        int vector[] = new int[(Integer.parseInt(JOptionPane.showInputDialog(null, 
                                                 "how many elements: ",
                                                 "Prime Numbers",
                                                 QUESTION_MESSAGE)))];
        
        for(int i = 0; i < vector.length; i++){
            vector[i] = Integer.parseInt(JOptionPane.showInputDialog(null, 
                                                                     "element[" + (i+1) + "]: ",
                                                                     "Prime Numbers",
                                                                     WARNING_MESSAGE));
        }
        
        checkCousin(vector);
        //JOptionPane.showMessageDialog(null, amount);
    }
    
}