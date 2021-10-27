import java.util.Scanner;

public class PrintCityName {
    public static void main(String []argu){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Please Enter Alphabet from a to f then you will get their City Name :- ");
        char cityname=scanner.next().charAt(0);
        if(cityname=='a'){
            System.out.println("a for Allahabad");
        }else if(cityname=='b'){
            System.out.println("b for Bhopal");
        }else if (cityname=='c'){
            System.out.println("c for Chennai");
        }else if(cityname=='d'){
            System.out.println("d for Daman");
        }else if(cityname=='e'){
            System.out.println("e for Edinburgh ");
        }else if(cityname=='f'){
            System.out.println("f for Faridabad ");
        }
    }
}
