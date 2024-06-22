import java.util.Scanner;


public class BinarySearchRecursive {

    static int BsearchR(int[] arr ,int target, int left, int right)
    {
        if(left>right)
        return -1;

        int mid = left+right/2;

        if(arr[mid] == target){
            return mid;
        }
        else if(arr[mid]>target)
        return BsearchR(arr, target, left, mid-1);

        return BsearchR(arr, target, mid+1, right);
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
        int l=0,r=n-1;
        System.out.println("Found at "+ BsearchR(arr,val,l,r)+ " index");

    }
}
