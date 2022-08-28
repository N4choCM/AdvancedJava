package Activities_22_23_24;

public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car();
        car.setiHp(100);
        car.setsBrand("Peugeot");
        car.setsModel("208");
        System.out.println("This " + car.getsBrand() + " " + car.getsModel() + " has " + car.getiHp() + "HP " +
                "and, after speeding up, reaches now " + car.speedUp(100) + "km/h.");

        Vehicle electricCar = new ElectricCar();
        electricCar.setiHp(130);
        electricCar.setsBrand("Toyota");
        electricCar.setsModel("EV6");
        System.out.println("This " + electricCar.getsBrand() + " " + electricCar.getsModel() + " has "
                + electricCar.getiHp() + "HP " + "and, after speeding up, reaches now "
                + electricCar.speedUp(100) + "km/h.");
    }
}
