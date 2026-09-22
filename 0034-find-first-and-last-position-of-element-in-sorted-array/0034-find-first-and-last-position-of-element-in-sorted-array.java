class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first=findfirst(nums,target);
        int last=findlast(nums,target);
        return new int[]{first,last};
    }
     int findfirst(int[] nums,int target){
        int low=0;
        int first=-1;
        int high=nums.length-1;
        while(low<=high){
            int mid=low+(high-low/2);

            if(nums[mid]==target){
                first=mid;
                high=mid-1;

            }
            else if(nums[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return first;
     }
      int findlast(int[] nums,int target){
        int low=0;
        int last=-1;
        int high=nums.length-1;
        while(low<=high){
            int mid=low+(high-low/2);

            if(nums[mid]==target){
                last=mid;
                low=mid+1;

            }
            else if(nums[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return last;
     }
}