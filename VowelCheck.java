import java.util.Scanner;

public class VowelCheck {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = input.next().charAt(0);
        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println(ch + " is vowel.");
            } 
            else {
                System.out.println(ch + " is consonant.");
            }
        } else {
            System.out.println("Not an alphabet");
        }
    }
}

