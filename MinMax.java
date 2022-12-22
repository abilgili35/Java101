import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        int count;
        int n, min=0, max=0;
        Scanner s = new Scanner(System.in);
        System.out.println("Kac tane sayi gireceksiniz.");
        count = s.nextInt();
        
        for(int i=1; i <= count; i++)
        {
            System.out.print(i + ". sayiyi giriniz.");
            n = s.nextInt();
            if(n > max)
            {
                max = n;
            }
            if(n < min)
            {
                min = n;
            }
            
        }

        System.out.println("En buyuk sayi : " + max);
        System.out.println("En kucuk sayi : " + min);
    }
}
