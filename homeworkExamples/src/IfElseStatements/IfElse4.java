package IfElseStatements;
import java.util.Scanner;

public class IfElse4 {
    public static void main(String[] args) {

        //create a number
        //if the  remainder of int number when divided by 2 is equal to 0
        //   print "number is a EVEN number"
        //
        //if the  remainder of int number when divided by 2 is NOT equal to 0
        //   print "number is a ODD number"

        Scanner scan = new Scanner(System.in);
        int number  = scan.nextInt();

        if((number%2)==0)
        {

            System.out.print("number is a EVEN number");

        }
        else if((number%2)!=0)
        {

            System.out.print("number is a ODD number"
            );


        }


    }
}
