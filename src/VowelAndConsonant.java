import java.util.Scanner;

public class VowelAndConsonant {
    public static void main(String[ ] arg) {
        int i=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("please Enter a character:- ");
        char character=sc.next( ).charAt(0);
        if(character=='a'||character=='e'||character=='i'||character=='o'||character=='u'||character=='A'||character=='E'||character=='I'||character=='O'||character=='U')
        {System.out.println("Entered character "+character+" is  Vowel");
        } else if((character>='a'&&character<='z')||(character>='A'&&character<='Z'))
            System.out.println("Entered character "+character+" is Consonant");
        else
            System.out.println("Not an alphabet");
}}
