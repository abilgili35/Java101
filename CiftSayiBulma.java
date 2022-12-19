
import java.util.Scanner;

public class CiftSayiBulma {
    public static void main(String[] args) {
        int k;

        Scanner s = new Scanner(System.in);
        System.out.println("Sayi giriniz : ");
        k = s.nextInt();

        for(int i=0; i <= k; i++)
        {   
            if((i % 3 == 0) || (i % 4 == 0))
                System.out.println(i);
        }
}
}
