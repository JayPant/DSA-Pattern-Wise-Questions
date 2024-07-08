
import java.util.*;
public class MaximumSumSubarray {
    static long maximumSumSubarray(int k, ArrayList<Integer> Arr,int N){
       
       int start =0, end = 0;
       long sum =0 ;
       long max = Integer.MIN_VALUE;
       
       while(end < N){
           sum+= Arr.get(end);
           
           if(end - start +1 < k){
               end++;
           }
           else if(end - start +1 == k){
               max = Math.max(max,sum);
               sum -= Arr.get(start);
               start++;
               end++;
               
           }
       }
       return (long)max;
    }
}
