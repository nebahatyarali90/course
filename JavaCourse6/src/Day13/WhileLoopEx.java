package Day13;

public class WhileLoopEx {
    public static void main(String[] args) {
        // sum number in range

            // sum numbers between 0 and 5, including 5; 0+1+2+3+4+5;

            int result = 0;

            int number = 0;
            while(number <= 5) {
                System.out.print( result + " + " + number );
                result += number; // result = result + number;
                System.out.println( " = " + result );

                ++number;
            }

        }

    }



