package IfElseStatements;

public class IfElse8 {
    public static void main(String[] args) {
        /*create one int 60

        if int divided by 9 and remainder is 0 and  divided by 5 remainder is 0
        print "Able to divide by 9 and 5"

        if int divided by 4 remainder is 0 and int divided by 15 remainder is 0
        print "Able to divide by 4 and 15"*/
        int num = 60;

        if((num%9==0) && (num%5==0))
        {

            System.out.print("Able to divide by 9 and 5");

        }
        if((num%4==0) && (num%15==0))
        {

            System.out.print( "Able to divide by 4 and 15");


        }






    }
}
