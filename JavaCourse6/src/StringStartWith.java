import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class StringStartWith {

    public static void main(String[] args) {

        String text = "General Chat";
        System.out.println("is text ends with gener:" + text.endsWith("Gener"));
        System.out.println("is text ends with gener:" + text.endsWith("GeN"));
        System.out.println("is text ends with gener:" + text.endsWith("Ger"));
        System.out.println("is text ends with gener:" + text.endsWith("Chat"));

// exp

 String a = "Hello World";
        System.out.println("is text starts with Hello:" + a.startsWith("Hello"));
        System.out.println("is text starts with Hello:" + a.endsWith("World"));





    }
}


