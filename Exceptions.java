class Exceptions {
		public static void main(String args[]) {
			
			int variable=0;
			try{
				variable=10/0;
			}
			catch(Exception e){
				System.out.println("Divide by zero exception occured");
			}
			finally {
				System.out.println("value divide by zero :"+variable); 

			}
			try{
				 String secoundvariable=null;
				 secoundvariable.contentEquals("null value present");
			}
			catch(NullPointerException e){
				System.out.println("Null pointer exception"); 
			}
			finally {
				System.out.println("secound variable"); 

			}
			
		}
			
} 
//create a hairarchy of user defined exception and catch them
