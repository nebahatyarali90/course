package day15;

public class NestedLoop {

    public static void main(String[] args) {

        for(int i = 0; i < 5; i++) { // outer loop

            for(int j = 0; j < 5; j++) { // inner loop
                System.out.println( "i:" + i + " j:" + j );
            }

            System.out.println();


        }

    }
}


