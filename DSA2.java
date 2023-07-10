package Ass9;

public class DSA2 {

	public static void main(String[] args) {
		
		int n=3;
		System.out.println(recur(n));
	}
	
	public static int recur(int n)
	{
		
		if(n<=1)
			return n;
		else
			return n+recur(n-1);
	
	
	}
}

