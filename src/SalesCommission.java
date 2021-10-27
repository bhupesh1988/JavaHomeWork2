import java.util.Scanner;

public class SalesCommission {
    public static void main(String []args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Please enter sales id:- ");
        String saleId= scanner.nextLine();
        System.out.print("please enter seller's name :- ");
        String sellerName=scanner.nextLine();
        System.out.print("please enter Sales amount:-");
        int sales= scanner.nextInt();
        System.out.print("please enter Salary Basic:- ");
        int salary=scanner.nextInt();

int commission;
if(sales>=50000){
    commission=sales*35/100;
    System.out.println("commission:"+commission);
}else if(sales>=30000){
    commission=sales*20/100;
    System.out.println("commission:"+commission);}
else if (sales>=20000){
    commission=sales*10/100;
    System.out.println("commission:"+commission);
        }else if(sales>=10000){
            commission=sales*5/100;
    System.out.println("commission:"+commission);
}else{commission=sales*2/100;
    System.out.println("commission:"+commission);}}}



