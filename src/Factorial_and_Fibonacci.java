/**
 *
 * @author Julius
 */
public class Factorial_and_Fibonacci {
    
    // Factorial: 5! Recursion
    
    public static int factorial(int number) {
        if(number == 0) {
            return 1;
        }
        return number * factorial(number - 1);
    }

     public static void main(String[] args) {
        System.out.println("Recursion: " + factorial(6));
        
    // and Cycle for
        int num = 7;
        int sum = 1;
    for(int i=1; i<=num; i++) {
        sum = sum * i;

    }
         System.out.println("Factorial of number " + num + " are " + sum + " ( Cycle FOR )");
        
    }
    
}
