public class Example{
	public static void main(String[] args) {
		String name="syeda";
		int day=6;
		switch(day){
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
			System.out.println("weekdays");
			System.out.println("name = " +name);
			break;
			case 6:
			case 7:
			System.out.println("weekends");
			for(int j=0;j<=5;j++ ){
				System.out.println("name = " +name);
			}
			break;
			default:
			System.out.println("invalid");
		}
	}
}