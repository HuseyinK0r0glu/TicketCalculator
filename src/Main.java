import java.util.*;
public class Main {
    public static void main(String[] args) {
        //km birim fiyatı 0.10$
        //12 yaşından küçükse toplam fiyata %50 inidirim
        //12 ve 24 yaş arasında ise toplam fiyata %10 indirim
        //65 yaşından büyükse %30 indirim
        //gidiş dönüş alırsa %20 indirim


        Scanner scan = new Scanner(System.in);
        int km,yas,tip;
        System.out.println("Mesafeyi Giriniz:");
        km = scan.nextInt();
        System.out.println("Yaşınızı Giriniz:");
        yas = scan.nextInt();
        System.out.println("\nYolculuk Tipini Seçiniz: (1-Tek gidiş 2-Gidiş dönüş)");
        tip = scan.nextInt();

        double normalFiyat,yasIndirimi,tipIndirimi;

        if(km>0 && yas>0 && (tip==1 || tip==2)){
            normalFiyat = km * 0.10;
            if(yas<12){
                yasIndirimi=normalFiyat*0.5;
                normalFiyat=normalFiyat-yasIndirimi;
            }
            else if(yas>=12 && yas<=24){
                yasIndirimi = normalFiyat*0.10;
                normalFiyat = normalFiyat-yasIndirimi;
            }
            else if(yas>65){
                yasIndirimi = normalFiyat*0.30;
                normalFiyat = normalFiyat-yasIndirimi;
            }
            else{
                yasIndirimi=0;
                normalFiyat = normalFiyat;
            }
            if(tip==2){
                tipIndirimi = normalFiyat * 0.20;
                normalFiyat = (normalFiyat-tipIndirimi)*2;

            }
            System.out.println("Bilet Tutarı: " + normalFiyat + "$");
        }
        else{
            System.out.println("Girdiğiniz Değerler Eksik Veya Yanlış Lütfen Tekrar Deneyiniz");
        }



    }
}