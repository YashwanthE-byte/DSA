class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count =0;
        int maxcount = 0;

        for(int num :nums){
            if(num==1){
                count++;
                maxcount = Math.max(maxcount,count);

            }
            else{
                count=0;
            }
        }
        return maxcount;
    }
}