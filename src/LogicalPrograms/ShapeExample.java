package LogicalPrograms;

import java.util.Scanner;

public class ShapeExample 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter the Shape Size......");
		int size=sc.nextInt();
		
		System.out.println("Which Shape You Want to print...");
		System.out.println("For Traingle Type >> T  ");
		System.out.println("For Reverse Traingle Type >> RT  ");
		System.out.println("For Diamond Type >> D  ");
		
		String type=sc.next();
		if(type.equalsIgnoreCase("T"))
			Shapes.traingle(size);
		else if(type.equalsIgnoreCase("RT"))
			Shapes.reverseTraingle(size);
		else if(type.equalsIgnoreCase("D"))
			Shapes.diamond(size);
		
		sc.close();		
	}

}
