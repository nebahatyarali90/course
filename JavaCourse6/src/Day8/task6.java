package Day8;

public class task6 {

    public static void main(String[] args) {
        //12345

        int a= 12345;
        int b=a%12340;//5
        int c=a%1234; //4
        int d=a%100 ;//3
        int e= a%12343;//2
        int f= a% 12345; //1

        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);

    }
}
