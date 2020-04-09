package day4;

import org.w3c.dom.ls.LSOutput;

public class task2 {
    public static void main(String[] args) {
        double decimel =1.7;

        short shortNumber =(short)decimel;

        System.out.println(decimel);
        System.out.println(shortNumber);



      //part2
        long bigNumber= 2_147_483_648L;

        int  num = (int) bigNumber;

        System.out.println(bigNumber);
        System.out.println(num);

        //part3

        short numa = 128;

        byte byteValue  =  (byte) numa;

        System.out.println(numa);
        System.out.println(byteValue);


        System.out.println((byte)126);
        System.out.println((byte)127);
        System.out.println((byte)128);

       // byte range =128 and -127






    }
}
