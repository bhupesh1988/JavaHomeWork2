import java.util.Scanner;

public class WhatIsDay
{ public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.print("Enter date 1 to 7 you will get which day on that day :-");
        int week = scanner.nextInt();
        if(week == 1) {
            System.out.println("Monday");
        } else if(week == 2) {
            System.out.println("Tuesday");
        } else if(week == 3) {
            System.out.println("Wednesday");
        } else if(week == 4) {
            System.out.println("Thursday");
        } else if(week == 5) {
            System.out.println("Friday");
        } else if(week == 6) {
            System.out.println("Saturday");
        } else if(week == 7) {
            System.out.println("Sunday");
        } else {
            System.out.println("Please within (1 to7) any number in a week .");
        }}}

