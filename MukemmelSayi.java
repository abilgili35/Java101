import java.util.Scanner;

public class MukemmelSayi {
    public static void main(String[] args) {
        int number;
        int sum = 0;
        Scanner s = new Scanner(System.in);
        
        System.out.println("Bir sayi giriniz.");
        number = s.nextInt();
        for(int i=1; i < number; i++){
            if(number % i == 0)
            {
                sum += i;
            }
        }

        if(sum == number)
        {
            System.out.println(number + " bir mukemmel sayidir.");
        }
        else{
            System.out.println(number + " bir mukemmel sayi degildir.");
        }

    }
}
