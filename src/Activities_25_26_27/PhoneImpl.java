package Activities_25_26_27;

public class PhoneImpl implements Phone{
    @Override
    public void call(int iTargetNumber) {
        System.out.println("Calling the following number from a normal phone: " + iTargetNumber);
    }
}