public class OgrenciIndirim implements KursIndirim {

    @Override
    public double indirimUygula(double toplam) {

        return toplam * 0.8;
    }
}