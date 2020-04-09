package IfElseStatements;
import java.util.Scanner;
public class IfElse2 {
    public static void main(String[] args) {
        //Create 2 doubles. double 1 is 90.25 . double 2 is 90.25.
        //if double 1 greater than double 2 print "Hello World"
        //if double 1 smaller than double 2 print "Not Hello World"
        //else "I love java"
        Scanner scan = new Scanner(System.in);
        double number  = scan.nextDouble();
        double number2  = scan.nextDouble();

        if (number>number2)
        {
            System.out.print ( "Hello World");
        }

        else if (number<number2)
        {
            System.out.print ("Not Hello World");
        }
        else
            {System.out.print ("I love java");}


    }
}








