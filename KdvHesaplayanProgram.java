import java.util.Scanner;

public class KdvHesaplayanProgram {
    public static void main(String[] args) {
        double tutar, kdvOrani, kdvTutar, kdvliTutar;
        boolean kosul1, kosul2;

        Scanner input = new Scanner(System.in);
        
        System.out.println("Ucret Tutarini Giriniz.\n");
        tutar = input.nextDouble();
        tutar = (tutar < 0) ? 0 : tutar;
         
        kosul2 = tutar > 1000;
        kosul1 = (0 <= tutar) && (tutar <= 1000);
        kdvOrani = kosul1 ? 0.18 : kosul2 ? 0.08 : null;
        kdvTutar = tutar * kdvOrani;
        kdvliTutar = tutar + kdvTutar;
        
        System.out.println("KDVsiz Tutar: " + tutar);
        System.out.println("KDV orani: " + kdvOrani);
        System.out.println("KDVli Fiyat: " + kdvliTutar);
        System.out.println("KDV Tutari: " + kdvTutar );
        
    }
}
