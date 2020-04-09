package Day16;

public class JavaForEach {
    public static void main(String[] args) {
        String[] names = {"Alice", "Bob", "Trudy"};
        //for-each loop
        for(String name : names) {
            System.out.println( name );
        }




        //regular for loop
//        for(int i = 0; i < names.length; i++) {
//            System.out.println( names[i] );
//        }


        int[] scores = {50, 90, 100, 75};

        // create regular for using scores.fori
        // create reversed for using scores.forr
        // create for-each using scores.for

        for(int score : scores) {
            System.out.println(score);
        }

        for(int i = 0; i < scores.length ; i++) {
            int score = scores[i];

            System.out.println(score);
        }
    }
}


