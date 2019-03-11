import java.util.Scanner;
class main
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int min=sc.nextInt();
int minleft;
int hours=min/60;

if (min>60)
{
minleft=min%60;
System.out.println(hours+" "+minleft);
}
else
{
minleft=min;
System.out.println(hours+" "+minleft);
}
}
}
