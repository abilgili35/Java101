import javax.lang.model.util.ElementScanner14;

public class Palindrom {
    
    static boolean isPolindrome(int number){
        int temp=number, reverseNumber=0, lastNumber;

        while(temp != 0){
            lastNumber=temp%10;
            reverseNumber = (reverseNumber*10) + lastNumber;
            temp /= 10;
        }

        if( number == reverseNumber){
            return true;
        }else{
            return false;
        }

    }
    
    public static void main(String[] args) {
        System.out.println(isPolindrome(1221));
    }
}
