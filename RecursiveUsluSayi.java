import java.util.Scanner;

public class RecursiveUsluSayi {

    static int recursivePower(int base, int exp)
    {
        if(exp == 0)
        {
            return 1;
        }
        return base * recursivePower(base, exp - 1);
    }
    public static void main(String[] args) {
        int base, exponent;
        Scanner s = new Scanner(System.in);
        
        while(true){
            System.out.print("Taban değerini giriniz: ");
            base = s.nextInt();
            System.out.print("Üs değerini giriniz: ");
            exponent = s.nextInt();
            if(exponent < 0)
                break;
            System.out.println("Sonuç : " + recursivePower(base, exponent) + "\n");
        }

    }
}
