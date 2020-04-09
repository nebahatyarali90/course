package IfElseStatements;

import java.util.Scanner;
public class IfElse1 {
    public static void main(String[] args) {
        /*2 doubles are created double1 and double2
        if double 1 is greater than  double 2 print "double 1 is greater than double 2"
        if double 1 smaller than double 2 print "double 1 is smaller than double 2"*/

        Scanner scan = new Scanner(System.in);
        double number  = scan.nextDouble();
        double number2  = scan.nextDouble();

        if (number>number2)
        {
            System.out.print ( "double 1 is greater than double 2" );
        }
        if (number<number2)
        {
            System.out.print ("double 1 is smaller than double 2" );
        }
    }
}
