import java.util.Scanner;

public class Faktoriyel {
    public static void main(String[] args) {
        int n, r;
        int n_factorial, r_factorial, n_r_factorial;

        Scanner s = new Scanner(System.in);

        System.out.print("N sayisini giriniz : ");
        n = s.nextInt();
        System.out.print("R sayisini giriniz : ");
        r = s.nextInt();

        n_factorial = 1;
        for(int i=1; i<=n; i++)
        {
            n_factorial *= i;
        }

        r_factorial = 1;
        for(int i=1; i<=r; i++)
        {
            r_factorial *= i;
        }

        n_r_factorial = 1;
        for(int i=1; i<=(n-r); i++)
        {
            n_r_factorial *= i;
        }

        
        System.out.println("\nC(" + n + "," + r + ") = " + (n_factorial / (r_factorial * n_r_factorial)) );
    }
}
