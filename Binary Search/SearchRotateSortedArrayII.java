public class SearchRotateSortedArrayII {
    public int search(int[] arr, int target) {
        int low = 0;
        int high = arr.length-1;

        while(low<=high)
        {
            int mid = low + (high-low) / 2;

            if(arr[mid] == target)
            {
                return mid;  //if found return it
            }

            if(arr[low] == arr[mid] && arr[mid] == arr[high])
            {
                low++;
                high--;
                continue;
            }
            //check for the sorted part
            if(arr[low] <= arr[mid])           
            {   
                //if low is smaller than mid means left part is sorted otherwise right part is sorted
                if(arr[low] <=target && target <= arr[mid]){
                 high=mid-1; //if  low<=target<=mid means it is in left part so eliminate right part 
                }
                else{
                    low = mid+1; //if not then eliminate left part;
                }
            }else{
                if(arr[mid] <= target && target <= arr[high])
                {
                    low = mid+1; //if  mid<=target<=high means it is in right part so eliminate left part 
                }else{
                    high=mid-1; //if not then eliminate right part;
                }
            }
        }

        return -1;

    }
}
