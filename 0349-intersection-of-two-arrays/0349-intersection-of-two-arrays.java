class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1=new HashSet<>();
        for(int nums:nums1){
            set1.add(nums);
        }
        HashSet<Integer> set2=new HashSet<>();
        for(int nums:nums2){
            set2.add(nums);
        }
        int[] res=new int[1000];
        int i=0;
        for(int set:set1){
            if(set2.contains(set)){
                res[i++]=set;
            }
        }
        
        return Arrays.copyOf(res,i);
    }
}