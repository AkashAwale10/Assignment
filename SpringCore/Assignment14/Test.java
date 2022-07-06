package ass14;

import java.util.Scanner;

public class Test {

	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter object to select choice");
		String obj=sc.next();
		
		Circle objcircle= new Circle();		
		Rectangle objrect = new Rectangle();		
		Square objsquare = new Square();
		
		
		if(obj.equals("circle"))
		{
			objcircle.area(10);
		}
		else if(obj.equals("rectangle"))
		{
			objrect.side(15, 10);
		}
		else if(obj.equals("square"))
		{
			objsquare.area(15);
		}
		else
			System.out.println("please select right object");
	}

}
