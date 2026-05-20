public class AboneKullanici implements Kullanici {

    private String isim;

    public AboneKullanici(String isim) {

        this.isim = isim;
    }

    public void bildirimAl(String mesaj) {

        System.out.println(isim + " bildirimi aldi: " + mesaj);
    }
}