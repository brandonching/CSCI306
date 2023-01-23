import java.util.ArrayList;

public class Station {
	private ArrayList<Detective> detectives;
	/**
	 * @param detectives
	 */
	private String name;
	public static int nextBadgeNumber = 1;
	public static final int MAX_DETECTIVES = 5;


	public String getName() {
		return name;
	}

	public Station()  {
		super();
		detectives = new ArrayList<Detective>();
	}

	public Station(String name)  {
		super();
		this.name = name;
		detectives = new ArrayList<Detective>();
	}

	public void printDetectives() {
		for (Detective detective : detectives) {
			System.out.println(detective.toString());
		}
	}

	public ArrayList<Detective> getDetectives() {
		return detectives;
	}

	public void addDetectives(String name, int badge) {
		if(detectives.size() < MAX_DETECTIVES) {
			detectives.add(new Detective(name, badge));
		}
		else {
			System.out.println("Error: Max detectives reached");
		}
	}


}
