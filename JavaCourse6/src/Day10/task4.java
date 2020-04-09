package Day10;
import java.util.Scanner;
public class task4 {
    public static void main(String[] args) {
        Scanner dp = new Scanner(System.in);

        System.out.println("Enter your budget.");
        int budget = dp.nextInt();


        if(budget>=7500){
            System.out.println("you can travel anywhere in the world");

        }else if (budget <7500 && budget >= 5000){

            System.out.println(" you can travel anywhere except Australia");

        }else if(budget < 5000 && budget >= 3000){
            System.out.println("you can travel US and europe");

        }else if (budget < 3000){
            System.out.println("Stay at home");
        }


    }
    }

