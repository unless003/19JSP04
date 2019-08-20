package polymorphism;

public class Shape {
	public String color;
	public Shape(String color) {
		super();
		this.color = color;
	}
	double getArea() {
		return 0;
	}
	public String toString() {
		return color;
		
	}
}
