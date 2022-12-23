import java.util.Scanner;



public class RecursiveFibonacci {
    
    static int recursiveFibonacci(int num)
    {
        if( (num == 1) || (num == 2))
        {
             return 1;
        }
        
        return recursiveFibonacci(num - 1) + recursiveFibonacci(num - 2);
        
    }
    public static void main(String[] args) {
        int fibNum;
        Scanner s = new Scanner(System.in);

        System.out.print("Fibonacci sayisi:");
        fibNum = s.nextInt();
        System.out.println("Fibonacci " + fibNum + " = " + recursiveFibonacci(fibNum));
    }
}
