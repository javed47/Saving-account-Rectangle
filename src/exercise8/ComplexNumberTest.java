package exercise8;

//import scanner
import java.util.Scanner;

//Main method class
public class ComplexNumberTest {

	public static void main(String[] args)
	{
		double real1 = 0;
		double imaginary1 = 0;
		double real2 = 0;
		double imaginary2 = 0;

		//Initializing four input for two complex numbers
		Scanner input1 = new Scanner(System.in);
		Scanner input2 = new Scanner(System.in);
		Scanner input3 = new Scanner(System.in);
		Scanner input4 = new Scanner(System.in);
		
		for(int i=1; i <= 4; i++)
		{
			
			switch(i)
			{
			case 2:	System.out.print("Give the 1st imaginary number: ");
					imaginary1 = input2.nextDouble();
					break;
				
				
			case 4:	System.out.print("Give the 2nd imaginary number: ");
					imaginary2 = input4.nextDouble();
					break;
			
			case 1:	System.out.print("Give the 1st real number: ");
					real1 = input1.nextDouble();
					break;
				
			case 3:	System.out.print("Give the 2nd real number: ");
					real2 = input3.nextDouble();
					break;
			}
		}
		
		ComplexNumber number = new ComplexNumber(real1,imaginary1,real2,imaginary2);
		
		number.addComplex();
		number.subtractComplex();
		number.printComplex();
		
	}
}
//Class that calculates complex number addition and subtraction
class ComplexNumber
{
	//Initializing private variables
	private double realNumber1; 
	private double imaginaryNumber1;
	private double realNumber2; 
	private double imaginaryNumber2;
	private double realNumber3; 
	private double imaginaryNumber3;
	private double realNumber;
	private double imaginaryNumber;
	
	
	public ComplexNumber()
	{
		this(0.0,0.0,0.0,0.0);
	}
	
	public ComplexNumber(double real1, double imaginary1, double real2, double imaginary2)
	{
		this.realNumber1 = real1;
		this.realNumber2 = real2;
		this.imaginaryNumber1 = imaginary1;
		this.imaginaryNumber2 = imaginary2;
	}
	
	public void addComplex()
	{
		realNumber = realNumber1 + realNumber2;
		imaginaryNumber = imaginaryNumber1 + imaginaryNumber2;
	}
	
	public void subtractComplex()
	{
		realNumber3 = realNumber1 - realNumber2;
		imaginaryNumber3 = imaginaryNumber1 - imaginaryNumber2;
	}
	
	public void printComplex()
	{
		if(imaginaryNumber3 < 0)
		{System.out.printf("%s%.2f+%.2f%s%n","The result of addition is: ", realNumber, imaginaryNumber, "i");
		System.out.printf("%s%.2f%.2f%s%n","The result of subtraction is: ",realNumber3, imaginaryNumber3, "i");
		}
		else
		{System.out.printf("%s%.2f+%.2f%s%n","The result of addition is: ", realNumber, imaginaryNumber, "i");
		System.out.printf("%s%.2f+%.2f%s%n","The result of subtraction is: ",realNumber3, imaginaryNumber3, "i");
		}
	}
}
