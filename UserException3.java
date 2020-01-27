import java.lang.Exception;
class Throw{  
public void validate(int salary){
    try{
            if(salary<3000)  
                    throw new ArithmeticException();  
            else
                    System.out.println("Your salary is more than manager");  
    }
    catch(ArithmeticException e){
            System.out.println("Your salary is less than your manager");
            throw e;
    }
}    
}  
public class UserException3 {
 public static void main(String args[]){
         Throw throwValue = new Throw();
         try{
                 throwValue.validate(301);
               //  throwValue.validate(3001);

         }
         catch(ArithmeticException e){
                 System.out.println("Recaught");
         }
         }
}

