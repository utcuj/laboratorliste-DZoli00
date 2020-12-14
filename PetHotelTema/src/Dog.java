
public class Dog {
	private String name;
	private int age;
	private String ID;
	private String breed;
	
	public Dog(String name,int age, String ID, String breed) {
		this.name = name;
		this.age = age;
		this.ID = ID;
		this.breed= breed;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
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

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}
	
	
}
