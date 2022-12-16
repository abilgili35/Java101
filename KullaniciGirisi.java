import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class KullaniciGirisi {
    public static void main(String[] args) {
        String username, password, newPassword;
        String setNewPassword;

        Scanner input = new Scanner(System.in);

        System.out.print("Kullanici Adiniz : ");
        username = input.nextLine();
        System.out.print("Sifreniz : ");
        password = input.nextLine();

        if(username.equals("patika") && password.equals("java123"))
        {
            System.out.println("Giris Yaptiniz.");
        }else if(username.equals("patika") && !password.equals("java123")){
            System.out.println("Hatali Sifre.Sifrenizi sifirlamak istermisiniz.\n\n  - Evet (e)\n  - Hayir (Herhangi bir tus)");
            
            setNewPassword = input.nextLine();
            switch(setNewPassword){
                case "e":
                    System.out.println("Yeni şifrenizi giriniz.");
                    newPassword = input.nextLine();
                    if( (newPassword.equals(password)) || (newPassword.equals("java123")))
                    {
                        System.out.println("Sifre oluşturulamadi, lutfen başka sifre giriniz.");
                    }
                    else
                    {
                        System.out.println("Sifre olusturuldu.");
                    }
                    break;
                default:    
                    System.out.println("Yeni sifre oluşturmak istemediniz.");

            }

        }else{
            System.out.println("\nHatali kullanici adi ve sifre.");
        }

    }
}
