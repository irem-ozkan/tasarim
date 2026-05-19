public class Mentorluk extends KursDecorator {

    public Mentorluk(Kurs kurs) {
        super(kurs);
    }

    @Override
    public String bilgiVer() {
        return kurs.bilgiVer() + " + Mentorluk";
    }

    @Override
    public double fiyatVer() {
        return kurs.fiyatVer() + 600;
    }
}