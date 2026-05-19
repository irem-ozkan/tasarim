public class OgrenciIndirim implements Indirim {

    @Override
    public double indirimUygula(double toplam) {

        return toplam * 0.8;
    }
}