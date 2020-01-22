public class Person{
	public String name;
	public int age;
	public void setAge(int a) {
	a=age;}
	public void setName(String b) {
		b=name;}
	
		public int getAge() {
		return(age);
		}
		
		public String getName() {
		return(name);
		
		}
		 class Student extends Person{
			public String Sname;
			public int rollno;
			public void rollno(int c) {
			c=rollno;}
			
			public void setName(String d) {
				d=Sname;}
			
				public int rollno() {
				return(rollno);}
				
				public String getSName() {
				return(Sname);

	
	}
 }

public class Example
{
	public static void main(String []args)
	{
		Student p1=new Student();
		p1.setAge(25);
		p1.setName("karan");
		p1.Sname("SFS");
		p1.rollno(7472);
		
		System.out.println("age:"+p1.getAge());
		System.out.println("age:"+p1.getname());
		System.out.println("age:"+p1.getsname());
		System.out.println("age:"+p1.getrollno());
	}
	
	
	
	
}
}
