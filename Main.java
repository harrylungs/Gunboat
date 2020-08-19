import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Enter the distance to the target.");
		double d = reader.nextDouble();
		System.out.println("Enter the height of the battery relative to the height of the water.");
		double h = reader.nextDouble();
		System.out.println("Enter the shell's initial velocity.");
		double v = reader.nextDouble();
		
		double a = -4.9*(d/v)*(d/v);
		double b = d;
		double c = h + a;
		
		double tanTheta = (-b + Math.sqrt(b*b - 4*a*c))/(2*a);
		double angle = Math.atan(tanTheta)*180/3.14159;
		System.out.println(angle + " degrees.");
	}
}
