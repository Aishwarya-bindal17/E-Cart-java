import java.util.Scanner;
public class Customers {

	Name name;
	String custype="";
	Address address;
	long phoneNo=-1;
	String location;
	
	public void getData() {
		
		System.out.println("Please enter your details: ");
		Scanner sc = new Scanner(System.in); 
		 System.out.println("Name: ");  
		 name = new Name(sc.next(),sc.next(),sc.next());
	      System.out.println("guest or prime user: ");  
	      custype = sc.next();
	      System.out.println("address: ");  
	      address = new Address(sc.next(), sc.next(), sc.next());
	      System.out.println("phoneNo: ");  
	      try {
	    	  phoneNo=sc.nextInt();
	      }
	      catch(Exception e)
	      {
	    	  throw new  Error("Enter valid no.");
	      }
	      
	}
	
	public void display() {
		System.out.println("User details are: ");
		System.out.println("Name: "+name.getFullName());  
	      System.out.println("type: "+custype);  
	      System.out.println("address: "+address.getAddressDetails());  
	      System.out.println("phone Number: "+phoneNo); 
	      System.out.println();
	      System.out.println();
		
	}
	
}
