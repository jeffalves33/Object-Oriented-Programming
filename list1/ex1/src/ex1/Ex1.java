/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1;

import java.util.Scanner;

/**
 *
 * @author michelangelo
 */
public class Ex1 {

    static long fibonacci(int n){
        return (n < 2) ? n : fibonacci(n - 1) + fibonacci(n - 2);
    }
    public static void main(String[] args) {
        Scanner entry = new Scanner (System.in);
        int amount;
        
        System.out.println("enter the amount of the Fibonacci sequence: ");
        amount = entry.nextInt();
        
        if(amount > 0) for(int i = 0; i < amount; i++) System.out.print("(" + (i+1) + "):" + Ex1.fibonacci(i) + "\t");
        else{
            if(amount < 0 ) System.out.printf("ERROR: number less than zero");
            else System.out.printf("(0): 0 \t");
        }
    }
    
}
