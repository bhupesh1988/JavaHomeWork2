import java.util.Scanner;

public class LowerCaseAlphabet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Write uppercase Alphabet To get lowercase Alphabet:- ");
        String userInputString = scanner.nextLine();

        System.out.println("Lowercase Alphabet:- " + userInputString.toLowerCase());

    }
}