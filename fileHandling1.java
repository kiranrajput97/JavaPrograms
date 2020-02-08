import java.util.*;
impor jav.io.*;
public class countNumber{
public static void main(String []args){
int n1=1,nw=0;
char ch;
Scanner sc=new Scanner(System.in);
System.out.println("\n Enter the name of the file:");
String str=sc.nextLine();
FileInputStream f=new FileInputStream(str);
int n=f.availabe();
for(int i=0;i<n;i++){
ch=(char)f.read();
int(ch=='\n)
nw++;
}
System.out.println("number of lines" +nl);       
System.out.println("Number of words"+(nl+nw));
System.out.println("number of characters" +n);
sc.close();
f.close();
}}