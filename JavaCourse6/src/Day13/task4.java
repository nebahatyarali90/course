package Day13;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        // write a program to check pin code
        // run it until user enters correct pin code
        // CORRECT PIN: 9999

        // constraints: user should provide an integer
        int correctPIN = 9999;

        Scanner input = new Scanner( System.in );
        System.out.println( "Welcome to our system, please provide a pin to enter: " );
        int userPIN = input.nextInt();

        while(userPIN != correctPIN) {
            System.out.println( "Incorrect provide a new pin: " );
            userPIN = input.nextInt();
        }

        System.out.println( "entered to system!!!" );


    }

}


