package objectMethods;

public class DogData extends Dogs {

	public static void main(String[] args) {
		Dogs d1=new Dogs();
		Dogs d2=new Dogs();
		Dogs d3=new Dogs();
		
		d1.setAge(1);
		d1.setBreed("Dober Man");
		d1.setColor("black");
		d1.setName("Shiro");
		
		d2.setAge(2);
		d2.setBreed("german Sphered");
		d2.setColor("brown");
		d2.setName("spike");
		
		d3.setAge(2);
		d3.setBreed("german Sphered");
		d3.setColor("brown");
		d3.setName("spike");

		Dogs [] dog= {d1,d2};
		
		for(int i=0;i<dog.length;i++) {
//			System.out.println("Age: "+dog[i].getAge());
//			System.out.println("Breed: "+dog[i].getBreed());
//			System.out.println("color: "+dog[i].getColor());
//			System.out.println("Name: "+dog[i].getName());
//			System.out.println("**************************8");
			System.out.println(dog[i]);
		}
		System.out.println(d2.equals(d3));
		System.out.println(d3.hashCode());
		System.out.println(d2.hashCode());
	}

}

