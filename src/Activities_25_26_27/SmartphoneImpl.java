package Activities_25_26_27;

public class SmartphoneImpl implements Smartphone{
    @Override
    public void call(int iTargetNumber) {
        System.out.println("Calling the following number from a smartphone: " + iTargetNumber);
    }

    @Override
    public void sendEmail(String sTargetEmail) {
        System.out.println("Sending an email to " + sTargetEmail);
    }
}