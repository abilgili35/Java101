import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int fib_prev=0, fib_next=1, temp=0;
        int elementCount;
        Scanner s = new Scanner(System.in);


        System.out.println("Fibonacci dizisi için eleman sayisini giriniz.");
        elementCount = s.nextInt();

        for(int i=1; i<elementCount; i++)
        {
            if(i == 1)
            {
                System.out.print(fib_prev + " " + fib_next + " ");
            }
            else
            {
                System.out.print(fib_next + " ");
            }
            
            temp = fib_prev + fib_next;
            fib_prev = fib_next;
            fib_next = temp;
            
        }
    }
}
