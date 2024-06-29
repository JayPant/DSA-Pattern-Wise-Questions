public class KokoEatingBanana {
    private int maxPile(int[] piles){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<piles.length;i++){
            if(max< piles[i]) max = piles[i];
        }
        return max;
    }

    private int findTotalHour(int[] piles, int hours){
        int totalHr =0;

        for(int i=0;i<piles.length;i++){
            totalHr+= Math.ceil((double)piles[i]/(double)hours);
        }
        return totalHr;
    }

    public int minEatingSpeed(int[] piles, int h) {
        int maxHour = maxPile(piles);
        int low=1, high=maxHour,ans=0;
        while(low<=high){
            int mid = low + (high-low)/2;
            int totalHour = findTotalHour(piles,mid);

            if(totalHour<=h)
            {
                ans = mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }
}
