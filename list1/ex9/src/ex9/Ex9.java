
package ex9;


import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.QUESTION_MESSAGE;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;

/**
 *
 * @author Jeferson Alves (@jeffalves33)
 */
public class Ex9 {
    public static void main(String[] args){
        float minimumWage, kilowatts, valueWageK, amount, discount;
        String text = "";
        
        //wage
        //System.out.println("minimumWage: ");
        minimumWage = Float.parseFloat(JOptionPane.showInputDialog(null, "minimumWage(R$): ", null, QUESTION_MESSAGE));
        
        //the value in reais of each kilowatt
        valueWageK = (float) (0.00125 * minimumWage); 
        
        //kilowatt
        //System.out.println("amount of kilowatt: ");
        kilowatts = Float.parseFloat(JOptionPane.showInputDialog(null, "amount of kilowatt: ", null, QUESTION_MESSAGE));
        
        //the amount in reais to be paid
        amount = valueWageK * kilowatts; 
        
        //new amount to be paid with a 15% discount
        discount = (float) (0.85 * amount);
        
        text += "Wage    : R$ " + minimumWage + "\n";
        text += "Kilowatt: R$ " + kilowatts + "\n\n";
        
        text += "every kilowatt: R$ " + valueWageK + "\n";
        text += "value in reais: R$ " + amount + "\n";
        text += "with discount : R$ " + discount + "\n";
        System.out.print("meu pau");
        //JOptionPane.showMessageDialog(null, text, "Result", INFORMATION_MESSAGE);
    }
    
}

