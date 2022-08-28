package Activities_6_7_8;

public class Main {
    public static void main(String[] args) {
        Government spanishGov = Government.getInstance();
        spanishGov.setCountry("Spain");
        System.out.println("Nationality of the government: " + spanishGov.getCountry()
                + "\nSingleton object in memory: " + spanishGov);


        Government ukGov = Government.getInstance();
        ukGov.setCountry("UK");
        System.out.println("Nationality of the government: " + ukGov.getCountry()
                + "\nSingleton object in memory: " + ukGov);
    }
}
