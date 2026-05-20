public class Mentorluk extends KursDecorator {

    public Mentorluk(Kurs kurs) {

        super(kurs);
    }

    public String bilgiVer() {

        return kurs.bilgiVer() + " + Mentorluk";
    }

    public double fiyatVer() {

        return kurs.fiyatVer() + 500;
    }
}