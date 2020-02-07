public class ExceptionSalary{
public static void main(String args[]){
	throw throwvalue=new throw();
	try{
		throwvalue.validate(301);
		throwvalue.validate(4000);
	}
	catch(ArithmeticException e)
	{
		System.OutOfMemoryError.println("exception caught");
	}
}
}
class throw{

	public void validate (int salary){

		try{
			if(salary<3000)
				throw new ArithmeticException();
			else
			{
				System.OutOfMemoryError.println("salary is greater than the manager");
			}
		}
		catch(ArithmeticException e)
		{
System.out.println("salary is les than the manager");

		}
	}
}