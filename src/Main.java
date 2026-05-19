public class Main {

    public static void main(String[] args) {

        String indirimTipi = "ogrenci";

        double javaKursu = 1200;
        double pythonKursu = 1000;
        double webKursu = 1500;

        double toplam = javaKursu + pythonKursu + webKursu;
        double sonuc = toplam;

        if(indirimTipi.equals("ogrenci")) {
            sonuc = toplam * 0.8;
        }
        else if(indirimTipi.equals("abonman")) {
            sonuc = toplam * 0.75;
        }
        else if(indirimTipi.equals("kupon")) {
            sonuc = toplam - 500;
        }

        System.out.println("Sepet toplami: " + toplam);
        System.out.println("Indirimli toplam: " + sonuc);
    }
}