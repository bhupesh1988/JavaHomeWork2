import javax.swing.*;
import java.util.Scanner;

public class InterchangedValue {
    public static void main(String [] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print(" Before Interchange The Value:-");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("value of a:" + a);
        System.out.println("value of b:" + b);
        System.out.println("After Interchange the Value");
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("value of a:" + a);
        System.out.println("value of b:" + b);

    }}
