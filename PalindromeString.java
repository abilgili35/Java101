

public class PalindromeString {

    static boolean isPalindrome2(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }

        if (str.equals(reverse))
            return true;
        else
            return false;
    }

    static boolean isPalindrome(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

    static boolean isPalindrome3(String str){
        while(str.length() > 1){
            if(!str.startsWith(String.valueOf(str.charAt(str.length()-1)))){
                return false;
            }
            str = str.substring(0, str.length()-1);
            str = str.substring(1, str.length());
        }
        return true;
    }
    public static void main(String[] args) {
            System.out.println(isPalindrome3("abbbbba"));
        
    }
}
