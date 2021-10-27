import java.util.Scanner;

public class Employee {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("please Enter Employee id:-");
        String id= scanner.nextLine();
        System.out.println("please enter Employee name:- ");
        String name= scanner.nextLine();
        System.out.println("please employee's basic salary:- ");
        double salary= scanner.nextDouble();
        double HRA = salary*10/100;
        System.out.println("Employee's HRA:"+HRA+"");
        double DA= salary*8/100;
        System.out.println("Employee's DA :"+DA+"");
        double TA = salary*9/100;
        System.out.println("Employee's TA :"+TA+"");
        double PF = salary*20/100;
        System.out.println("Employee's PF"+PF+"");
        double GrossSalary=salary+HRA+DA+TA-PF;
        System.out.println("Gross Salary :"+GrossSalary+"");







    }




}




