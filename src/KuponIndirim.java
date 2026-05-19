public class KuponIndirim implements KursIndirim {

    @Override
    public double indirimUygula(double toplam) {

        return toplam - 500;
    }
}