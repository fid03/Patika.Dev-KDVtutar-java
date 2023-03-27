package patikaDev;

import java.util.Scanner;

public class KdvTutar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double kdvOran1=0.18;
        double kdvOran2=0.08;
        System.out.println("Ucret tutarini giriniz");
        double tutar=sc.nextDouble();
        double kdvTutar=(tutar>0 && tutar<1000)?(tutar*kdvOran1):(tutar*kdvOran2);
        double kdvFiyat=(tutar>0 && tutar<1000)?(tutar+tutar*kdvOran1):(tutar+tutar*kdvOran2);
        System.out.println("KDV-siz fiyat:"+tutar);
        System.out.println("KDV-li fiyat"+kdvFiyat);
        System.out.println("KDV tutari:"+kdvTutar);

    }
}
