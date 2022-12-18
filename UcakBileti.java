import java.util.Scanner;

public class UcakBileti {
    public static void main(String[] args) {
        int age=0, distance=0, typeOfTrip=0;
        double fare=0.10, normalPrice=0.0, discountPrice=0.0, ageDiscountRate=0.0, ageDiscount=0.0, returnDiscount=0.0;
        boolean endProgram = false;

        Scanner input = new Scanner(System.in);
        System.out.print("Mesafeyi KM turunden giriniz: ");
        distance = input.nextInt();
        if(distance <= 0)
        {
            endProgram = true;
        }else{
            System.out.print("Yasinizi giriniz: ");
            age = input.nextInt();
            if(age <= 0)
            {
                endProgram = true;
            }
            else
            {
                System.out.print("Yolculuk tipini giriniz(1 => Tek Yön 2 => Gidis Donus: ");
                typeOfTrip = input.nextInt();
                if( !((typeOfTrip == 1) || (typeOfTrip == 2)) )
                {
                    endProgram = true;
                }
            }
        }

        if(!endProgram)
        {
            normalPrice = distance * fare;
            System.out.println("\nNormal Tutar : Mesafe * " + fare + " = " + distance + " * " + fare + " = " + normalPrice);
            
            if(age < 12)
            {
                ageDiscountRate = 0.5;
            }
            else if((age >= 12) && (age <= 24)){
                ageDiscountRate = 0.1;
            }else if(age > 65){
                ageDiscountRate = 0.3;
            }
            
            ageDiscount = normalPrice * ageDiscountRate;
            System.out.println("Yas Indirimi : Normal Tutar * Yas Indirim Orani = " + normalPrice + " * " + ageDiscountRate + " = " + ageDiscount );
            
            discountPrice = normalPrice - ageDiscount;
            System.out.println("Indirimli Tutar : Normal Tutar - Yas Indirimi = " + normalPrice + " - " + ageDiscount + " = " + discountPrice);

            if( typeOfTrip == 2)
            {
                returnDiscount = discountPrice * 0.20;
                System.out.println("Gidis Donus Bilet Indirimi = Indirimli Tutar * 0.20 = " + returnDiscount);
                System.out.println("\nToplam Tutar = (" + discountPrice + " - " + returnDiscount + ")*2 = " + ((discountPrice - returnDiscount)*2));
            }
            else{
                System.out.println("\nToplam Tutar = " + discountPrice);  
            }
            
            

        }
        else
        {
            System.out.println("Hatali veri girdiniz");
            System.out.println("Program sonlandirildi.");
        }
        
        

    }
}
