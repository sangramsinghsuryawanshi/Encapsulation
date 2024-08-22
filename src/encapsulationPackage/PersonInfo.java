package encapsulationPackage;
class person{
	private int age;
	private String name;
	private String country;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
}
public class PersonInfo {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		person p = new person();
		p.setAge(21);
		p.setName("Sangram");
		p.setCountry("India");
		System.out.print("Person age: "+p.getAge());
		System.out.print("\nPerson name: "+p.getName());
		System.out.print("\nPerson country: "+p.getCountry());
	}

}
