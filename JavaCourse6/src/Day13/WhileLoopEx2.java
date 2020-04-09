package Day13;

import java.util.Scanner;

public class WhileLoopEx2 {
    public static void main(String[] args) {


            String button = "";

            Scanner input = new Scanner( System.in );
            while(!button.equals( "x" )) {
                System.out.println( "Program is running..." );

                button = input.nextLine();
            }

            System.out.println( "Program is closed!!!" );
        }

    }


