package encapsulationPackage;
class ReadOnly
{
	private int RollNo=1;
	private String Name="sangram";
	public int getRollNo()
	{
		return RollNo;
	}
	public String getName()
	{
		return Name;
	}
	
}
class WriteOnly
{
	private Integer RollNo;
	private String Name;
	public void setRollNo(int rollNo) 
	{
		this.RollNo = rollNo;
	}
	public void setName(String name) 
	{
		this.Name = name;
	}
	public void disp()
	{
		System.out.println("Write Only: "+RollNo+"<--RollNo--Name-->"+Name);
	}
}
public class ReadAndWriteOnlyEnacapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReadOnly  r = new ReadOnly();
		System.out.println("ReadOnly -->"+r.getRollNo());
		System.out.println("ReadOnly--> "+r.getName());
		WriteOnly w = new WriteOnly();
		w.setRollNo(122);
		w.setName("Raj");
		w.disp();
	}

}
