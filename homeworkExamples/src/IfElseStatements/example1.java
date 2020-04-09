package IfElseStatements;

public class example1 {
    public static void main(String[] args){
        /*Calculate the ticket fine.

        It is a 45 speed zone.

        If the current speed is: 55 to 74

        fine is 100 $

        if the current speed is 75 - 84

        fine is 150 $

        if the current speed is 85 -94

        fine is 320

        if the current speed is more than 94

        fine is 500

        and also

        if the driver does not have a driver licence add 200 dollar extra on his/her fine .

        for example if the current speed is 77 fine is 150 $ and if the driver does NOT have a driver licence

        fine should be 350 $

        to test your code

        change your currentSpeed to 87
        and isDriverLicenceAvailable= true;

        result should be 320

        change your currentSpeed to 65
        and isDriverLicenceAvailable= false;/*

        //result should be 300

    Scanner scan = new Scanner(System.in);

    int currentSpeed = scan.nextInt();







