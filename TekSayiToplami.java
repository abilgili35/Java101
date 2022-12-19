import java.util.Scanner;

public class TekSayiToplami {
    public static void main(String[] args) {
        int n, total1=0, total2=0;

        Scanner s  = new Scanner(System.in);

        do{
            System.out.print("Sayi Giriniz : ");
            n = s.nextInt();
            if( n % 2 == 0)
            {
                total1 += n;
            }
            if(n % 4 == 0)
            {
                total2 += n;
            }

        }while( (n % 2) == 0);
        
        System.out.println("Cift sayilarin toplami: " + total1);
        System.out.println("Dordun kati sayilarin toplami: " + total2);
    }

    
}
