import java.util.Scanner;

public class HipotenusBulanProgram {
    public static void main(String[] args) {
        int a, b;
        double c, cevre, alan, u;

        Scanner input = new Scanner(System.in);
        System.out.println("1. Kenari Giriniz: ");
        a = input.nextInt();
        System.out.println("2. Kenari Giriniz: ");
        b = input.nextInt();

        c = Math.sqrt((a*a) + (b*b));
        System.out.println("Hipotenus :" + c);

        u = (a + b + c) / 2;
        cevre = 2 * u;
        alan = Math.sqrt((u - a) * (u - b) * (u - c) * u);
        System.out.println("Cevre : " + cevre);
        System.out.println("Alan : " + alan);
}
}
   
