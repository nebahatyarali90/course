package Day6;

import jdk.swing.interop.SwingInterOpUtils;

public class StringIndexOf {

    public static void main(String[] args) {
        String text = "Good morning";

        System.out.println( " indexof G: " +  text.indexOf('G') );
        // PART1

        System.out.println("indexof evening: " +  text.indexOf("evening"));
    }
}
