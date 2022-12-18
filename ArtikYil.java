import java.util.Scanner;

public class ArtikYil {
    public static void main(String[] args) {
        int year;

        Scanner input = new Scanner(System.in);

        System.out.print("Yil Giriniz : ");
        year = input.nextInt();

        if( (year % 100) == 0)
        {
            if((year % 400) == 0)
            {
                System.out.println(year + " bir artik yildir.");
            }
            else
            {
                System.out.println(year + " bir artik yil degildir.");
            }
        }else if((year % 4) == 0){
            System.out.println(year + " bir artik yildir.");
        }
        else
        {
            System.out.println(year + " bir artik yil degildir.");
        }


    }
}
