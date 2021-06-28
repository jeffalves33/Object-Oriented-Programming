
package ex8;

import java.io.IOException;
import java.util.Scanner;



/**
 *
 * @author Jeferson Alves (@jeffalves33)
 */
public class Ex8 {
    public static void main(String[] args) throws IOException {
        int answer;
        float value = 0;
        Scanner entry = new Scanner(System.in);
        
        do{
            System.out.println("0 - Debt");
            System.out.println("1 - Credit");
            System.out.println("2 - Exit");
            System.out.print("= ");
            answer = entry.nextInt();
            Runtime.getRuntime().exec("clear"); //clean screen
            switch(answer){
                case 0:
                    System.out.print("value to remove = ");
                    value -= entry.nextFloat();
                    continue;
                case 1:
                    System.out.print("value to add = ");
                    value += entry.nextFloat();
                    continue;
                case 2:
                    System.out.println("Final Balance = " + value);
                    System.exit(0);
                    break;
            }
        }while(answer != 2);
    }
    
}

