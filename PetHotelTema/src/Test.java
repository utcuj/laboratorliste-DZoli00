import java.util.*;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PetHotel ph = new PetHotel("Dog5Star");
		
		Dog d1 = new Dog("Rocky", 2, "1", "labrador");
		Dog d2 = new Dog("Marshall", 1, "2", "labrador");
		Dog d3 = new Dog("Bingo", 2, "3", "bulldog");
		Dog d4 = new Dog("Jackson", 4, "4", "german shepherd");
		Dog d5 = new Dog("Dingo", 3, "5", "labrador");
		Dog d6 = new Dog("Pinky", 2, "6", "beagle");
		Dog d7 = new Dog("Chase", 1, "7", "german shepherd");
		Dog d8 = new Dog("Zuma", 2, "8", "bulldog");
		
		ph.addDog(d1);
		ph.addDog(d2);
		ph.addDog(d3);
		ph.addDog(d4);
		ph.addDog(d5);
		ph.addDog(d6);
		ph.addDog(d7);
		ph.addDog(d8);
	
		//afisam cainii registrati in hotel
		ph.printDogs();
		
		System.out.println();
		
		//eliminam pe Pinky si pe Zuma, adica d6 si d8
		ph.removeDog(d6);
		ph.removeDog(d8);
		
		//afisam iarasi
		ph.printDogs();
		
		
		System.out.println();
		
		//cautam cainii de rasa labrador si adaugam intr-o lista 
		List <Dog> dogs = ph.printByBreed("labrador");
		
		//afisam elementele listei
		
		for(Dog d:dogs) {
			System.out.println(d.getName() + " age: " + d.getAge() + " id:" + d.getID() + " breed: " + d.getBreed());
		}
	
		
		
	}

}
