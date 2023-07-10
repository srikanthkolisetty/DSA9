package Ass9;

public class DSA1 {
	    public static boolean powerOfTwo(int n)
	    {
	        while(n % 2 == 0)
	            n /= 2;
	        return (n == 1);
	    }
	    public static void main(String args[])
	    {
	        int n = 16;
	        if(powerOfTwo(n))
	            System.out.println("Yes");
	        else
	            System.out.println("No");
	    }
}
