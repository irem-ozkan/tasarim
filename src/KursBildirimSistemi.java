import java.util.ArrayList;

public class KursBildirimSistemi {

    private ArrayList<Kullanici> kullanicilar = new ArrayList<>();

    public void aboneEkle(Kullanici kullanici) {

        kullanicilar.add(kullanici);
    }

    public void bildirimGonder(String mesaj) {

        for(Kullanici kullanici : kullanicilar) {

            kullanici.bildirimAl(mesaj);
        }
    }
}