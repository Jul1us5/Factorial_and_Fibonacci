/**
 *
 * @author Julius
 */
public class Factorial_and_Fibonacci {
    
    // Factorial: number! Recursion
    
    public static int Factorial(int number) {
        if(number == 0) {
            return 1;
        }
        return number * Factorial(number - 1);
    }
    
    // Fibonacci
    
    public static int Fibonacci() {

         int num1 = 1;
         int num2 = 1;
         int plus = 0;
         System.out.println(1);

        for (int i = 0; i <=i; ++i) {
            if(plus > 200) {
                return num1;
            }
            plus = num1 + num2;
            num1 = num2;
            num2 = plus;
            System.out.println(num1);

        }
        return plus;
    }    
    

     public static void main(String[] args) {
        System.out.println("Factorial Recursion: " + Factorial(6));
        
        
    // and Cycle for
        int num = 7;
        int sum = 1;
    for(int i=1; i<=num; i++) {
        sum = sum * i;

    }
         System.out.println("Factorial of number " + num + " are " + sum + " ( Cycle FOR )");
         
         
         System.out.println("Fibonacci: " + Fibonacci() + " next step over 200");
         

        
    }
    
}
