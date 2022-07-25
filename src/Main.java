import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Degisken tanimlandi.
        int sayi;

        //Kullanicidan veri girisi alindi ve alinan sayiya kadar 4 ve 5 in kuvvetleri ekrana yazdirildi.
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir Sayi Giriniz : ");
        sayi = scan.nextInt();

        System.out.println("---------------------------------");
        System.out.println(sayi + " Sayisindan Kucuk Dordun Kuvvetleri : ");

        for (int i = 1; i <= sayi; i *= 4)
        {
            System.out.println(i + ",");
        }

        System.out.println("---------------------------------");
        System.out.println(sayi + " Sayisindan Kucuk Besin Kuvvetleri : ");

        for (int i = 1; i <= sayi; i *= 5)
        {
            System.out.println(i + ",");
        }

    }
}
