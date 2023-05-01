public class ElectricPowerSwitch {
    public boolean on;
    public Switchable client;

    public ElectricPowerSwitch(Switchable client) {
        this.on = false;
        this.client = client;
    }

    public boolean isOn() {
        return this.on;
    }

    public void press() {
        boolean checkOn = isOn();
        if (checkOn) {
            client.turnOff();
            this.on = false;
        } else {
            client.turnOn();
            this.on = true;
        }
    }
}