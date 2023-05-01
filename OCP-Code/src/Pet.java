
public class Pet {
	private String name;
	private PetType type;
	private String noise;
	private String treat;
	private String fun;

	public Pet(String petName, PetType petType, String petNoise, String petTreat, String fun) {
		this.name = petName;
		this.type = petType;
		this.noise = petNoise;
		this.treat = petTreat;
		this.fun = fun;
	}

	public String getName() {
		return name;
	}

	public PetType getType() {
		return type;
	}

	public String getNoise() {
		return noise;
	}

	public String getTreat() {
		return treat;
	}

	public String getFun() {
		return fun;
	}

	public void printFun() {
		System.out.println(fun);
	}

	public void printNoise() {
		System.out.println(noise);
	}

	public void printTreat() {
		System.out.println("Give " + name + " some " + treat);
	}

}
