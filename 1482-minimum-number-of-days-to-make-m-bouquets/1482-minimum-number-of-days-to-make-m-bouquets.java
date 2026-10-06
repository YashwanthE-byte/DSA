class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
       if((long)m*k>bloomDay.length){
        return -1;
       } 
       int low=Integer.MAX_VALUE;
       for(int bloom : bloomDay){
            low=Math.min(low,bloom);
       }
       int high=Integer.MIN_VALUE;
        for(int bloom : bloomDay){
            high=Math.max(high,bloom);
       }
       while(low<=high){
        int mid=low+(high-low)/2;
        int count =0;
        int bouq=0;
        for(int i=0;i<bloomDay.length;i++){
        if(bloomDay[i]<=mid){
            count++;

            if(count==k){
                bouq++;
                count=0;
            }
        }
        else{
            count=0;
        }
        }
        
        if(bouq>=m){
            high=mid-1;
        }
        else{
            low=mid+1;
        }
        
       }
       return low;
    }
}