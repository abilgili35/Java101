import java.util.Scanner;

public class YildizUcgen {
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        System.out.println("Bir Sayı Giriniz :");
        int n = klavye.nextInt();

        for (int i = 1; i < n*2 ; i++) {
            if(i <= n)
            {
                for (int j = 0; j < (n - i); j++) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= (2 * i) - 1; k++) {
                    System.out.print("*");
                }
            }else{
                for (int j = 0; j < (i%n); j++) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= (2 * (n - (i%n))) - 1; k++) {
                    System.out.print("*");
                }
            }
            
            
            System.out.println(" ");
        }

    }
}
