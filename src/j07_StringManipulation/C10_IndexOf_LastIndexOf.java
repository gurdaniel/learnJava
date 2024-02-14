package j07_StringManipulation;

import java.util.Scanner;

public class C10_IndexOf_LastIndexOf {

    /* indexOf()->aranan yolcunun koltuk numarasını verir
  char karakter ya da String metnin kacinci indexden basladigini veren bir method dur. Sonuc integer dir.
  Bu method index'i sorulan char'in String icindeki ilk gorunumunun index'ini return eder
  contains den farkı indexini verir, contains ise true false
    */

    public static void main(String[] args) {

        String str="Madem Geldin Dunyaya Calis JAVA'ya";
        System.out.println("str.indexOf('y') = " + str.indexOf('y')); //16 y karakterini str daki indexini return eder
        System.out.println("str.indexOf(\"e\") = " + str.indexOf("e")); //3 e karakterinin str deki  ilk bulundugu yerin indexini return eder
        // Metinden bir kelimenin indexi arandigi zaman kelimeyi ilk buldugu yerin ilk indexi return eder

        System.out.println("str.indexOf(\"JAVA\") = " + str.indexOf("JAVA"));
        System.out.println("str.indexOf(\"java\") = " + str.indexOf("java"));
        // hap bilgi indexOf methodu olmayan bir char veya String arandigi zaman CTE veya RTE hatasi vermez -1 return eder
        System.out.println("str.indexOf(\"a\",12) = " + str.indexOf("a", 12));

        /* lastIndexOf()
        String içinde aranan karakter(ler)in sondan itibaren ilk indexini verır
        indexOf un sondan olan hali fakat index numaraları değişmez.
        lastIndexOf() Method'u index'i sorulan character'in son gorunumunun index'ini return eder.
        indexOf() methodunda birden fazla character'in index'i sorulursa ilk character'in index'i return edilir.
        */

        System.out.println("str.lastIndexOf(\"a\") = " + str.lastIndexOf("a"));
        System.out.println("str.lastIndexOf('x') = " + str.lastIndexOf('x'));
        System.out.println("str.lastIndexOf('s') = " + str.lastIndexOf('s'));

         /* Task-> girilen bir string ifadenin aşağıdaki şartları sağlamasını kontrol eden code create ediniz
        a-) girilen ifade java içermiyor
        b-) girilen ifade 1 adet java içeriyor
        c-) girilen ifade  1'den çok java içeriyor
        */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz : ");
        String metin = scan.nextLine().toLowerCase();

        if (!metin.contains("java")) {
            System.out.println("Girilen metin java icermiyor");
        }else if (metin.indexOf("java") == metin.lastIndexOf("java")) {
            System.out.println("Girilen ifade bir adet java iceriyor");
        }else {
            System.out.println("Girilen ifade birden fazla adet java iceriyor");
        }
    }

}
