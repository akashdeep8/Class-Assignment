import java.util.*;
public class SubArray
{
	public static void main(String[] args)
	{
                     // count of SubArray
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int k = sc.nextInt();
	    int a[] = new int[n];
	    int m = n+1-k;
	    int sol = (m*(m+1))/2;
	    System.out.println("Count of SubArray is "sol);
	}
}

