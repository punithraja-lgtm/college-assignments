import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int factorial = 1;   

        if (number < 0) {
            System.out.println("Factorial is not possible");
        } 
        else {

           
            for (int i = 1; i <= number; i++) {  
                factorial = factorial * i;
            }

            System.out.println("Factorial of " + number + " = " + factorial);
        }
    }
}



