public class Sertifika extends KursDecorator {

    public Sertifika(Kurs kurs) {
        super(kurs);
    }

    @Override
    public String bilgiVer() {
        return kurs.bilgiVer() + " + Sertifika";
    }

    @Override
    public double fiyatVer() {
        return kurs.fiyatVer() + 300;
    }
}