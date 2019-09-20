public class MethodExample{
	public static int calcArea(int side){
		int area = side*side;
		return area;
	}
	public static void main(String[] args) {
		int a=calcArea(6);
		System.out.println("Area Of Square: "+a);
		double b=areaCir(2.0);
		System.out.println("cir: " +b);
		double c=areaTri(3.0,4.0);
		System.out.println("Tri: " +c);
		int d=avg(1,2,3);
		System.out.println("avg: " +d);
	}
	public static double areaCir(double rad){
		double arcir= 2*3.14*rad;
		return arcir;
	}
	public static double areaTri(double base,double height){
		double artri=0.5*base*height;
		return artri;
	}
	public static int avg(int a,int b,int c){
		int average=(a+b+c)/3;
		return average;
	}
}