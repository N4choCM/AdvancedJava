package Activities_22_23_24;

public class ElectricCar extends Vehicle{
    private boolean bElectricEngine = true;

    public ElectricCar() {}

    public ElectricCar(boolean bElectricEngine) {
        this.bElectricEngine = bElectricEngine;
    }

    public ElectricCar(String sBrand, String sModel, int iHp, boolean bElectricEngine) {
        super(sBrand, sModel, iHp);
        this.bElectricEngine = bElectricEngine;
    }

    public boolean isbElectricEngine() {
        return bElectricEngine;
    }

    public void setbElectricEngine(boolean bElectricEngine) {
        this.bElectricEngine = bElectricEngine;
    }

    @Override
    public String toString() {
        return "ElectricCar{" +
                "bElectricEngine=" + bElectricEngine +
                '}';
    }

    @Override
    public int speedUp(int iSpeed) {
        return iSpeed += 10;
    }
}