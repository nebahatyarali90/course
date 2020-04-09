package Day16;

import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        //create an array of vegetables with size 5
        //provide names of vegetable using scanner
        // print them in one line using for-each loop

        //ex: Enter vegetable name: Tomato
        //    Enter vegetable name: Potato
        // Vegetables: Tomato, Potato


        Scanner  vega = new Scanner(System.in);

        System.out.println("enter vegatables name:");
        String vegatable=vega.nextLine();
        String[] vegas = {"carrot ", "garlic ", "onion " ,"letuce "};
        for (String ve : vegas) {
            System.out.print(ve);

        }


    }}

