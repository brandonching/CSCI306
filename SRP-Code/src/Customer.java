
import java.util.ArrayList;

public class Customer {
	String name;
	int age;
	Bill bill;

	Customer(String name, int age) {
		this.name = name;
		this.age = age;
		this.bill = new Bill();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Bill getBill() {
		return bill;
	}

	public void setBill(Bill bill) {
		this.bill = bill;
	}

	public static void main(String[] args) {
		ArrayList<Item> items = new ArrayList<Item>();

		items.add(new Item(25));
		items.add(new Item(45));

		Customer fred = new Customer("Fred", 25);
		fred.getBill().setListsOfItems(items);
		fred.getBill().setTax(10);
		Report report = new Report("CSV", fred);
		report.generateReport("CSV");

		Customer karen = new Customer("Karen", 30);
		items.clear();
		items.add(new Item(10));
		items.add(new Item(10));
		karen.getBill().setListsOfItems(items);
		karen.getBill().setTax(10);

		report = new Report("XML", karen);
		report.generateReport("XML");

	}

}