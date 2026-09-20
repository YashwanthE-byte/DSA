class Solution {
    public int totalNumbers(int[] digits) {
        Set<Integer> a=new HashSet<>();
        for(int i=0;i<digits.length;i++){
            if(digits[i]==0){
                continue;
            }
            for(int j=0;j<digits.length;j++){
                if(i==j){
                    continue;
                }
                for(int k=0;k<digits.length;k++){
                    if(k==i||k==j){
                        continue;
                    }
                    if((digits[k]%2) !=0){
                        continue;
                    }
                    int count=digits[i]*100+digits[j]*10+digits[k];
                    a.add(count);
                }
            }
        }
        return a.size();
    }
}