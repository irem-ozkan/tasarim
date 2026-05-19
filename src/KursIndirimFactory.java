public class KursIndirimFactory {

    public static KursIndirim indirimOlustur(String indirimTipi) {

        if(indirimTipi.equals("ogrenci")) {
            return new OgrenciIndirim();
        }
        else if(indirimTipi.equals("toplu")) {
            return new TopluAlimIndirim();
        }
        else if(indirimTipi.equals("kupon")) {
            return new KuponIndirim();
        }

        return null;
    }
}