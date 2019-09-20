public class AllOperators{
	public static void main(String[] args) {
		int i=7;
		int j=3;

		int k=i+j;
		System.out.println("For +: " +k);

		i-=j;
		System.out.println("For -=: " +i);

		i++;
		System.out.println("For ++: " +i);

		boolean b=i<j;
		System.out.println("For <: " +b);

		boolean m=true;
		boolean n=false;
		b=m&&n;
		System.out.println("For &&: " +b);

		k=i|j;
		System.out.println("For |: " +k);
	}
}