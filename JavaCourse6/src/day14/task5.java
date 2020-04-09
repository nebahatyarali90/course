package day14;

import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {

        // Determine and print the number of times
        // the character ‘a’ appears in the input entered by the user.

        // input: Test output
        //        a: 0

        // input: Ola amigo
        //        a:2

        //hint: .charAt(), .length(), for, index, counter,
               Scanner input = new Scanner( System.in );
                System.out.println( "Provide a text:" );
                String text = input.nextLine();


                for(int index = 0; index < text.length(); index++) {
                    char letter = text.charAt( index );

                    if(letter == 'a') {
                        System.out.println( "I have my letter: " + letter );
                    }}}}

// int result = 0;
//        for(int index = 0; index < text.length(); index++) {
//            char letter = text.charAt( index );
//
//            if(letter == 'a') {
//                System.out.println( "I have my letter: " + letter );
//                result++;
//            }
//
//        }
//
//        System.out.println( "Result is : " + result );
//
//2.way
//text.length() - text.replace("a","").length()
//    }
//}


