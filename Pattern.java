import java.util.Scanner;


public class Pattern {

    static void formPattern(int num, int value, int multiplier)
    {
        if( (multiplier == 1) && (num == value))
        {
            System.out.print(" " + num);
        } 
        else{
            System.out.print(" " + value);
            if((multiplier == -1) && (value <= 0)){
                multiplier = 1;
            }
            formPattern(num, value + (multiplier * 5), multiplier);
            
        }
    }

    public static void main(String[] args) {
        int number;
        Scanner s = new Scanner(System.in);

        System.out.print("N sayisi: ");
        number = s.nextInt();
        formPattern(number, number, -1);
    }
}
