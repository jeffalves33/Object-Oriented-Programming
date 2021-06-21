
package ex2;

import java.util.Scanner;

/**
 * @author Jeferson Alves (@jeffalves33)
 */
public class Ex2 {

    static void checkTriangle(float a, float b, float c){
        float ab,ac,bc;
        ab = Math.abs(a-b);
        ac = Math.abs(a-c);
        bc = Math.abs(b-c);
        
        //casework
        if((ab < c && c < (a + b)) || (ac < b && b < (a + c)) || (bc < a && a < (b + c))){
            System.out.println("IS triangle!!!");
            //check if it is equilateral, isosceles or scalene
            //equilateral
            if(a == b && b == c) System.out.println("equilateral.");
            //isosceles
            if(a == b || a == c || b == c) System.out.println("isosceles.");
            //scalene
            if(a != b && a != c && b != c) System.out.println("scalene.");
        }
            else System.out.println("NOT is triangle!!!");
    }
    
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        float a,b,c;
        
        System.out.println(":::::check if it's triangle:::::");
        
        System.out.print("\nenter the first value: ");
        a = entry.nextFloat();
        System.out.print("enter the second value: ");
        b = entry.nextFloat();
        System.out.print("enter the third value: ");
        c = entry.nextFloat();
        
        checkTriangle(a,b,c);
    }
    
}
