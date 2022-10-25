package AssignmentActivity2;

import java.util.Scanner;

public class questionTwo {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        double number1, number2, gcd;

        System.out.print("Enter two numbers: ");
        number1 = input.nextDouble();
        number2 = input.nextDouble();

        if (number1 > number2) {
            gcd = number2;
        }
        else {
            gcd = number1;
        }
        while (
                !(number1 % gcd == 0 &&
                        number2 % gcd == 0)
        ){
            gcd--;
        }
        System.out.println( "The Highest Common Factor is " + gcd + "");
    }
}
