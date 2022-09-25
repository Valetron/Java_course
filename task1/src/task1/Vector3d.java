package task1;

import java.util.Random;

public class Vector3D extends Line
{
	public Vector3D(double[] coords)
	{
		this.x1 = coords[0];
		this.y1 = coords[1];
		this.z1 = coords[2];
	}
	
	public double[] getCoords()
	{
		double[] coords = {x1, y1, z1};
		return coords;
	}
	
	public double length()
	{
		return (Math.sqrt(x1*x1 + y1*y1 + z1*z1));
	}
	
	public double scalar(Vector3D vector)
	{
		double[] coords = vector.getCoords();
		return (x1*coords[0] + y1*coords[1] + z1*coords[2]);
	}
	
	public double[] multiply(Vector3D vector)
	{
		double[] coords = vector.getCoords();
		double[] res = new double[3];
		
		res[0] = y1 * coords[2] - z1 * coords[1];
		res[1] = z1 * coords[0] - x1 * coords[2];
		res[2] = x1 * coords[1] - y1 * coords[0];
		
		return res;
	}
	
	public double angle(Vector3D vector)
	{
		double scl = scalar(vector);
		double res = scl / (length() * vector.length());
		
		return res;
	}
	
	public double[] sum(Vector3D vector)
	{
		double[] res = new double[3];
		double[] vec = vector.getCoords();
		
		res[0] = x1 + vec[0];
		res[1] = y1 + vec[1];
		res[2] = z1 + vec[2];
		
		return res;
	}
	
	public double[] diff(Vector3D vector)
	{
		double[] res = new double[3];
		double[] vec = vector.getCoords();
		
		res[0] = x1 - vec[0];
		res[1] = y1 - vec[1];
		res[2] = z1 - vec[2];
		
		return res;
	}
	
	public static Vector3D[] foo(int N)
	{
		Vector3D[] vectors = new Vector3D[N];
		Vector3D vect;
		double[] coords = new double[3];
		Random rand = new Random();
		
		for (int i = 0; i < N; ++i)
		{
			coords[0] = rand.nextDouble();
			coords[1] = rand.nextDouble();
			coords[2] = rand.nextDouble();
			
			vect = new Vector3D(coords);
			
			vectors[i] = vect;
		}
		
		return vectors;
	}
	
	private double x1;
	private double y1;
	private double z1;
}
