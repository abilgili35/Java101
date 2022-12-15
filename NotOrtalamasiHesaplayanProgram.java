import java.util.Scanner;

public class NotOrtalamasiHesaplayanProgram 
{
    public static void main(String[] args) {
        // Değişkenleri olustur
        int mat, fizik, kimya, turkce, tarih, muzik;

        // Scanner sınıfımızı tanımladık
        Scanner input = new Scanner(System.in);

        // Kullanıcıdan değerleri al 
        System.out.print("Matematik notunuz: ");
        mat = input.nextInt();

        System.out.print("Fizik notunuz: ");
        fizik = input.nextInt();

        System.out.print("Kimya notunuz: ");
        kimya = input.nextInt();

        System.out.print("Türkçe notunuz:");
        turkce = input.nextInt();

        System.out.print("Tarih notunuz:");
        tarih = input.nextInt();

        System.out.print("Müzik notunuz:");
        muzik = input.nextInt();

        double sonuc = (mat + fizik + kimya + turkce + tarih + muzik) / 6.0;
        System.out.println("Ortalamaniz: " + sonuc); 
        System.out.println( sonuc >= 60 ? "Gecti" :  "Kaldi");
        

    }
    
}
