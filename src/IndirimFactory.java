public class IndirimFactory {

    public static Indirim indirimOlustur(String indirimTipi) {

        if(indirimTipi.equals("ogrenci")) {
            return new OgrenciIndirim();
        }

        else if(indirimTipi.equals("abonman")) {
            return new AbonmanIndirim();
        }

        else if(indirimTipi.equals("kupon")) {
            return new KuponIndirim();
        }

        return null;
    }
}