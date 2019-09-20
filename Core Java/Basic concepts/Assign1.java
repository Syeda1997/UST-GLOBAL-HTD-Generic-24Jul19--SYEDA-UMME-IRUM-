public class Assign1{
	public static void main(String[] args) {
		char c1='A';
		char c2='a';
		for(int i=1;i<=3;i++){
			for(int j=1;j<=i;j++){
				System.out.print(c1+""+c2);
				c1++;
				c2++;
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}