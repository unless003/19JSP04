package inherited;

public class MainAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Dog dog = new Dog();
//		System.out.println(dog.name+" = " +dog.nameDog);
		
	Dog dog = new Dog("Kiki", 11," gogo");
	System.out.println("------------------Dog----------------------");
	System.out.println("Name = "+dog.name+"  || age = "+dog.age+"  || voice = "+dog.voice);
	Tiger tiger = new Tiger("LuLu", 12 , " meomeo");
	System.out.println("------------------Tiger----------------------");
	System.out.println("Name = "+tiger.name+"  || age = "+tiger.age+"  || voice = "+tiger.voice);
	}

}
