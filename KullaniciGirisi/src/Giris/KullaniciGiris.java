package Giris;
import java.util.Scanner;
public class KullaniciGiris {
    public static void main(String[]args){
        String userName1="esmabarutcu";
        String password1="12345678";

        String cevap,yenisifre;

        Scanner input=new Scanner(System.in);
        System.out.println("Kullanıcı adınız");
       String userName2=input.nextLine();

        System.out.println("Şifreniz");
        String password2=input.nextLine();

        if(password1!=password2){

            System.out.println("Şifrenizi yenilemek ister misiniz?");
            cevap=input.nextLine();
            if(cevap.equals("evet")){
                System.out.println("Yeni şifrenizi giriniz");
                yenisifre=input.nextLine();
                if(yenisifre.equals("12345678")){
                    System.out.println("Şifre başarılı bir şekilde oluşturulamadı");
                }
                else {
                    System.out.println("Şifre başarılı bir şekilde oluşturuldu.");
                }
            }
        }
    }
}
