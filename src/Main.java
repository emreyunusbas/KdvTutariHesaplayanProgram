import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double tutar, kdvOran = 0 , kdvUcret, kdvliTutar ;

        Scanner kdv = new Scanner(System.in);
        System.out.print("Ürünün Ücretini Giriniz : ");
        tutar =kdv.nextInt();

        kdvOran = tutar < 1000 ? 0.18 : 0.8 ;
        kdvUcret = tutar * kdvOran;
        kdvliTutar =tutar + kdvUcret;

        System.out.println("KDV'siz Ücret " + tutar);
        System.out.println("KDV Oranı " + kdvOran);
        System.out.println("KDV Ücreti " + kdvUcret);
        System.out.println("KDV'li Ücreti " + kdvliTutar);



    }
}
