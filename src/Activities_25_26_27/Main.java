package Activities_25_26_27;

public class Main {
    public static void main(String[] args) {
        PhoneImpl phone1 = new PhoneImpl();
        phone1.call(628523682);

        SmartphoneImpl phone2 = new SmartphoneImpl();
        phone2.call(628523682);
        phone2.sendEmail("nachocamposmarti@gmail.com");
    }
}
