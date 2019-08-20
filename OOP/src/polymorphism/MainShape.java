package polymorphism;

public class MainShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape shape ;
		
		shape = new Retangle("Pink",2,4);
		System.out.println("Triangle : "+ shape.getArea() + " || Color : "+shape.toString() );
		shape = new Triangle("Black",8,4);
		System.out.println("Rectangle : "+shape.getArea() + " || Color : "+shape.toString() );
	}

}
