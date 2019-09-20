public class Assign4{
	public static void main(String[] args) {
		int n=3,sp=n,no=1;
		char ch='A';
		for (int i=1;i<=n;i++){
			for(int k=1;k<=sp;k++){
				System.out.print(" ");
			}
			sp--;
			
			for (int j=1;j<=i*2-1 ;j++,ch++){
	 			System.out.print(ch);
	 		}
			System.out.println();
		}
		sp=2;
		for (int i=1;i<=n-1;i++ ) {
			for (int k=1;k<=sp;k++ ){ 
				System.out.print(" ");
			}
			sp++;
			for(int j=1;j<=2*(n-i)-1;j++,no++){
				System.out.print(no);
			}
			
			System.out.println();
			
		}
	}
}