package encapsulationPackage;
class Circle
{
	private int r;

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}
}
public class CirclePerimeterAndArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c = new Circle();
		Circle c1 = new Circle();
		c.setR(2);
		c1.setR(4);
		System.out.println("Area of circle is: "+2*(3.14*(c.getR())*c.getR()));
		System.out.println("Perimeter of circle is: "+2*(3.14*(c.getR())));
	}

}
