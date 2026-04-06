import java.util.*;
public class bsv{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no. of ele:");
        int n=sc.nextInt();
        int[] a=new int[n];
        boolean found=false;
        System.err.println("Enter array ele: ");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.err.println("Enter target ele:");
        int tar=sc.nextInt();
        int low=0;
        int high=n-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(a[mid]==tar){
                System.out.println(tar+"found");
                 found=true;
            break;
            }      
        
        else if(tar<a[mid]){
            high=mid-1;}
        else{
            low=mid+1;
        }
    }
        if(!found){
            for (int i = 0; i < n; i++) {
                if(a[i]>tar){
                    System.out.println(a[i-1]);
                    break;
                }
                else{
                    System.out.println(a[high]);

                    
                break;
                }

            }
        }

    }
}