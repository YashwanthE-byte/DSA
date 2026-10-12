class Solution {
    public String removeOuterParentheses(String s) {
        String res="";
        int count=0;
        for(char a:s.toCharArray()){
            if(a=='('){
                if(count>0){
                    res+=a;
                }
                count++;
            }
            else{
                count--;
                if(count>0){
                    res+=a;
                }
            }
        }
        return res;
    }
}