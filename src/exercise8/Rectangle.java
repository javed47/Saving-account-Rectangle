package exercise8;

//Main method class to test class Rectangle
public class Rectangle
{
	public static void main(String[] args) 
	{
		//Instantiate the class Rectangle
		RectangleMake rectangle = new RectangleMake(20, 5);
		rectangle.areaPerimeter();
		
		//output string of perimeter and area after instantiation
		System.out.printf("%s%n%s%n", "After instantiation: ", rectangle);
		
		try
		{
			rectangle.setLength(20);
			rectangle.setWidth(6);
			rectangle.areaPerimeter();
			
			rectangle.setLength(10);
			rectangle.setWidth(5);
			rectangle.areaPerimeter();
			
			rectangle.setLength(-20);
			rectangle.setWidth(100);
			rectangle.areaPerimeter();
		
	
		System.out.printf("%s%n%s%n", "After putting value in try: ", rectangle);
		}
		catch (IllegalArgumentException e) 
		{
			System.out.printf("Exception while initializing values%n", e.getMessage());
		}
		finally {
			System.out.printf("%s%n%s%n", "After putting value: ", rectangle);
		}
		
	}
}

//A class which can calculate the perimeter and area of a rectangle;
class RectangleMake {

	private double length = 1;
	private double width = 1; 
	double area;
	double perimeter;

	//Constructor of Rectangle
	 public RectangleMake (double length, double width)
	{
		//Exception throwing 
		if((length < 0 || length > 20)||(width < 0 || width > 20))
		{
			throw new IllegalArgumentException("The length should be Greater than 0 and less than 20");
		}
		
		this.length = length;
		this.width = width;
	}
	
	public void setLength(double length)
	{
		if(length < 0 || length > 20)
		{
			throw new IllegalArgumentException("The length should be Greater than 0 and less than 20");
	
		}
		
		this.length = length;
	}
	
	public void setWidth(double width) 
	{
		if(width < 0 || width > 20)
		{
			throw new IllegalArgumentException("The length should be Greater than 0 and less than 20");
	
		}
		
		this.width = width;
	}
	
	public void areaPerimeter()
	{
		this.area = (length * width);
		this.perimeter = (2* (length + width));
	}
	
	
	//ToString method for class Rectangle
	public String toString()
	{
		return String.format("Perimeter: %.3f meter\t Area: %.3f sq.meter", perimeter, area );
		
	}
	
}


