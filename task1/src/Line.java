public class Line
{
	public void print()
	{
		System.out.printf("Line\'s the first dot = {%f, %f}, the second one = {%f, %f}\n", this.x1, this.y1, this.x2, this.y2);
	}
	
	public double[] getFirstPoint()
	{
		double[] data = {this.x1, this.y1};
		return data;
	}
	
	public double[] getSecondPoint()
	{
		double[] data = {this.x2, this.y2};
		return data;
	}
	
	public void setFirstPont(double[] coords)
	{
		this.x1 = coords[0];
		this.y1 = coords[1];
	}
	
	public void setSecondPont(double[] coords)
	{
		this.x2 = coords[0];
		this.y2 = coords[1];
	}
	
	private double x1;
	private double y1;
	private double x2;
	private double y2;
}
