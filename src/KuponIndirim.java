public class KuponIndirim implements Indirim {

    @Override
    public double indirimUygula(double toplam) {

        return toplam - 500;
    }
}