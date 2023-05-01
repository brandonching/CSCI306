public class Phone {
    private String name;
    private String manufacturer;
    private int cost;

    public Phone(String name, String manufacturer, int cost) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.cost = cost;
    }

    public void takePhoto() {
        System.out.println("Snaping a Selfie!");
    }
}
