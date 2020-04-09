package Day4;

import jdk.swing.interop.SwingInterOpUtils;

public class Task1 {

    public static void main(String[] args) {

        // byte-short-char-int-long-float-double
        int number = 50;
        long LongNumber = number;

        System.out.println(number);
        System.out.println(LongNumber);

        //EXP1

        byte byteNumber = 10;
        double doubleNumber = byteNumber;

        System.out.println(byteNumber);

        System.out.println(doubleNumber);

        //exp2


        byte firstByte = 100;
        byte secondByte = 100;

        int sum = firstByte + secondByte;


        short first = 32767;
        short second = 32767;

        int sum1 = first + second;

        // exp4

        int studenta = 90;
        int studentb = 80;
        int studentc = 50;

        double avg = (studenta + studentb + studentc) / 3;

        System.out.println("avarage student");
        System.out.println(avg);


    }
}
