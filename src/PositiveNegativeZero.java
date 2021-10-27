import java.util.Scanner;
public class PositiveNegativeZero {
    public static void main(String[] args){
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please Enter a number: ");
        number = scanner.nextInt();
// if number is greater then Zero then number is positive
        if(number>0)
        {
            System.out.println("The number is positive.");
        }
// if number is less then Zero then number is negative
        else if(number<0)
        {
            System.out.println("The number is negative.");
        }
        else
        {
            System.out.println("The number is zero.");
        }}}


