import java.util.Scanner;

public class CinZodyagi {
    public static void main(String[] args) {
        int dateOfBirth, chineseZodiac;
        String zodiacString = "";

        Scanner input = new Scanner(System.in);
        System.out.print("Dogum yilinizi giriniz : ");
        dateOfBirth = input.nextInt();
        chineseZodiac = dateOfBirth % 12;

        switch(chineseZodiac){
            case 0:
                zodiacString = "Maymun";
                break;
            case 1:
                zodiacString = "Horoz";
                break;
            case 2:
                zodiacString = "Kopek";
                break;
            case 3:
                zodiacString = "Domuz";
                break;
            case 4:
                zodiacString = "Fare";
                break;
            case 5:
                zodiacString = "Okuz";
                break;
            case 6:
                zodiacString = "Kaplan";
                break;
            case 7:
                zodiacString = "Tavsan";
                break;
            case 8:
                zodiacString = "Ejderha";
                break;
            case 9:
                zodiacString = "Yilan";
                break;
            case 10:
                zodiacString = "At";
                break;
            case 11:
                zodiacString = "Koyun";
                break;
        }
        System.out.println("Cin Zodyagi burcunuz : " + zodiacString);


    }
}
