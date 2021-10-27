import java.util.Scanner;

public class FindIsNumberAlphabetOrSymbol
{
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.print("Enter any Value :- ");
        char ch = scanner.next().charAt(0);
        if(ch >= '0' && ch <= '9'){
            System.out.println(ch + " is A DIGIT.");
        }else if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')){
            System.out.println(ch + " is A ALPHABET.");
        }else {
            System.out.println(ch + " is A SPECIAL CHARACTER.");
        }
    }}
