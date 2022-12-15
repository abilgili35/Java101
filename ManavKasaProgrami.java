import java.util.Scanner;

public class ManavKasaProgrami {
    public static void main(String[] args) {
        double armutKiloFiyati=2.14,  elmaKiloFiyati=3.67, domatesKiloFiyati=1.11,
        muzKiloFiyati=0.95, patlicanKiloFiyati=5.0;
        double armutKilo, elmaKilo, domatesKilo, muzKilo, patlicanKilo, toplam;

        Scanner input = new Scanner(System.in);

        System.out.print("Armut kac kilo :");
        armutKilo = input.nextDouble();

        System.out.print("Elma kac kilo :");
        elmaKilo = input.nextDouble();

        System.out.print("Domates kac kilo :");
        domatesKilo = input.nextDouble();

        System.out.print("Muz kac kilo :");
        muzKilo = input.nextDouble();

        System.out.print("Patlican kac kilo :");
        patlicanKilo = input.nextDouble();

        toplam = (armutKilo * armutKiloFiyati) + (elmaKilo * elmaKiloFiyati) + 
        (domatesKilo * domatesKiloFiyati) + (muzKilo * muzKiloFiyati) + (patlicanKilo * patlicanKiloFiyati);

        System.out.print("Toplam Fiyat: " + toplam);


    }
    
}
