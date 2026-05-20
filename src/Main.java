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

        OdemeIslemi odeme1 = new OdemeIslemi(new KrediKartiOdeme());

        odeme1.odemeYap(sonuc);

        OdemeIslemi odeme2 = new OdemeIslemi(new HavaleOdeme());

        odeme2.odemeYap(sonuc);


        KursBildirimSistemi bildirimSistemi = new KursBildirimSistemi();

        Kullanici kullanici1 = new AboneKullanici("Irem");

        Kullanici kullanici2 = new AboneKullanici("Ayse");

        bildirimSistemi.aboneEkle(kullanici1);

        bildirimSistemi.aboneEkle(kullanici2);

        bildirimSistemi.bildirimGonder("Yeni Java kursu indirime girdi.");
    }
}