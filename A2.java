interface printable
{
void print();
}
class interfaceA2 implements printable
{
public void print()
{
System.out.println("hello");
}
public static void main(String arg[])
{
interfaceA2 obj=new interfaceA2();
obj.print();
}
}