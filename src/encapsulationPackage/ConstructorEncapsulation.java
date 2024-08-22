package encapsulationPackage;
class StudentConstructor
{
	private int RollNo;
	private String Name;
	public StudentConstructor(int RollNo, String Name) 
	{
		this.RollNo = RollNo;
		this.Name = Name;
	}
	public int getRollNo() 
	{
		return this.RollNo = RollNo;
	}
	public String getName() 
	{
		return this.Name = Name;
	}
	
}
public class ConstructorEncapsulation 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		StudentConstructor s = new StudentConstructor(1,"Sangram");
		StudentConstructor s1 = new StudentConstructor(2,"Raj");
		System.out.println("--------------------------");
		System.out.println("Roll No  |   Name");
		System.out.println("--------------------------");
		System.out.print(+s1.getRollNo());
		System.out.println("        |  "+s.getName());
		System.out.println("--------------------------");
		System.out.print(+s.getRollNo());
		System.out.println("        |  "+s1.getName());
		System.out.println("--------------------------");


	}

}
