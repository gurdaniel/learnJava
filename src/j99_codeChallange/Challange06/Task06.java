package j99_codeChallange.Challange06;

import java.util.Scanner;

public class Task06 {

    /*Task->
     Kullanıcıda x girilene kadar ekrana "Program çalışıyor" yazan
     ve x girildiğinde ise "Program bitti" print eden code create ediniz
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char c;
        do {
            System.out.println("lütfen bir karakter giriniz: ");
            c = input.next().charAt(0);
            System.out.println("program çalısıyor.");
        }
        while (c != 'x');
        System.out.println("program bitti.");



        System.out.println("lütfen bir karakter giriniz: ");
        c = input.next().charAt(0);
        while (c != 'x'){
            System.out.println("lütfen bir karakter giriniz: ");
            c = input.next().charAt(0);
            System.out.println("program çalısıyor.");
        }
        System.out.println("program bitti.");



    }
}
