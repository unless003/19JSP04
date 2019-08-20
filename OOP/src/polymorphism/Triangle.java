package polymorphism;

public class Triangle extends Shape {

	private int base;
	private int height;
	public Triangle(String color,int base, int height) {
		super(color);
		this.color=color;
		this.base=base;
		this.height=height;
		// TODO Auto-generated constructor stub
	}
	double getArea() {
		return 0.5*base*height;
	}
	public String toString() {
		return this.color;
		
	}
}
