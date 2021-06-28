
package ex11;

import java.util.Scanner;

/**
 *
 * @author Jefersol Alves (@jeffalves33)
 */
public class Ex11 {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        System.out.println("::::: Check it's natural:::::");
        System.out.print("enter the number: ");
        int natural = Math.abs(entry.nextInt()); //se it is negative
        int counter = 1;
        int sum = 0;
        
        do{
            if(natural%counter == 0) sum += counter;
            counter++;
        }while(counter < natural);
        
        if(natural == sum) System.out.println("the number " + natural + " is perfect");
        else System.out.println("the number " + natural + " is NOT perfect");
    }
    
}

