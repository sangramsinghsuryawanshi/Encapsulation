package encapsulationPackage;

import java.util.Scanner;

class Reactangle
{
	private int length;
	private int width;
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
}
public class AreaOfReactangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reactangle r = new Reactangle();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter recatngle langth: ");
		int length = sc.nextInt();
		System.out.print("\nEnter recatngle width: ");
		int width = sc.nextInt();
		r.setLength(length);
		r.setWidth(width);
		System.out.print("\nArea of reactangle is: "+(r.getLength())*(r.getWidth()));
	}

}
