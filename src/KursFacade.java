public class KursFacade {

    public Kurs javaKursPaketiOlustur() {

        Kurs kurs = new JavaKursu();

        kurs = new Sertifika(kurs);

        kurs = new Mentorluk(kurs);

        return kurs;
    }
}