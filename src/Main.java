
public class Main {

	public static void main(String[] args) {
		Circle c1=new Circle(new Point(5.0d,1.0d),new Point(6.0d,7.0d));
		System.out.print("Ray: "+c1.getRay()+"\n");
		System.out.print("Diameter: "+c1.getDiameter()+"\n");
		System.out.print("Perimeter: "+c1.getPerimeter()+"\n");
		System.out.print("Area: "+c1.getArea()+"\n\n");
		System.out.print(c1.toString()+"\n");
	}
}
