class Solution {
    public int maxDepth(String s) {
        int count=0;
        
        int res=0;
        for(char a: s.toCharArray()){
            if(a=='('){
                count++;
               res=Math.max(res,count);
            }
            else if(a==')'){  
                count--;
            }
            
        }
        return res;
    }
}