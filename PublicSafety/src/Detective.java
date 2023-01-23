
public class Detective {
	String name;
	int badge;

	/**
	 * @param name
	 * @param badge
	 */
	public Detective(String name, int badge) {
		super();
		this.name = name;
		this.badge = badge;
	}

	public Detective() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBagde() {
		return badge;
	}

	public void setBagde(int badge) {
		this.badge = badge;
	}

	@Override
	public String toString() {
		return "Detective [Badge=" + badge + ", name=" + name + "]";
	}


}
