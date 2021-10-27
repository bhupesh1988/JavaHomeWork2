import java.util.Scanner;

public class JavaHomework {
 public static void main(String[] args){
     Scanner scanner =new Scanner(System.in);
     System.out.print("please Enter First number:-");
     int number= scanner.nextInt();
     System.out.print("please Enter Second number:-");
     int a= scanner.nextInt();
     // Ternary operator to check to odd or even
       String result =number%2==0 ? "Even" : "odd";
       System.out.println(number +" is "+ result);
       String name =a%2==0 ? "Even" : "odd";
       System.out.println(a +" is "+ name);}
}
