
package ex1;

import java.util.Scanner;

/**
 * @author Jeferson Luiz (@jeffalves33)
 */
public class Ex1 {

    //class Fibonacci
    static long fibonacci(int n){
        //usability of ternary operator
        return (n < 2) ? n : fibonacci(n - 1) + fibonacci(n - 2);
    }
    public static void main(String[] args) {
        Scanner entry = new Scanner (System.in);
        int amount;
        
        System.out.println(":::::Fibonacci:::::\n");
        System.out.print("enter the amount of the Fibonacci sequence: ");
        amount = entry.nextInt();
        
        //casework
        if(amount > 0) for(int i = 0; i < amount; i++) System.out.print("(" + (i+1) + "): " + Ex1.fibonacci(i) + "\t");
        else{
            if(amount < 0 ) System.out.println("ERROR: number less than zero");
            else System.out.printf("(0): 0 \t");
        }
    }
    
}
