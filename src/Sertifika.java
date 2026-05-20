public class Sertifika extends KursDecorator {

    public Sertifika(Kurs kurs) {

        super(kurs);
    }

    public String bilgiVer() {

        return kurs.bilgiVer() + " + Sertifika";
    }

    public double fiyatVer() {

        return kurs.fiyatVer() + 300;
    }
}