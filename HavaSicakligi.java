import java.util.Scanner;

public class HavaSicakligi {
    public static void main(String[] args) {
        int heat;

        Scanner input = new Scanner(System.in);
        System.out.println("Sicakligi giriniz :");
        heat = input.nextInt();

        if(heat < 5)
        {
            System.out.println("Kayak yapabilirsiniz.");
        }else if(heat > 25){
            System.out.println("Yuzmeye gidebilirsiniz.");
        }else{
            if(heat <= 15)
            {
                System.out.println("Sinemaya gidebilirsiniz.");
            }
            if(heat >= 10)
            {
                System.out.println("Piknige gidebilirsiniz.");
            }
        }
    }
}
