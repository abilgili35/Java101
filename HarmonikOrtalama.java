public class HarmonikOrtalama {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 0, 4, 0};
        double sum = 0;
        int zeroCount = 0;
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] == 0)
            {
                zeroCount++;
            }else{
                sum += 1.0 / numbers[i];
            }
            
        }

        System.out.println(sum / (numbers.length - zeroCount));
    }
}
