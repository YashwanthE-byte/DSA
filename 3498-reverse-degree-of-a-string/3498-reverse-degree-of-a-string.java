class Solution {
    public int reverseDegree(String s) {
        int res=0;
        for(int i=0;i<s.length();i++){
            int sum=(123-s.charAt(i))*(i+1);
            res=res+sum;
        }
        return res;
    }
}