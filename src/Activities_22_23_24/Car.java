package Activities_22_23_24;

public class Car extends Vehicle{

    public Car() {}

    private Car(String sBrand, String sModel, int iHp) {
        super(sBrand, sModel, iHp);
    }

    @Override
    public int speedUp(int iSpeed) {
        return iSpeed += 5;
    }
}