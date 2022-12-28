import java.util.Arrays;

public class RepeatingEvenNumbers {
    static boolean isFind(int[] arr, int value){
        
        for(int i : arr){
            if(i == value){
                return true;
            }
        }

        return false;
    }
    public static void main(String[] args) {
        int[] list = {2, 8, 2, 3, 2, 8, 10, 21, 1, 8, 10, 1};
        int[] duplicate = new int[list.length];
        int startIndex = 0;

        for(int i=0; i<list.length; i++){
            if( !((list[i]%2 ) == 0)){
                continue;
            }
            for(int j=0; j<list.length; j++){
                if((i != j) && (list[i] == list[j])){
                    if(!isFind(duplicate, list[i])){
                        duplicate[startIndex++] = list[i];
                    }
                    break;
                }
            }
            
        }

        System.out.println(Arrays.toString(duplicate));
    }
}
