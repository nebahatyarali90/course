package IfElseStatements;

import java.util.Scanner;

public class IfElse6 {
    public static void main(String[] args) {
        //   if String str is not null and String length is 14 and String contains to "i love java"
        //print  "String is i love java and 14 character."
        //
        //if String
        //String is not null and String equals ignore case to "i love java"
        //print "String is I love java"

        Scanner scan = new Scanner(System.in);

        String Str  = scan.nextLine();


        {

            System.out.print("String is i love java and 14 character.");

        }
        if(
                (Str!=null)&&  (Str.equalsIgnoreCase("i love java"))
        )
        {

            System.out.print( "String is I love java");


        }


    }

}
