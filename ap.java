import java.util.Scanner;
class Solution
{
public static void main(String[] args)
{
Scanner sc= new Scanner(System.in);
int n=sc.nextInt();
int a=sc.nextInt();
int d=sc.nextInt();
int sum=0;
sum=((2*a+(n-1)*d)*n)/2;
System.out.println(sum);
}}
