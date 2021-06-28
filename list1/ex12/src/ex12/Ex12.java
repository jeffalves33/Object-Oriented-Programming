
package ex12;

import java.util.Scanner;

/**
 *
 * @author Jeferson Alvese (@jeffalves33)
 */
public class Ex12 {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        System.out.println("::::: Check if it's perfect triangle:::::");
        System.out.print("enter the number: ");
        int natural = Math.abs(entry.nextInt()); //se it is negative
        int i;
        
        //will take the last consecutive multiplication less than the number
        for(i = 1; i*(i+1)*(i+2) < natural; i++);
        
        if(i*(i+1)*(i+2) == natural) System.out.println("the number " + natural + " is perfect triangle");
        else System.out.println("the number " + natural + " is NOT perfect triangle");
    }
    
}

