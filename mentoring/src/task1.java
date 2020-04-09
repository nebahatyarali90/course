import java.util.Scanner;

public class task1 {


    public static void main(String[] args) {

        /*
        Create one int

            if int is = 0
            print the i dont have any sibling

            if int is  = 1
            print the I have one sibling

            if int is = 2
            print the I have two sibling

            if int is more then 2
            print I have too many siblings

     */
        Scanner num= new Scanner(System.in);

   int num1 = num.nextInt();
        switch (num1) {
            case 0:
                System.out.println("i dont have any siblings");
                break;
            case 1:
                System.out.println(" I have one sibling ");
                break;
            case 2:
                System.out.println("I have two sibling");
                break;
                default:
                System.out.println("I have too many siblings");
        }
    }
}