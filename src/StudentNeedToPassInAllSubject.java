import java.util.Scanner;

public class StudentNeedToPassInAllSubject{

        public static void main(String[]args){
                JavaHomework javaHomework=new JavaHomework();
                Scanner scanner=new Scanner(System.in);
                System.out.println("please Enter maths number :- ");
                int maths=scanner.nextInt();
                System.out.println("please Enter science number :- ");
                int science= scanner.nextInt();
                System.out.println("please Enter History number :- ");
                int history= scanner.nextInt();
                if(maths>=35){
                        System.out.println("you are pass");

                }else if(maths<=35){
                        System.out.println("fail (Need to pass in all Subjects) ");
                } else if(science>=35) {
                        System.out.println("you are pass");

                }else if(science<=35){
                        System.out.println("fail (Need to pass in all Subjects)");
                }
                else if(history>=35){
                        System.out.println("you are pass");
        }else if(history<=35){
                        System.out.println("fail (Need to pass in all Subjects)");
                }
        }}









