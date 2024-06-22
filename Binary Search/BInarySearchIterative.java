import java.util.Scanner;

class BinarySearchIterative{

    static int search(int[] arr, int n, int target)
    {
        int left=0,right=n-1;

        while(left<=right)
        {
            int mid = left+ (right-left)/2;

            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid] > target)
            {
                right = mid-1;
            }else{
                left = mid +1;
            }
        }

        return -1;
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

        System.out.println("Enter element to search");
        int val = s.nextInt();
        s.close();

        System.out.println("Found at "+ search(arr,n,val)+ " index");
        
    }
}