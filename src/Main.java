public class Main {

    public static void main(String[] args) {

        String indirimTipi = "ogrenci";

        double fiyat = 1000;
        double sonuc = fiyat;

        if(indirimTipi.equals("ogrenci")) {
            sonuc = fiyat * 0.8;
        }
        else if(indirimTipi.equals("vip")) {
            sonuc = fiyat * 0.7;
        }
        else if(indirimTipi.equals("bayram")) {
            sonuc = fiyat * 0.5;
        }

        System.out.println("Toplam fiyat: " + sonuc);
    }
}