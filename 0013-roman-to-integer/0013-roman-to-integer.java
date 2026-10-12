class Solution {
    public int romanToInt(String s) {
        int ans=0;
        HashMap<String,Integer> map=new HashMap<>(Map.of("I",1,"V",5,"X",10,"L",50,"C",100,"D",500,"M",1000));
        for(int i=0; i < s.length(); i++){
            int curr=map.get(String.valueOf(s.charAt(i)));
            if((i+1)<s.length()){
                int next=map.get(String.valueOf(s.charAt(i+1)));

            if(curr<next){
                ans=ans-curr;
            }
            else{
                ans=ans+curr;
            }
            }
            else{
                ans+=curr;
            }
    
}
 return ans;
    }}