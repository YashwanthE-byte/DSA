class Solution {
    public boolean checkIfPangram(String sentence) {
        boolean[] got = new boolean[26];

        for(char ch:sentence.toCharArray()){
            got[ch-'a']=true;
        }
        for(boolean x:got){
            if(!x){
                return false;
            }

        }
        return true;
    }
}