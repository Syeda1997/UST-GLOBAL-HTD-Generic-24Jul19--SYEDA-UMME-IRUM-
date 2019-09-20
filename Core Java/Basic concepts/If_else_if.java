public class If_else_if{
	public static void main(String[] args) {
		int a=10;
		int b=200;
		int c=30;
		if(a>b){
			System.out.println("a is greater");
		}
		else if(b>c){
			System.out.println("b is greater");
		}
		else{
			System.out.println("c is greater");
		}
		System.out.println("outside block");
	}
}