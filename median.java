import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int a[]=new int[5];
	    int sum=0,median;
	    for (int i=0;i<=n;i++)
		{
		    a[i]=sc.nextInt();
		}
		for (int i=0;i<n;i++)
		{
		    sum+=a[i];
		}
		median=sum/n;
		System.out.println(median);
	}
}

