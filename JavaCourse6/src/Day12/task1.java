package Day12;
import java.util.Random;
public class task1 {
    public static void main(String[] args) {


        {
    /*
    Write a Java program to input mark of subject Physics
    calculate grade according to given conditions:

    If percentage >= 90% : Grade A
    If percentage >= 80% : Grade B
    If percentage >= 70% : Grade C
    If percentage >= 60% : Grade D
    If percentage >= 40% : Grade E
    If percentage < 40% : Grade F

    //input:
    //     Physics: 90,
    // output
           Grade A
     */

             {


                Random random = new Random();
                int percentage = 1000;//random.nextInt( 101 );

                System.out.println( "Provide a Physics percentage: " + percentage );
                if(percentage >= 90) {
                    System.out.println( "Grade A" );
                } else if(percentage >= 80) {
                    System.out.println( "Grade B" );
                } else if(percentage >= 70) {
                    System.out.println( "Grade C" );
                } else if(percentage >= 60) {
                    System.out.println( "Grade D" );
                } else if(percentage >= 40) {
                    System.out.println( "Grade E" );
                } else if(percentage < 40) {
                    System.out.println( "Grade F" );
                }


            }

        }
    }
}
