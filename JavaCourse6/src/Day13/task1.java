package Day13;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        // Ask user to provide a number;
        // calculate sum from 0 to provided number
        // ex: provided number: 2
        //     0+1+2 => 3

            Scanner input = new Scanner( System.in );
            System.out.println( "Provide a number, please:" );

            int lastNumber = input.nextInt();
            int result = 0;
            int currentNumber = 0;

            while(currentNumber <= lastNumber) {
                result += currentNumber;//0,1,2,3,4....till last number

                currentNumber++;

            }

            System.out.println( "sum is: " + result );


        }
    }




