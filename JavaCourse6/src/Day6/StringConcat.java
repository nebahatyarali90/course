package Day6;


import jdk.swing.interop.SwingInterOpUtils;

public class StringConcat

{

    public static void main(String[] args) {

        String name = "Michael";
        String surname = "Jackson";
        String fullName = name +  " "  + surname;

        System.out.println(fullName);

        // concat

        String result = name.concat(surname);

        System.out.println(fullName);

        //EXP1

        String name1 = "Michael";

        System.out.println(name1.concat(  " is awesome " ));

        //exp2

        String n = "hi";

        System.out.println(n.concat(  " there!!" ));

        // exp3

        String a = "hi";
        String second = "all";

        System.out.println ( a.concat (   second ) );
//                         hi +     all






    }
}
