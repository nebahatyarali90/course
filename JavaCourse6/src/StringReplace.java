public class StringReplace {

    public static void main(String[] args) {
        String a = "hello world";
        System.out.println("before changing: " + a);
        System.out.println("changing o with A : " +a.replace("o","A"));
        System.out.println("changing hello with hi: " +a.replace("hello","hi"));
//

        System.out.println("changing  ''  with ','"+ a.replace("",","));

    }
}
