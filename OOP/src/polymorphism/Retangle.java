package polymorphism;

public class Retangle extends Shape {

	private int lenght;
	private int width;
	
	public Retangle(String color,int lenght,int width) {
		super(color);
		this.color=color;
		this.lenght=lenght;
		this.width=width;
		// TODO Auto-generated constructor stub
	}
	double getArea() {
		return lenght*width;
	}
	public String toString() {
		
		return this.color;
		
	}
}
