package day4;

import jdk.swing.interop.SwingInterOpUtils;

import javax.management.MBeanAttributeInfo;
import java.sql.SQLOutput;

public class ExcampleJavaString

{
    public static void main(String[] args) {
        System.out.println("weather is");
        System.out.println("71");
        System.out.println("F");

     //PART2

        String text ="Weather is";

        int degree =22;

        char f ='F';

        System.out.print(text + degree+ "" + f );

        // part 3


        double weight = 67.5;

        String unit = "lbs";

        System.out.print("weight + lbs" );
    }
}
