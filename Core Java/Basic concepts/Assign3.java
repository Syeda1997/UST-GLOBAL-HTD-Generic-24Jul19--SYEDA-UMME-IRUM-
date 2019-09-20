public class Assign3{
	public static void main(String[] args) {
		int n=3,sp=n;
		for (int i=1;i<=n;i++){
			for(int k=1;k<=sp;k++)
				System.out.print(" ");
			sp--;
			for (int j=1;j<=i*2-1 ;j++ ) 
	 			System.out.print("*");
			System.out.println();
		}
		sp=2;
		for (int i=1;i<=n-1;i++ ) {
			for (int k=1;k<=sp;k++ ) 
				System.out.print(" ");
			
			sp++;
			for(int j=1;j<=2*(n-i)-1;j++)
				System.out.print("*");
			
			System.out.println();
			
		}
	}
}