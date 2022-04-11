package LogicalPrograms;

import java.util.Scanner;

public class OvalAndConsonent {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the character ...");		
		char ch=sc.next().charAt(0);
		boolean flag=false;
		switch(ch)
		{
			case 'a': 	flag=true;
					 	break;
			case 'e': 	flag=true;
		 				break;
			case 'i': 	flag=true;
						break;
			case 'o': 	flag=true;
		 				break;
			case 'u': 	flag=true;
		 				break;
			case 'A': 	flag=true;
						break;
			case 'E': 	flag=true;
		 				break;
			case 'I': 	flag=true;
		 				break;
			case 'O': 	flag=true;
		 				break;
			case 'U': 	flag=true;
		 				break;
		 	
			default :
				break;
				
		}
		if(flag)
		{
			System.out.println("Characher "+ch+" is vowel");
		}
		else if(((ch>='A')&&(ch>='Z')||((ch>='a')&&(ch>='z'))))
		{
			System.out.println("Character "+ch+" is Consonent");
		}
		else
			System.out.println("Character "+ch+" is not Character");
	}

}
