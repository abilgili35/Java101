import java.util.Scanner;
import java.util.Arrays;

public class NumberFrequency {

    static int isFind(int[] arr, int value){
        
        for(int i=0;i<arr.length; i++){
            if(arr[i] == value){
                return i;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        int [] list = {10, 29, 20, 10, 10, 20, 5, 20,20,20,29};

        int[] duplicate = new int[list.length];
        int[] duplicateFrequency = new int[list.length];
        int startIndex = 0;
        int index = 0;

        Arrays.fill(duplicateFrequency, 0);

        for(int i=0; i<list.length; i++){
            for(int j=0; j<list.length; j++){
                if((i != j) && (list[i] == list[j])){
                    if( (index=isFind(duplicate, list[i])) == -1){
                        duplicate[startIndex] = list[i];
                        duplicateFrequency[startIndex]++;
                        startIndex++;
                    }else{
                        duplicateFrequency[index]++;
                    }
                    break;
                }
            }
            
        }
        System.out.println("Dizi : " + Arrays.toString(list));
        System.out.println("Tekrar sayilari\n");
        for(int i=0; i<duplicate.length; i++){
            if(duplicateFrequency[i] == 0){
                break;
            }
            System.out.println(duplicate[i] + "sayisi " + duplicateFrequency[i] + " kere tekrar edildi.");
        }
    }
}
