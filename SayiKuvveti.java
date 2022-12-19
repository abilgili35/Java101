import java.util.Scanner;

public class SayiKuvveti {
    public static void main(String[] args) {
        int n, k;

        Scanner s = new Scanner(System.in);
        System.out.println("Sinir sayisini giriniz.");
        n = s.nextInt();

        for(int j=4; j<=5; j++)
        {
            System.out.println(j + " sayisinin " + n + " sayisina kadar olan katlari:");
            k=1;
            while( k <= n)
            {
             System.out.println(k);
             k *= j;
            }
        }
        
    }
}
