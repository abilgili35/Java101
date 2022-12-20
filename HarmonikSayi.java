import java.util.Scanner;

public class HarmonikSayi {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("N sayisini giriniz : ");
        int n = s.nextInt();
        double result = 0.0;
        for(double i=1; i<=n; i++){
            result += (1/i);
        }
        System.out.print("Sonuc : " + result);
    }
}
