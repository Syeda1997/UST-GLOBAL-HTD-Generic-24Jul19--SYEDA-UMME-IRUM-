public class Assign2{
	public static void main(String[] args) {
		for(int i=1;i<=4;i++){
			int row=i;
			for(int j=1;j<=i;j++){
				System.out.print(row + " ");
				row=row+4-j;
			}
			System.out.println();
		}
	}
}
