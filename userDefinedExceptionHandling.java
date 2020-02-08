// user defined exception handling in java.
import jav.util.Scanner;

public class Main{

public static void main(String []args){

Scanner sc=new Scanner(System.in);
EmployeeName ob=new EmploeeName();
System.out.prinltln("Enter first name");
String firstname=sc.nextLine();
System.out.println("Enter last name");
String lastname=sc.nextLine();
try{

ob.checkemployee(firstname,lastname);
}
catch(EmployeeNameException e)
{
System.out.println(" Exception catched"+e);
}}
=====================================================

public class EmployeeName{
	public void checkemployee(String firstname, String lastname) throws EmployeeNameException
{
	if((firstname.isEmpty()) || (lastname.isEmpty())
	throw new  EmployeeNameException("employee name should be present");
}}
==========================================================

class EmployeeNameExcepttion throws Exception
{
public EmployeeNameException(String s)
{
super(s);
}}
============================================================
