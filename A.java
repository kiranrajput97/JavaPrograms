import java.util.*;
class word
{
	String a[]={"", "one", "two","three", "four","five","six", "seven", "eight", "nine", "ten", "eleven", "twelve","thirteen", "fourteen","fifteen", "sixteen","seventeen", "eighteen", "nineteen"}; 
     String b[]={"", "", "twenty", "thirty", "forty", "fifty","sixty", "seventy", "eighty", "ninety"};
     String c[]={ "","","","hundred", "thousand","thousand","lakh","lakh","crore","crore"};
     public StringWord(String ad,int c)
     {   String ad;ad="";
     	int ap,rev,r;
     	ap=0;
     	ap=(int)ad;
     	r=ap%10;
     	rev=ap/10;
     	if(rev!=1)
     	{
     		ad=b[rev]+" "+a[r]+" "+c[c];
     	}
     	else
     	{
     		ad=a[ap]+" "+c[c];
     	}
     	return ad;
     }
     public static void main(String...args)
     {
     	Scanner sc=new Scanner(System.in);
     	word obj=new word();
     	String sc,sd,as;
     	int a,n,i,p;
     	sd="";
     	System.out.println("Enter a number");
     	n=sc.nextInt();
     	if(n>=999999999)
     	{
     		System.out.println("Sorry!! INvalid number");
     	}
     	else
     	{
     		sc=(String)n;
     		a=sc.length();
     		for(int i=0;i<9-a;i++)
     		{
     			sc='0'+sc;
     		}
     		for(i=0;i<=8;)
     		{
     			if(sc.length!=3)
     			{
     				sd=sc.substring(i,i+2);
     				as=as+obj.StringWord(sd,sc.length())+" ";
     				sc=sc.substring(ap.length());
     				i=i+2;
     			}
     			if(sc.length()==3)
     			{
     				sd=sc.substring(i,i+1);
     				as=as+obj.StringWord(sd,sc.length())+" ";
     				sc=sc.substring(sd.length());

     			}
     			if(sc==NULL)
     			{
     				break;
     			}

     		}
     		System.out.println(as);
     	}
     }
 }