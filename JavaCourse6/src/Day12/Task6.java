package Day12;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        // Write a Java program that takes a year from user
        // and print whether that year is a leap year or not.
        Scanner scan = new Scanner( System.in );
        System.out.print( "enter num " );
        int num = scan.nextInt();
                if (num%4==0){
                    System.out.println( "not leap year");
                    if(num%100==0){
                        System.out.println("leap year");
                        if(num%400==0){
                            System.out.println("not leap year");

                     /*       Scanner in = new Scanner( System.in );

                            System.out.print( "Input the year: " );
                            int year = in.nextInt();

                            boolean x = (year % 4) == 0;
                            boolean y = (year % 100) != 0;
                            boolean z = ((year % 100 == 0) && (year % 400 == 0));

                            if(x && (y || z)) {
                                System.out.println( year + " is a leap year" );
                            } else {
                                System.out.println( year + " is not a leap year" );*/
                            }
                        }


                    }


    }
}
