package IfElseStatements;
import java.util.Scanner;

public class IfElse9 {
    public static void main(String[] args) {
        //String is str
        //
        //if String equals to Orange and length of the String is 6
        //      print "Orange has six letters"
        //if String equals to Apple and length of the String is 5
        //      print "Apple has five letters"
        //if String contains Orange and length of the String is bigger then 10
        //      print "String contain orange and length is more then 10"
        Scanner scan = new Scanner(System.in);

        String str  = scan.nextLine();

        if(str.equals(Orange) && str.length()==6)
        {

            System.out.print("Orange has six letters");

        }
        if (str.equals(Apple)&&str.length()==5)
        {

            System.out.print( "Apple has five letters");


        }

        if(str.contains(Orange)&& str.length()>10)
        {

            System.out.print("String contain orange and length is more then 10");

        }



    }
}
