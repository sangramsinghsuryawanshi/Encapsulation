package encapsulationPackage;
class Student
{
	private int Rollno;
	private String Name;
	public void getRollno(int Rollno) 
	{
		this.Rollno=Rollno;
	}
	public void getName(String Name) 
	{
		 this.Name=Name;
	}
	public int setRollno() 
	{
		return this.Rollno=Rollno;
	}
	public String setName() 
	{
		return this.Name=Name;
	}
}
public class EnacpsulationDemo 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Student s = new Student();
		s.getRollno(89);
		s.getName("Sangram");
		System.out.println(s.setRollno());
		System.out.println(s.setName());
	}

}
