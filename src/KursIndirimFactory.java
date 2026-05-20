public class KursIndirimFactory {

    public static KursIndirim indirimOlustur(String tip) {

        if(tip.equals("ogrenci")) {
            return new OgrenciIndirim();
        }

        else if(tip.equals("toplu")) {
            return new TopluAlimIndirim();
        }

        else if(tip.equals("kupon")) {
            return new KuponIndirim();
        }

        return null;
    }
}