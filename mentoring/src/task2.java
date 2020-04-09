import java.util.Scanner;

public class task2 {




    public static void main(String[] args) {

    //Task 1
    //Get a value from the user
    //Write a program to print numbers from 1 to user input using do while loop.

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a limit: ");
        int userInput = input.nextInt();
        int i = 0;

        do{
            System.out.println(i);
            i++;
        }while(i <= userInput);


        int sum = 1;
        do{
            sum *=i; // sum = sum * i;
            i++;
        }while(i <= userInput);
        System.out.println(sum);
// wrong something











}}
