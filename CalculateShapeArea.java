package Priya;

import java.util.Scanner;

public class CalculateShapeArea {
	public static void main(String[] args) {
		System.out.println("Please enter the number of sides of the shape you wanted.");
		Scanner vp=new Scanner(System.in);
		int numofsides=vp.nextInt();
		
		
		switch(numofsides)	
		{
		case 1: numofsides=1;
		System.out.println("Please type which shape you want either Circle or Square");
		Scanner cors=new Scanner(System.in);
		String circleorsquare=cors.nextLine();
						if (cors.nextLine()=="circle")
		{
							System.out.println("Enter radius");
							Scanner c1=new Scanner(System.in);
							int areacircle=c1.nextInt();					
							double area=3.14*areacircle*areacircle;
							
							
							System.out.println("The area of circle is"+area );
		}
						else
							
							System.out.println("Enter side of square");
						Scanner s1=new Scanner(System.in);
						int areasq=s1.nextInt();					
						double areas=areasq*areasq;
						
						
						System.out.println("The area of circle is "+areas );
		break;
	
		case 2: numofsides=2;
		System.out.println("you selected rectangle");
		System.out.println("Please enter length and breath");
		Scanner l=new Scanner(System.in);
		int length=l.nextInt();
		Scanner b=new Scanner(System.in);
		int breadth=b.nextInt();
		float rectarea=length*breadth;
		System.out.println("The area of rect is "+rectarea );
		
		
		case 3: numofsides=3;
		System.out.println("You selected triangle");
		System.out.println("Please enter base and height of the side of triangle ");
		Scanner ba=new Scanner(System.in);
		int trianglebase=ba.nextInt();
		Scanner he=new Scanner(System.in);
		int tiragleheight=he.nextInt();
		float areatri=(trianglebase*tiragleheight)/2;
		System.out.println("The area of triangle is "+areatri );
	
		
				}
		
	}
}
