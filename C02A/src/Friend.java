/**
 * @author Brandon Ching
 *
 */
public class Friend {
	public Friend(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}
	private String name;
	private String email;
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	
	public String toString() {
		return "Person [name=" + name + ", email=" + email + "]";
	}

}