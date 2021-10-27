import java.util.Scanner;

public class EligibleForVote {

    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in );
        System.out.println("Please Enter your Age:-");
        int age= scanner.nextInt();
        if(age>=18){
            System.out.println("congrats you are Eligible for Vote");
        }else {
            System.out.println("sorry you are not Eligible for Vote Wait until your Age is 18");
        }}}
