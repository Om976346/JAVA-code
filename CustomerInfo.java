package om;
import java.util.LinkedList;
import java.util.Scanner;

class Customer
{
	public String name;
	public String email;
	public int  mob;
	public int age ;
	
	public Customer(String name, String email ,int mob ,int age)
	{
		this.name=name;
		this.email=email;
		this.mob=mob;
		this.age=age;
		
	}
	
	public String getname()
	{
		return name;
	}
	
	public String getemail()
	{
		return email;
	}
	
	public int getmob()
	{
		return mob;
	}
	
	public int getage()
	{
		return age;
	}
			
}


public class CustomerInfo {

	public static void main(String[] args) 
	{
		LinkedList<Customer> customerList= new LinkedList<>();
		Scanner sc= new Scanner(System.in);
		
		System.out.println("How many employee you want to add:-");
		int n =sc.nextInt();
		
		for(int i=0;i<n;i++)
		{
			    System.out.println("Name: ");
	            String name = sc.next();
	            
	            System.out.println("email: ");
	            String email = sc.next();
	            
	            System.out.println("mob: ");
	            int mob = sc.nextInt();
	            
	            System.out.println("age: ");
	            int age =sc.nextInt();
	            
	            customerList.add(new Customer(name,email,mob,age));
	            
	           System.out.println("Customer added successfully!\n");
	           System.out.println("\n\n");
		}
		
		  System.out.println("** Customer Information **");
	        for (Customer customer : customerList) {
	            System.out.println("Name: " + customer.getname());
	            System.out.println("Email: " + customer.getemail());
	            System.out.println("mob: " + customer.getmob());
	            System.out.println("age: " + customer.getage());
	            System.out.println("---------------------------");
	        }
		
	
	}

}
