import java.util.Scanner;

public class UpperBound {
        static int UpBound(int[] arr, int n, int val)
        {
            int left=0,right=n-1,ans=-1;

            while(left<=right)
            {
                int mid = (left+right)/2;

                if(arr[mid]<= val)
                {
                    left=mid+1;
                }else{
                    ans=mid;
                    right= mid-1;
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

        System.out.println("Enter element to find Upper bound of:");
        int val = s.nextInt();
        s.close();

        System.out.println("Found at index: " + UpBound(arr,n,val));
        
    }
}
