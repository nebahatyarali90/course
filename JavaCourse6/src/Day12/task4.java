package Day12;
import java.util.Random;
public class task4 {
    public static void main(String[] args) {



        {
            /*
                Write a Java program to evaluate exam result of student
                // constraints: use String as input

                ex:
                'A'-> Excellent!!!
                'B'-> Well done
                'C'-> Good
                'D'-> Need improvement
                'F'-> Fail
             */
            {
                String str = "ABCDF";
                //01234
                Random random = new Random();
                int randomIndex = random.nextInt( 5 );

                String examResult = "" + str.charAt( randomIndex );  //String.valueOf( str.charAt(randomIndex) ); //Character.toString(str.charAt(randomIndex));

                System.out.println( "Exam result: " + examResult );

                if(examResult.equals( "A" )) {
                    System.out.println( "Excellent!!!" );
                } else if(examResult.equals( "B" )) {
                    System.out.println( "Well done" );
                } else if(examResult.equals( "C" )) {
                    System.out.println( "Good" );
                } else if(examResult.equals( "D" )) {
                    System.out.println( "Need improvement" );
                } else if(examResult.equals( "F" )) {
                    System.out.println( "Fail" );
                    //second part MARK



                  {
                        /*
                            Write a Java program to evaluate exam result of student
                            // constraints: use String as input

                            ex:
                            'A'-> Excellent!!!
                            'B'-> Well done
                            'C'-> Good
                            'D'-> Need improvement
                            'F'-> Fail
                         */
                      /*  public static void main(String[] args) {
                            String str = "ABCDF";
                            //01234
                            Random random = new Random();
                            int randomIndex = random.nextInt( 5 );
                            String examResult = "" + str.charAt( randomIndex );  //String.valueOf( str.charAt(randomIndex) ); //Character.toString(str.charAt(randomIndex));

                            //with scanner
//        Scanner scan = new Scanner( System.in );
//        System.out.print( "Provide exam result of student[A, B, C, D, F]: " );
//        String examResult = scan.nextLine();

                            System.out.println( "Exam result: " + examResult );

                            String mark = "";
                            if(examResult.equals( "A" )) {
                                mark = "Excellent!!!";
                            } else if(examResult.equals( "B" )) {
                                mark = "Well done";
                            } else if(examResult.equals( "C" )) {
                                mark = "Good";
                            } else if(examResult.equals( "D" )) {
                                mark = "Need improvement";
                            } else if(examResult.equals( "F" )) {
                                mark = "Fail";
                            }

                            System.out.println( mark );*/

                        }
                    }
                }

            }
        }
    }

