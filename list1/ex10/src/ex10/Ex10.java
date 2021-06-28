
package ex10;

import java.util.Scanner;

/**
 *
 * @author Jeferson Alves (@jeffalves33)
 */
public class Ex10 {
    static float sum(float a, float b){
        return a + b;
    }
    /static float subtration(float a, float b){
        return Math.abs(a - b);
    }
    static float division(float a, float b){
        if(b == 0) return 0;
        else return a/b;
    }
    static float multiplication(float a, float b){
        return a * b;
    }
    
    public static void main(String[] args) {
        int answer;
        float a, b;
        float result;
        Scanner entry = new Scanner(System.in);
        
        do{
            System.out.println("\n1 - Sum");
            System.out.println("2 - Subtration");
            System.out.println("3 - Division");
            System.out.println("4 - Multiplication");
            System.out.println("5 - Exit");
            System.out.print("= ");
            answer = entry.nextInt();
            
            switch(answer){
                case 1:
                    System.out.print("first value  : ");
                    a = entry.nextFloat();
                    System.out.print("secound value: ");
                    b = entry.nextFloat();
                    result = sum(a, b);
                    System.out.print("sum result: " + result);
                    continue;
                case 2:
                    System.out.print("first value  : ");
                    a = entry.nextFloat();
                    System.out.print("secound value: ");
                    b = entry.nextFloat();
                    result = subtration(a, b);
                    System.out.print("subtration result: " + result);
                    continue;
                case 3:
                    System.out.print("first value  : ");
                    a = entry.nextFloat();
                    System.out.print("secound value: ");
                    b = entry.nextFloat();
                    result = division(a, b);
                    System.out.print("division result: " + result);
                    continue;
                case 4:
                    System.out.print("first value  : ");
                    a = entry.nextFloat();
                    System.out.print("secound value: ");
                    b = entry.nextFloat();
                    result = multiplication(a, b);
                    System.out.print("multiplication result: " + result);
                    continue;
                case 5:
                    System.exit(0);
                    break;
            }
        }while(answer != 2);
    }
    
}
