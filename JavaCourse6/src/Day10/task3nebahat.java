package Day10;

import java.util.Scanner;

public class task3nebahat {

    public static void main(String[] args) {
        Scanner dp = new Scanner(System.in);

        int x = dp.nextInt();
        int a = 32;
        int b = 10;
        int remainderv = 30 % 10;

        if (a > b) {
            System.out.println("a>b should be");
        } else if (remainderv == 4) {
            System.out.println(" a divide by 2 is 4");
            if (remainderv == 3) {
                System.out.println(" a divide by 2 is 3");
                if (remainderv == 2) ;
                System.out.println(" a divide by 2 is 2 ");
            } else if (remainderv == 1) {
                System.out.println(" a divide by 2 is 1 ");

            } else if (remainderv == 0) {
                System.out.println(" a divide by 2 is 0");
            }
        }
    }
}
