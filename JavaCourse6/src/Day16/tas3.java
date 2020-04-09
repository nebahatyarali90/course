package Day16;


import java.util.Random;

public class tas3 {
    public static void main(String[] args) {
        // create an array with size 10
        // populate your array with random numbers using Random or Math.random()


                //step 1: create array with size 10
                int[] randomNumbers = new int[10];

                //step 2: create random class to get random numbers
                Random rand = new Random();

                for(int index = 0; index < randomNumbers.length; index++) {
                    randomNumbers[index] = rand.nextInt( 100 );
                }


    }
}
