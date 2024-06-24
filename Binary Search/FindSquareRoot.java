import java.util.Scanner;

public class FindSquareRoot {
    long floorSqrt(long x)
    {
        long low=1, high=x, ans=0;

        if(x==0 || x==1) return x;

        while(low<=high)
        {
            long mid = low + (high-low)/2;

            if(mid*mid == x) return mid;

            if(mid*mid<x)
            {
                low=mid+1;
                ans=mid;
            }
            else{
                high=mid-1;
            }
        }

        return ans;
    }

    public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t > 0)
		{
			long a = sc.nextInt();
			FindSquareRoot obj = new FindSquareRoot();
			System.out.println(obj.floorSqrt(a));
			t--;
		}
		sc.close();
	}
}

