import java.sql.SQLOutput;
import java.util.Scanner;

public class FindLeapYear {

    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        // leap year checked
        System.out.println("please enter year:-");
        int year = scanner.nextInt();
        boolean leap = false;
        if (year % 4 == 0) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not leap year ");
        }
    }}
