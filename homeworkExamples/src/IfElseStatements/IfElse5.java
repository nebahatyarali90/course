package IfElseStatements;

import java.util.Scanner;

public class IfElse5 {
    public static void main(String[] args) {
       /* int number is created in line 8

        if int number is 0 print "Im neutral"

        if int number greater than 0 "I m positive"

        if int number smaller than 0 "I am negative"

        note: if else is statement here*/
        Scanner scan = new Scanner(System.in);

        int number  = scan.nextInt();
        if(number==0)
        {

            System.out.print("Im neutral");

        }
        else if(number>0)
        {

            System.out.print("I m positive");

        }
        else if(number<0)
        {

            System.out.print("I am negative");

        }



    }
}
