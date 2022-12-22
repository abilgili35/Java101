import java.util.Scanner;

public class EBOBEKOK {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("N1 sayisini giriniz.");
        int n1 = input.nextInt();
        System.out.print("N2 sayisini giriniz.");
        int n2 = input.nextInt();

        int ebob = 1;
        int k = n1;

        while(k > 1)
        {   
            if(n1 % k == 0 && n2 % k == 0)
            {
                ebob=k;
                break;
            }
            k--;
        }
        
        System.out.println("EBOB : " + ebob);

        int ekok = 1;
        int i = 1;
        while(i <= (n1*n2))
        {
            if(i % n1 == 0 && i % n2 == 0)
            {
                ekok = i;
                break;
            }
            i++;
        }
        System.out.println("EKOK : " + ekok);

    }
    
}
