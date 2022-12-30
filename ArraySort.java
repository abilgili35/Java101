import java.util.Scanner;
import java.util.Arrays;

public class ArraySort {
    
    static int[] mergeLists(int[] list1, int[] list2)
    {
        int[] returnList = new int[list1.length + list2.length];
        int index1=0, index2=0,index3=0;

        while(index3 < returnList.length)
        {
            if(index1 == (list1.length))
            {
                returnList[index3] = list2[index2];
                index3++;
                index2++;
            }
            else if(index2 == (list2.length)){
                returnList[index3] = list1[index1];
                index3++;
                index1++;
            }
            else if(list1[index1] <= list2[index2]){
                returnList[index3] = list1[index1];
                index3++;
                index1++;
            }else{
                returnList[index3] = list2[index2];
                index3++;
                index2++;
            }
            
        }
    
        return returnList;
    }

    static int[] recursiveMergeSort(int[] arr){
        if(arr.length == 1)
        {
            return arr;
        } 
        else{
            int[] leftList;
            int[] rightList;
            int[] leftSortedList;
            int[] rightSortedList;
            
            if(arr.length % 2 == 0){
                leftList = new int[arr.length/2];
                rightList = new int[arr.length/2];
            }else
            {
                leftList = new int[arr.length/2 + 1];
                rightList = new int[arr.length/2];
            }

            for(int i=0;i<leftList.length;i++)
            {
                leftList[i] = arr[i];
            }
            for(int j=leftList.length;j<arr.length;j++)
            {
                rightList[j-leftList.length] = arr[j];
            }
            
            leftSortedList = recursiveMergeSort(leftList);
            rightSortedList = recursiveMergeSort(rightList);
            
            return mergeLists(leftSortedList, rightSortedList );
        }
    }
   
    public static void main(String[] args) {
        int arraySize;
        Scanner s = new Scanner(System.in);
        
        System.out.print("Dizinin boyutu n:");
        arraySize = s.nextInt();
        
        int[] sortArray = new int[arraySize];
        
        for(int i=0; i<arraySize; i++){
            System.out.print((i+1) + ". Elemani : ");
            sortArray[i] = s.nextInt();
        }

        System.out.println("Siralama :" + Arrays.toString(recursiveMergeSort(sortArray)));
        



    }
}