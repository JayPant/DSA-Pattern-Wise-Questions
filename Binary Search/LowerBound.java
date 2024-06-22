import java.util.Scanner;

public class LowerBound {

        static int lowBound(int[] arr, int n, int value)
        {
            int left=0,right=n-1,ans=n;

            while(left<=right)
            {
                int mid = left+right/2;

                if(arr[mid] >= value)
                {
                    ans = mid;
                    right=mid-1;
                }else{
                    left=mid+1;
                }
            }

            return ans;
        }
        public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter size of array");
        int n = s.nextInt();
        
        System.out.println("Enter Array Elements: ");
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
        }

        System.out.println("Enter element to find Lower bound of:");
        int val = s.nextInt();
        s.close();

        System.out.println("Found at index" + lowBound(arr,n,val));
        
    }
}
