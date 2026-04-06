import java.util.*;
class Solution {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] nums=sc.nextInt();
        for(int i=0;i<n;i++){
            nums[]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=i+1;j<n;j++){
            if(nums[i]==nums[j]){
             count++;
            }}
        if(count==1){
            System.out.println();nums[i];
        }
    }
    return -1;
    }
}