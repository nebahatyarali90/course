package Day10;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner dp = new Scanner(System.in);

        int room = dp.nextInt();

        if (room > 3) {
            System.out.println("no have more than 3");
            if (room == 3) ;
            System.out.println("rent is 2500 ");
        } else if (room == 2) {
            System.out.println("rent is 200 ");

        } else if (room == 1) {
            System.out.println("rent is 1500 ");
        } else if (room == 0) {
            System.out.println("rent is 1300 ");
        }
    }
}

