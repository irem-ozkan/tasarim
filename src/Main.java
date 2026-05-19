public class Main {

    public static void main(String[] args) {

        String indirimTipi = "ogrenci";

        double javaKursu = 1200;
        double pythonKursu = 1000;
        double webKursu = 1500;

        double toplam = javaKursu + pythonKursu + webKursu;

        KursIndirim indirim = KursIndirimFactory.indirimOlustur(indirimTipi);

        double sonuc = indirim.indirimUygula(toplam);

        System.out.println("Sepet toplami: " + toplam);
        System.out.println("Indirimli toplam: " + sonuc);

        KursFacade kursFacade = new KursFacade();
        Kurs kurs = kursFacade.javaKursPaketiOlustur();

        System.out.println("Kurs paketi: " + kurs.bilgiVer());
        System.out.println("Kurs fiyati: " + kurs.fiyatVer());
    }
}