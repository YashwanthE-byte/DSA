import java.util.*;
class rich {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int m,n;
    System.out.println("Enter no. row and col");
    m=sc.nextInt();
    n=sc.nextInt();
    int[][] accounts=new int[m][n];
    int sum=0;
    int res=0;
    System.out.println("Enter elements");
    for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            accounts[i][j]=sc.nextInt();
        }
    }
    for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            sum+=accounts[i][j];
        }
    
     res=Math.max(res,sum);
     sum=0;
    }
    
    System.out.println(res);
  } 
}
