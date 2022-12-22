public class AsalSayi {
    public static void main(String[] args) {
        boolean printNumber = true;

        for(int i=2; i <= 100; i++)
        {
            printNumber = true;
            for(int k=2; k < i; k++)
            {
                if(i % k == 0)
                {
                    printNumber = false;
                    break;
                }
                       
            }
            if(printNumber)
                {
                    System.out.print(i + " ");
                    
                }         
        }
    }
}
