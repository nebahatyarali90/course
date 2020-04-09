package day14;

public class task2 {
    public static void main(String[] args) {
        //write a java program that sum numbers from 0 to 5
        //using for loop

        //ex: 0 + 1 + 2 + 3 + 4 + 5
        // result: 15



            int result = 0;

            for(int i = 0; i <= 5; i++) {
                result += i;
//            System.out.println( "number: " + i );
            }

            System.out.println( "sum is: " + result );

        }}
