package task1;

import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	 {
		double x1;
		double y1;
		double x2;
		double y2;
		
		double[] coords = new double[2];
		
		Scanner scanner = new Scanner(System.in);
		Line line1 = new Line();
		
		System.out.println("Input first dot");
		
		System.out.print("x1 = ");
		x1 = scanner.nextDouble();
		System.out.print("y1 = ");
		y1 = scanner.nextDouble();
		
		System.out.print("x2 = ");
		x2 = scanner.nextDouble();
		System.out.print("y2 = ");
		y2 = scanner.nextDouble();
		
		coords[0] = x1;
		coords[1] = y1;
		
		line1.setFirstPont(coords);
		
		coords[0] = x2;
		coords[1] = y2;
		
		line1.setSecondPont(coords);
		line1.print();
		
		//---------------
		
		double[] vCoords1 = {3.02, 1.9, 4.44};
		double[] vCoords2 = {1.23, 44.0, 9.81};
		
		Vector3D vect1 = new Vector3D(vCoords1);
		Vector3D vect2 = new Vector3D(vCoords2);
	 
		double[] mult = vect1.multiply(vect2);
		double[] sum = vect1.sum(vect2);
		double[] diff = vect1.diff(vect2);
		
		System.out.println("\nVector 1 len = " + vect1.length() + " , vector 2 len = " + vect2.length());
		System.out.println("Scalar v1 + v2 = " + vect1.scalar(vect2));
		
		System.out.print("v1 * v2 = [");
		for (int i = 0; i < mult.length; ++i)
			System.out.print(mult[i] + ", ");
		System.out.println("]");
		
		System.out.println("Angle v1 v2 = " + vect1.angle(vect2));
		
		System.out.print("v1 + v2 = [");
		for (int i = 0; i < sum.length; ++i)
			System.out.print(sum[i] + ", ");
		System.out.println("]");
		
		System.out.print("v1 - v2 = [");
		for (int i = 0; i < diff.length; ++i)
			System.out.print(diff[i] + ", ");
		System.out.println("]");
		
	 }
}
