public class Control {
	public static void main(String[] args) {
		LightBulb lightBulb = new LightBulb();
		Fan fan = new Fan();
		ElectricPowerSwitch bulbSwitch = new ElectricPowerSwitch(lightBulb);
		ElectricPowerSwitch fanSwitch = new ElectricPowerSwitch(fan);

		bulbSwitch.press();
		bulbSwitch.press();

		fanSwitch.press();
		fanSwitch.press();
	}
}
