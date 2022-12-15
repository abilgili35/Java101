import java.util.Scanner;

public class VucutKitleIndexi {
    public static void main(String[] args) {
        double boy, kitleİndexi;
        int kilo;

        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen boyunuzu metre cinsinden giriniz: ");
        boy = input.nextDouble();

        System.out.println("Lutfen kilonuzu giriniz: ");
        kilo = input.nextInt();

        kitleİndexi = kilo / (boy * boy);

        System.out.println("Vucut kitle indexiniz: " + kitleİndexi);
    }
    
}
