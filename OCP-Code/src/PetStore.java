import java.util.ArrayList;

public class PetStore {
	private ArrayList<Pet> pets = new ArrayList<>();

	public void addPet(Pet pet) {
		pets.add(pet);
	}

	public ArrayList<Pet> getPets() {
		return pets;
	}

	public static void main(String[] args) {
		PetStore myStore = new PetStore();

		myStore.addPet(new Pet("Buttons", PetType.CAT, "Meow", "catnip", "Watch Buttons sleep"));
		myStore.addPet(new Pet("Boxer", PetType.DOG, "Woof", "bones", "Throw a frisbee to Boxer"));
		myStore.addPet(new Pet("Dax", PetType.CAT, "Meow", "catnip", "Watch Dax sleep"));
		myStore.addPet(new Pet("Rex", PetType.MOOSE, "Moose Sounds", "moose food", "Watch Rex be a moose"));

		for (Pet pet : myStore.getPets()) {
			pet.printFun();
		}
		System.out.println();

		for (Pet pet : myStore.getPets()) {
			pet.printTreat();
		}
		System.out.println();

		for (Pet pet : myStore.getPets()) {
			pet.printNoise();
		}

	}

}
