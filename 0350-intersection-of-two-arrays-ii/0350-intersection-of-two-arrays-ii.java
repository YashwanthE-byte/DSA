class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num1:nums1){
            map.put(num1,map.getOrDefault(num1,0)+1);
        }
        int[] res=new int[1000];
        int i=0;
        for(int num:nums2){
            if(map.containsKey(num)&&map.get(num)>0){
                 res[i++] = num;
                map.put(num, map.get(num) - 1);
            }
        }
        return Arrays.copyOf(res,i);
    }
}