import java.util.Scanner;

public class BurcBulanProgram {
    public static void main(String[] args) {
        int month, day;
        String burc = "";
        boolean isError = false;

        Scanner input = new Scanner(System.in);
        
        System.out.print("Dogdugunuz ay: ");
        month = input.nextInt();

        System.out.print("Dogdugunuz gun: ");
        day = input.nextInt();

        
        if(month == 1){
            if((day >=1) && (day <=31))
            {
                if(day < 22)
                {
                    burc = "Oglak";
                }else{
                    burc = "Kova";
                }
            }
            else{
                isError = true;
            }
        }
        else if(month == 2){
            if((day >=1) && (day <=28))
            {
                if(day < 20)
                {
                    burc = "Kova";
                }else{
                    burc = "Balik";
                }
            }
            else{
                isError = true;
            }
        }
        else if(month == 3){
            if((day >=1) && (day <=31))
            {
                if(day < 21)
                {
                    burc = "Balik";
                }else{
                    burc = "Koc";
                }
            }
            else{
                isError = true;
            }
        }
        else if(month == 4){
            if((day >=1) && (day <=30))
            {
                if(day < 21)
                {
                    burc = "Koc";
                }else{
                    burc = "Boga";
                }
            }
            else{
                isError = true;
            }
        }
        else if(month == 5){
            if((day >=1) && (day <=31))
            {
                if(day < 22)
                {
                    burc = "Boga";
                }else{
                    burc = "Ikizler";
                }
            }
            else{
                isError = true;
            }
        }
        else if(month == 6){
            if((day >=1) && (day <=30))
            {
                if(day < 23)
                {
                    burc = "İkizler";
                }else{
                    burc = "Yengec";
                }
            }
            else{
                isError = true;
            }
        }
        else if(month == 7){
            if((day >=1) && (day <=31))
            {
                if(day < 23)
                {
                    burc = "Yengec";
                }else{
                    burc = "Aslan";
                }
            }
            else{
                isError = true;
            }
        }
        else if(month == 8){
            if((day >=1) && (day <=31))
            {
                if(day < 23)
                {
                    burc = "Aslan";
                }else{
                    burc = "Basak";
                }
            }
            else{
                isError = true;
            }
        }
        else if(month == 9){
            if((day >=1) && (day <=30))
            {
                if(day < 23)
                {
                    burc = "Basak";
                }else{
                    burc = "Terazi";
                }
            }
            else{
                isError = true;
            }
        }
        else if(month == 10){
            if((day >=1) && (day <=31))
            {
                if(day < 23)
                {
                    burc = "Terazi";
                }else{
                    burc = "Akrep";
                }
            }
            else{
                isError = true;
            }
        }
        else if(month == 11){
            if((day >=1) && (day <=30))
            {
                if(day < 22)
                {
                    burc = "Akrep";
                }else{
                    burc = "Yay";
                }
            }
            else{
                isError = true;
            }
        }
        else if(month == 12){
            if((day >=1) && (day <=31))
            {
                if(day < 23)
                {
                    burc = "Yay";
                }else{
                    burc = "Oglak";
                }
            }
            else{
                isError = true;
            }
        }
        else{
            isError = true;
        }
                
                
        
        if(isError){
            System.out.println("Hatali bir giris yaptiniz.Tekrar deneyiniz.");
        }else{
            System.out.println("Burcunuz: " + burc);
        }
        
    }
}
