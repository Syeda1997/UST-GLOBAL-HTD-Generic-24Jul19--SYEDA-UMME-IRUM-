package objectMethods;

public class ObjectMethods {

	public static void main(String[] args) {
		Dogs d1=new Dogs();
		Dogs d2=new Dogs();
		
		System.out.println(d1.getClass());
		System.out.println(d2.getClass());
		
		//System.out.println(d1.clone()); its a marker interface we dont get the clone method for the object class

	}

}
