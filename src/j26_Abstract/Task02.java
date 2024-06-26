package j26_Abstract;

import java.util.ArrayList;
import java.util.Scanner;

abstract class Phone {
    public abstract void options(String gb,String inch);//neden?

}

class Apple extends Phone{
    @Override
    public void options(String gb, String inch) {
        if (gb.equalsIgnoreCase("64gb")&&inch.equals("5.5")){
            Task02.cart.add("$750");
        } else if (gb.equalsIgnoreCase("64gb")&&inch.equals("6.5")) {
            Task02.cart.add("$850");
        }else if (gb.equalsIgnoreCase("128gb")&&inch.equals("5.5")) {
            Task02.cart.add("$950");
        }else if (gb.equalsIgnoreCase("128gb")&&inch.equals("6.5")) {
            Task02.cart.add("$1200");
        }
    }
}

class Samsung  extends Phone{
    @Override
    public void options(String gb, String inch) {
        if (gb.equalsIgnoreCase("256gb")&&inch.equals("5.5")){
            Task02.cart.add("$1000");
        } else if (gb.equalsIgnoreCase("256gb")&&inch.equals("7.5")) {
            Task02.cart.add("$1200");
        }else if (gb.equalsIgnoreCase("512gb")&&inch.equals("5.5")) {
            Task02.cart.add("$1300");
        }else if (gb.equalsIgnoreCase("512gb")&&inch.equals("6.5")) {
            Task02.cart.add("$1400");
        }
    }
}

public class Task02 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Telefonun hafizasini giriniz");
        String str1= scan.next();
        System.out.println("Telefonun ekran boyutunu giriniz");
        String str2= scan.next();
        Apple a1=new Apple();
        a1.options(str1,str2);
        System.out.println("Telefonun hafizasini giriniz");
        String str3= scan.next();
        System.out.println("Telefonun ekran boyutunu giriniz");
        String str4= scan.next();
        Samsung s1=new Samsung();
        s1.options(str3,str4);
        System.out.println("Toplam Fiyat = " + getSum(cart));
    }
    static ArrayList<String> cart = new ArrayList<String>();
    public static int getSum(ArrayList<String> list) {
        int toplam = 0;
        for (String each:list) {
            toplam+=Integer.parseInt(each.replaceAll("\\D",""));
        }
        return toplam;
    }
}




 /*
    4 class oluşturulmuştur. Phone, Apple, Samsung, Main

    Phone'u super class yapın.

    cart isimli, String'i alarak bir static arraylist oluşturun.

    getSum isimli, arraylist'i parametre aldığınız bir method oluşturun.

    ve return tipi int;
                     arraylist'in içindeki bütün seçenekleri elde edin ve sayısal olmayan karakterleri
                     (a b c... A B C...) ve özel karakterleri (.,!'^+...) silin
                     sonra bunları int'e çevirin.
                     tüm sayıları toplayın.

    ismi options olan bir abstract method oluşturun.

    Apple class'ın içinde;
                Phone class'ı extend edin.
                option method'u override edin.
                parametre olarak 2 String vardır.

    Eğer birinci String 64 GB ve 5.5 inch ise
                             cart arraylist'ine "$750" ekleyin.

    Eğer birinci String 64 GB ve 6.5 inch ise
                             cart arraylist'ine "$850" ekleyin.

    Eğer birinci String 128 GB ve 5.5 inch ise
                             cart arraylist'ine "$950" ekleyin.

    Eğer birinci String 128 GB ve 6.5 inch ise
                             cart arraylist'ine "$1200" ekleyin.

    Samsung class'ın içinde;
                Phone class'ı extend edin.
                option method'u override edin.
                parametre olarak 2 String vardır.

    Eğer birinci String 256 GB ve 5.5 inch ise
                             cart arraylist'ine "$1000" ekleyin.

    Eğer birinci String 256 GB ve 7.5 inch ise
                             cart arraylist'ine "$1200" ekleyin.

    Eğer birinci String 512 GB ve 5.5 inch ise
                             cart arraylist'ine "$1300" ekleyin.

    Eğer birinci String 512 GB ve 6.5 inch ise
                             cart arraylist'ine "$1400" ekleyin.


    Main class'ının içinde;
             scanner class object yarat.
                  iki adet String oluşturun str1, str2 ve scanner object'ini String'lere atayın.

    apple class'ı için object oluştur.
    options method'unu apple class'ının içine çağır.
    options parametreleri, daha önce oluşturulan iki String'lerdir.

    İki adaet String oluşturun. str3 ve str4, sonra scanner object'i bu String'lere atayın.
               samsung class'ı için object oluşturun.
               options method'unu samsung class'ının içinde çağırın.
               options parametreleri daha önce oluşturulan iki String'dir.

    getSum method'unu Phone class'ının içinde çağırın.

    sonucu yazdırın.

     */