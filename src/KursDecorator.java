public abstract class KursDecorator implements Kurs {

    protected Kurs kurs;

    public KursDecorator(Kurs kurs) {
        this.kurs = kurs;
    }
}