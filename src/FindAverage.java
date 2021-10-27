import java.util.Scanner;

public class FindAverage {
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter first number: ");
        double number1 = sc.nextDouble();
        System.out.print("Please enter second number: ");
        double number2 = sc.nextDouble();
        System.out.print("Please enter third number: ");
        double number3 = sc.nextDouble();
        System.out.print("Please enter forth number:");
        double number4= sc.nextDouble();
        System.out.print("Please enter Fifth number");
        double number5= sc.nextDouble();
        System.out.print("The average of 5 numbers is: " +calculateAverage(number1,number2,number3,number4, number5));
        sc.close();
    }
    public static double calculateAverage(double number1, double number2, double number3,double number4,double number5)
    {
        return (number1 + number2 + number3 + number4 + number5) / 4;
    }
}
