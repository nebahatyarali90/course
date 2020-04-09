package Day5;

   import java.util.Scanner;

public class ScannerString {
  public static void main(String[] args) {

    Scanner a= new Scanner(System.in);

    String adress= a.nextLine();
    System.out.println("your adress is "  + adress );


    // example 2

    String name= a.nextLine();
    System.out.println("my name is"  + name );

    //example 3

    String lastName= a.nextLine();
    System.out.println("my last name is " + lastName);


  }


}
