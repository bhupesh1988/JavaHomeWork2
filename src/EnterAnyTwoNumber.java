import java.util.Scanner;

public class EnterAnyTwoNumber {
    public static void main(String []args){
        int one, two, number, subtract, multiply;
        float devided;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please Enter Two Numbers : ");
        one = scanner.nextInt();
        two = scanner.nextInt();
        number = one + two;
        subtract = one - two;
        multiply = one * two;
        devided = (float) one / two;
        System.out.println("Addition = " + number);
        System.out.println("Subtraction = " + subtract);
        System.out.println("Multiplication = " + multiply);
        System.out.println("Division = " + devided);
    }
}
