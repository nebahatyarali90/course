package Day8;

public class os {

    public static void main(String[] args) {
        int a=10;
        int b=a + ++a + a++ + --a - a--;


        System.out.println(a+ ++a);
        System.out.println(a+ ++a + a++);
        System.out.println(a+ ++a + a++ + --a);
        System.out.println(a + ++a + a++ + --a - a--);
        System.out.println(b);
    }
}
