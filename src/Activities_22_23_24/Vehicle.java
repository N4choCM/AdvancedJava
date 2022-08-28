package Activities_22_23_24;

abstract class Vehicle {
    private String sBrand;
    private String sModel;
    private int iHp;

    public Vehicle() {
    }

    public Vehicle(String sBrand, String sModel, int iHp) {
        this.sBrand = sBrand;
        this.sModel = sModel;
        this.iHp = iHp;
    }

    public String getsBrand() {
        return sBrand;
    }

    public void setsBrand(String sBrand) {
        this.sBrand = sBrand;
    }

    public String getsModel() {
        return sModel;
    }

    public void setsModel(String sModel) {
        this.sModel = sModel;
    }

    public int getiHp() {
        return iHp;
    }

    public void setiHp(int iHp) {
        this.iHp = iHp;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "sBrand='" + sBrand + '\'' +
                ", sModel='" + sModel + '\'' +
                ", iHp=" + iHp +
                '}';
    }

    public int speedUp(int iSpeed){
        return iSpeed++;
    }
}
