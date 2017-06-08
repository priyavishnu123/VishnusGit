package Priya;
import java.util.ArrayList;

import java.util.Iterator;



public class Employee {
	int userId;
	String firstName;
	String lastName;
	int age;
	long phone;
	int height;
	String address1;
	String address2;
	String city;
	int zip;
	String country;
	Employee(int Id, String first, String last, int a, long p, int h, String a1,	String a2, String cty, int zp, 	String cou)
	{
userId=Id;
firstName=first;
lastName=last;
age=a;
phone=p;
height=h;
address1=a1;
address2=a2;
city=cty;
zip=zp;
country=cou;
	}
	public static void main(String[] args)
	{
		Employee V1=new Employee(89,"James","Bond",5,775554,67899,"Newark","Walnut","CA",87373,"USA");
		Employee V2=new Employee(9,"Joe","Sai",5,775554,67899,"Newark","Walnut","CA",87373,"USA");
		
		ArrayList<Employee> al=new ArrayList<Employee>();
		al.add(V1);
		al.add(V2);
		Iterator itr=al.iterator();
		
		while(itr.hasNext())
		{
			Employee Vt=(Employee)itr.next();
			System.out.println("ID is"+Vt.userId+" "+Vt.firstName+" "+Vt.lastName+" "+Vt.age+" "+Vt.phone+" "+Vt.height+" "+Vt.address1+" "+Vt.zip+" "+Vt.address2+" "+Vt.country);
			
		}
		
	}
	}
	
