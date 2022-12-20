import java.util.Scanner;

public class ArmstrongSayi {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz :");
        int number = input.nextInt();
        
        
        int basValue;
        int tempNumber;
        int result = 0;


        tempNumber = number;
        while (tempNumber != 0) {
            basValue = tempNumber % 10;
            result += basValue;
            tempNumber /= 10;
        }

        System.out.print(number  + " sayisinin basamaklarinin toplami : " + result);
    }
}
