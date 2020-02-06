import java.util.*;
import java.lang.Exception;

class AgeException 
{
     static void age(int a) throws AgeValidationException 
         {
             System.out.println("called age("+a+")");
                 if (a<18)
                        throw new AgeValidationException(a);
             System.out.println("Valid Age");
     }

        public static void main(String arg[]) 
        {
                try 
                {
                	System.out.println("Enter the age: ");
                        age(20);
                        age(10);
                }
                catch (AgeValidationException e) 
                {	
                    System.out.println("Age is less");
                        System.out.println("caught  "+e);
        }
        }  
}
class AgeValidationException extends Exception 
{
    private int detail;
    AgeValidationException(int a) 
        {
        detail = a;
    }
    AgeValidationException(String args) 
        {
                super(args);
        }
    public String toString()      
        {
        return "AgeValidationException["+detail+"]";
    }
}