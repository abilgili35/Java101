import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class SinifGecmeDurumu {
    public static void main(String[] args) {
        int mat, fizik, turkce, kimya, muzik, total=0, lessonCount=0;
        double average;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuz : ");
        mat = input.nextInt();
        if( (mat >= 0) && (mat <=100)){
            total += mat;
            lessonCount++;
        }

        System.out.print("Fizik notunuz : ");
        fizik = input.nextInt();
        if( (fizik >= 0) && (fizik <=100)){
            total += fizik;
            lessonCount++;
        }

        System.out.print("Turkce notunuz : ");
        turkce = input.nextInt();
        if( (turkce >= 0) && (turkce <=100)){
            total += turkce;
            lessonCount++;
        }

        System.out.print("Kimya notunuz : ");
        kimya = input.nextInt();
        if( (kimya >= 0) && (kimya <=100)){
            total += kimya;
            lessonCount++;
        }

        System.out.print("Muzik notunuz : ");
        muzik = input.nextInt();
        if( (muzik >= 0) && (muzik <=100)){
            total += muzik;
            lessonCount++;
        }

        if(lessonCount==0)
        {
            System.out.println("Gecerli bir ders notu girilmedi.Ortalama hesaplanamadi");
        }
        else{
            average = total / lessonCount;
            if( average <= 55)
            {
                System.out.println("Sinifta Kaldiniz.Seneye tekrar gorusmek uzere.");
            }
            else{
                System.out.println("Tebrikler.Sinifi gectiniz.");
            }

            System.out.print("Ortalamaniz : " + average);
        }
        

    }
    
}
