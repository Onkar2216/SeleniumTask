package LogicalPrograms;

public class Shapes 
{
	static void traingle(int size) 
	{
		//for Row
		for(int i=1;i<=size;i++)
		{
			//Space
			for(int l=i;l<=size;l++)
				System.out.print(" ");
			
			//for Column
			for (int j = 1; j <= i; j++)
					System.out.print( "* ");
			System.out.println();
		}
	}

	static void reverseTraingle(int size) 
	{
		//for Row
		for(int i=size;i>=0;i--)
		{
			//Space
			for(int l=i;l<=size;l++)
				System.out.print(" ");
			
			//for Column
			for(int j=0;j<=i;j++)
				System.out.print("* " );
			System.out.println();
		}
	}

	static void diamond(int size) 
	{
		//for Row
		for(int i=0;i<=size;i++)
		{
			//Space
			for(int l=i;l<=size;l++)
				System.out.print(" ");
		
			//for Column
			for(int j=0;j<=i;j++)
				System.out.print("* " );
			System.out.println();
		}
		for(int i=size-1;i>=0;i--)
		{
			//Space
			for(int l=i;l<=size;l++)
				System.out.print(" ");

			//for Column
			for(int j=0;j<=i;j++)
				System.out.print("* " );
			System.out.println();
		}
	}
}
