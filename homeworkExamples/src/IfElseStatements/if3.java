package IfElseStatements;
import java.util.Scanner;

public class if3 {
    public static void main(String[] args) {
      /*  Two String is created str1 and str 2

        if str1 equals to str2 print "String 1 is equal to String 2"
        if str1 is not equal to str2 print "String 1 is NOT equal to String 2"*/
        Scanner scan = new Scanner(System.in);

        String str1  = scan.nextLine();

        String str2  = scan.nextLine();

        if (str1.equals(str2))
        {
            System.out.print ( "String 1 is equal to String 2");

        }

        if (!str1.equals(str2))
        {
            System.out.print ("String 1 is NOT equal to String 2");

        }


    }
}
