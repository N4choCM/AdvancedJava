package Activities_6_7_8;

public class Government {
    private static Government government;
    private String country;

    private Government() { }

    public static Government getInstance() {
        if (government == null) {
            government = new Government();
        }

        return government;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountry() {
        return country;
    }
}
