import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		EmployeeName obj=new EmployeeName();
		System.out.println("Enter first name");
		String firstName=sc.nextLine();
		System.out.println("Enter last name");
		String lastName=sc.nextLine();
		try 
		{
			obj.checkEmployee(firstName, lastName);
		} 
		catch (EmployeeNameException e) 
		{
			System.out.println(e);
		}
		sc.close();
	}

}
 class EmployeeName {
	public void checkEmployee(String firstName, String lastName) throws EmployeeNameException
	{
		if(firstName.isEmpty() && lastName.isEmpty())
		{
			throw new EmployeeNameException("this is user defined exception if user name is not present it will show error!!");
		}
	}
}

class EmployeeNameException extends Exception{
	public EmployeeNameException(String s)
	{
		super(s);
	}
}
