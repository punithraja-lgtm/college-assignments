import java.util.Scanner;

public class FibonacciSum {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter how many terms (n): ");
        int n = input.nextInt();

        int a = 0;    
        int b = 1;    
        int sum = 0;  

        for (int i = 1; i <= n; i++) {
            sum = sum + a;  
            int next = a + b; 
            a = b;
            b = next;
        }

        System.out.println("Sum of Fibonacci series up to " + n + " terms = " + sum);
    }
}
