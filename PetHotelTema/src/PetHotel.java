import java.util.*;
import java.util.stream.Collectors;


public class PetHotel {

	private String name;
	private List <Dog> dogs = new ArrayList<>();
	
	public PetHotel(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void addDog(Dog d) {
		dogs.add(d);
	}
	
	public void removeDog(Dog d) {
		dogs.remove(d);
	}
	
	public List<Dog> returnDogs() {
		return dogs;
	}
	
	public void printDogs(){
		for(Dog d:dogs) {
			System.out.println(d.getName() + " age: " + d.getAge() + " id:" + d.getID() + " breed: " + d.getBreed());
		}
	}
	
	public List<Dog> printByBreed(String b){
		return (List<Dog>) dogs.stream().filter(dog -> dog.getBreed().equals(b)).collect(Collectors.toList());
	}
	
}
