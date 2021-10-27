import java.util.Scanner;

public class Student {
    public static void main(String []args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter Student name :-");
        String name= scanner.nextLine();
        System.out.print("please enter Student Roll NO:-");
        int rollno= scanner.nextInt();
        System.out.print("please enter Maths number :-");
        int marks1= scanner.nextInt();
        System.out.print("please enter Science number :-");
        int marks2= scanner.nextInt();
        System.out.print("please enter History number 3:-");
        int marks3=scanner.nextInt();
        int totalmarks=marks1+marks2+marks3;
        System.out.println("total subject marks"+totalmarks);
        float per =totalmarks*100/300;
        System.out.println("Percentage is:- "+per);
        if(per>=80){
            System.out.println("Grade A+");
        }else if(per>=60){
            System.out.println("Grade A");
        }else if(per>=50){
            System.out.println("Grade B");
        }else if(per>=35){
            System.out.println("Grade c");
        }else{
            System.out.println("your are fail");
        }
    }}
