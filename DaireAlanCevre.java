import java.util.Scanner;

public class DaireAlanCevre {
    public static void main(String[] args) {
        int r;
        double pi=3.14,merkezAci, alan, cevre, daireDilimiAlan;

        Scanner input = new Scanner(System.in);

        System.out.print("Dairenin yari capini giriniz:");
        r = input.nextInt();

        System.out.println("Dairenin merkez acisinin olcusunu giriniz.");
        merkezAci = input.nextInt();

        alan = pi * r * r;
        cevre = 2 * pi * r;
        daireDilimiAlan = (pi * (r*r) * merkezAci) / 360;

        System.out.println("Dairenin alani : " + alan);
        System.out.println("Dairenin Cevresi : " + cevre);
        System.out.println("Daire diliminin alani: " + daireDilimiAlan);

    }
}
