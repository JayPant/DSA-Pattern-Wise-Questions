public class FindNthRoot {
    public int NthRoot(int n, int m)
    {
        // code here
       int low = 1,high=m;
       
       while(low<=high)
       {
           int mid = low + (high-low)/2;
           int midPow =  (int)Math.pow(mid,n);
           
           if(midPow == m)
           {
               return mid;
           }
           else if(midPow < m){
               low = mid+1;
           }else{
               high= mid-1;
           }
       }
       
       return -1;
    }
}
