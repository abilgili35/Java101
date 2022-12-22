import java.util.Scanner;

public class TersUcgen {
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        System.out.println("Bir Sayı Giriniz :");
        int n = klavye.nextInt();

        for (int i = 1; i <= n ; i++) {
            
            for (int j = 0; j < i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * (n - i) + 1; k++) {
                System.out.print("*");
            }
            
            
            
            System.out.println(" ");
        }
    }
}
