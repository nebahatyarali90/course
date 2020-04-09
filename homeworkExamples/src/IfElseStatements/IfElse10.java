package IfElseStatements;

public class IfElse10 {
    public static void main(String[] args) {
        //Create a double is 45
        //if double divide by 5 reminder is 0 and double divide by 8 reminder is 0 and
        //print "able to divide by 5 and 8"
        //if double divide by 10 reminder is 5 and double divide by 9 reminder is 0 and
        //print "able to divide by 9 and divide by 10 reminder is 5"
        double num = 45.00;

        if ((num%5==0 ) && (num%8==0))
        {
            System.out.print("able to divide by 5 and 8");

        }


        if ((num%10==5 ) && (num%9==0))
        {
            System.out.print("able to divide by 9 and divide by 10 reminder is 5");

        }




    }
}
