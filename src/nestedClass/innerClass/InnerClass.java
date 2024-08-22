package nestedClass.innerClass;
class Outer
{
	private int id=1;
	class Inner
	{
		public void show()
		{
			System.out.println("Inner class show method..");
			System.out.println("Outer class field accesed in show method: "+id);
		}
	}
}
public class InnerClass 
{
	public static void main(String[] args) 
	{
		Outer.Inner io = new Outer().new Inner();
		io.show();
		System.out.println(io.getClass());

	}

}
