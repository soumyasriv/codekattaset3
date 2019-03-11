import java.util.Scanner;
class Main
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
boolean numeric=true;
try
{
Double n=Double.parseDouble(s);
}
catch (NumberFormatException e)
{
numeric=false;
}
if(numeric==true)
System.out.println("yes");
else
System.out.println("no");
}
}
