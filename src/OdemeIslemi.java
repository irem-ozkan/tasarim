public class OdemeIslemi {

    private OdemeYontemi odemeYontemi;

    public OdemeIslemi(OdemeYontemi odemeYontemi) {

        this.odemeYontemi = odemeYontemi;
    }

    public void odemeYap(double tutar) {

        odemeYontemi.ode(tutar);
    }
}