import java.util.Scanner;
import java.util.Arrays;


public class ArrayMinMax {
        public static void main(String[] args) {
            int[] list = {15, 12, 788, 1, -1, -788, 2, 0};
      
        int nearestSmallerNumber = list[0];
        int nearestBiggerNumber = list[0];
        int nearestSmallerOffset=-1 , nearestBiggerOffset=-1;
        int number;
        
        System.out.print("Dizi:  " + Arrays.toString(list) + "\n");
        

        Scanner s = new Scanner(System.in);
        System.out.print("Girilen Sayi: ");
        number = s.nextInt();


        for (int i : list) {
            
            if (i < number) {
                int offset = number - i;
                if(nearestSmallerOffset < 0)
                {
                    nearestSmallerNumber = i;
                    nearestSmallerOffset = number - nearestSmallerNumber;
                }else if( nearestSmallerOffset > offset)
                {
                        nearestSmallerNumber = i;
                        nearestSmallerOffset = number - nearestSmallerNumber;
                }
                
            }
            if (i > number) {
                int offset = i - number;
                if(nearestBiggerOffset < 0)
                {
                    nearestBiggerNumber = i;
                    nearestBiggerOffset = nearestBiggerNumber - number;
                }else if( nearestBiggerOffset > offset)
                {
                        nearestBiggerNumber = i;
                        nearestBiggerOffset = nearestBiggerNumber - number;
                }
            }
        }

        if(nearestSmallerOffset > 0)
        {
            System.out.println("Girilen sayidan kucuk en yakin sayi:  " + nearestSmallerNumber);
        }
        else
        {
            System.out.println("Girilen sayidan kucuk bir sayi yok");
        }

        if(nearestBiggerOffset > 0)
        {
            System.out.println("Girilen sayidan buyuk en yakin sayi :" + nearestBiggerNumber);
        }
        else
        {
            System.out.println("Girilen sayidan buyuk bir sayi yok");
        }

        
        
        
    }
        
        
}
