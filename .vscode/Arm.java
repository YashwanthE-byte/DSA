import java.util.Scanner;

public class Arm {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        while(n>0){
            int rem=n%10;
            sum=sum+rem**3;
            n=n/10;

        }
        System.out.println(sum);
    }
}
