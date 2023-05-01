public class FlipPhone extends Phone {

    public FlipPhone(String name, String manufacturer, int cost) {
        super(name, manufacturer, cost);
    }

    // This method is not applicable to FlipPhone
    @Override
    public void takePhoto() {
        throw new UnsupportedOperationException();
    }

    public static void main(String[] args) {
        Phone phone = new Phone("iPhone", "Apple", 1000);
        Phone flipPhone = new FlipPhone("Not a iPhone", "Not Apple", 1);

        phone.takePhoto();
        flipPhone.takePhoto();
    }
}