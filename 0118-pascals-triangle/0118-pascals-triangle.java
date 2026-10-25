class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res=new ArrayList<>();
        for(int i=0;i<numRows;i++){
            ArrayList<Integer> row=new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0||j==i){
                    row.add(1);
                }
                else{
                     List<Integer> pres=res.get(i-1);
                     row.add(pres.get(j-1)+pres.get(j));
                }
            }
            res.add(row);
        }
        return res;
    }
}