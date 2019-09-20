public class ex_if_elseif{
	public static void main(String[] args) {
		int marks=k140;
		if(marks>=91 && marks<=100){
			System.out.println("grade is A");
		}
		else if(marks>=81 && marks<=90){
			System.out.println("grade is B");
		}
		else if(marks>=71 && marks<=80){
			System.out.println("grade is C");
		}
		else if(marks>=61 && marks<=70){
			System.out.println("grade is D");
		}
		else if(marks>=51 && marks<=60){
			System.out.println("grade is E");
		}
		else if(marks>=41 && marks<=50){
			System.out.println("RETEST");
		}
		else if(marks>=0 && marks<=40) {
			System.out.println("FAIL");
		}
		else{
			System.out.println("Invalid marks");
		}
		System.out.println("outside the if else_if block");
	}
}