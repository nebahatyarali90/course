import jdk.swing.interop.SwingInterOpUtils;

public class day33 {

    public static void main(String[] args) {
        String isim= "nebahat" ;
        int skor = 100;
         String not = "";

        if (skor>90) {
            not = "A+";}
       else if(skor>80) {
            not = "B-";
        }else   if(skor>65)
        {not="c+";}
        else if (skor==55)
        {not="D-";}
        else
        {not="F";}

        System.out.println(" nebahat"+not+"aldi" );




    }
}
