//import java.io.Console;
import java.util.Scanner;

public class PublicSafety {
	Station city;
	Station university;
	public static int MAX_HIRES = 5; 
	int[] numberOfDetectives = {0, 0};

	public PublicSafety() {
		super();
		this.city = new Station();
		this.university = new Station();
	}

	/**
	 * @param city
	 * @param university
	 */
	public PublicSafety(String universityName, String cityName) {
		super();
		this.city = new Station(cityName);
		this.university = new Station(universityName);
	}

	/*
	 *  - If true, tell the city station to hire one detective. 
	 *  - If false, tell the university station to hire one detective.
	 */
	@SuppressWarnings("resource")
	public void doHire(boolean hire) {
		// test if its possible to hire more detectives
		if(hire && numberOfDetectives[0] < MAX_HIRES) {
			System.out.print("New hire for " + city.getName() + "... Enter detective's name: ");
			numberOfDetectives[0]++;
			Scanner in = new Scanner(System.in);
			String name = in.nextLine();
			city.addDetectives(name, Station.nextBadgeNumber++);
		} else if(!hire && numberOfDetectives[1] < MAX_HIRES) {
			System.out.print("New hire for " + university.getName() + "... Enter detective's name: ");
			numberOfDetectives[1]++;
			Scanner in = new Scanner(System.in);
			String name = in.nextLine();
			university.addDetectives(name, Station.nextBadgeNumber++);
		} else {
			System.out.println("Can't hire any more detectives for " );
		}
	}

	public void printDetectiveLists() {
		System.out.println("List of Detectives for " + city.getName());
		city.printDetectives();
		System.out.println();
		System.out.println("List of Detectives for " + university.getName());
		university.printDetectives();
		System.out.println();
	}

}
