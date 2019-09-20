public class LogicalOperators{
	public static void main(String[] args) {
		boolean b=false;
		boolean c=true;
		
		boolean d=b&&c;
		System.out.println("For &&: " +d);

		d=b||c;
		System.out.println("For ||: " +d);

		d=!(b||c);
		System.out.println("For !: " +d);
	}
}