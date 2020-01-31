//validate age of a person and display proper message by using user defined exception

class ThrowTest
{  
   public void validate (int age)
   {
           try
           {
                   if (age <18)  
                           throw new ArithmeticException ("not valid");  
                   else
                           System.out.println ("welcome to vote");  
           }
           catch (ArithmeticException e)
           {
                   System.out.println ( "Not Eligable to vote");
                   throw e;
           }
   }    
}  
public class UserException2 
{
        public static void main (String args [])
        {
                ThrowTest throwValue = new ThrowTest ();
                try
                {
                        throwValue.validate (14);
                        try
                        {    
                                try
                                {
                                        int data = 100/0;  
                                }
                                catch (ArithmeticException e)
                                {        
                                        System.out.println (e);
                                }
                      
                                String a = null; // null value 
                                System.out.println (a.charAt (0)); 
                        }
                        catch (NullPointerException e) 
                        { 
                                System.out.println ( "NullPointerException ..");
                        }
                }
                catch (ArithmeticException e)
                {
                        System.out.println ( "Recaught");
                }
                
                System.out.println ("rest of the code ...");                    
        }
}

