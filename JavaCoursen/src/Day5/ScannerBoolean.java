package Day5;

import java.util.Scanner;

public class ScannerBoolean {

    public static void main(String[] args) {

        //boolean

        Scanner a1 = new Scanner(System.in);

        System.out.println("do you want insurance");

        boolean insurance= a1.nextBoolean();

        System.out.println("do you want insurance" +  insurance);

        // new example

        System.out.println("do you want a two ticket");

        boolean twoWay = a1.nextBoolean();

        System.out.println("do you want a two ticket" + twoWay);




    }
}
