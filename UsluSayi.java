import java.util.Scanner;

public class UsluSayi {
    public static void main(String[] args) {
        int n,k;
        int total=1;
        
        Scanner s = new Scanner(System.in);
        
        System.out.print("Ussu alinacak sayi : ");
        n = s.nextInt();
        System.out.print("Us olacak sayi : ");
        k = s.nextInt();

        for(int i=1; i<=k; i++){
            total *= n;
        }

        System.out.print("Cevap : " + total);
    }
}
