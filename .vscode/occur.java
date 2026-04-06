import java.util.Scanner;

public class occur {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0;

        while(n>0){
            int rem=n%10;
            a=a*10+rem;
            n=n/10;
        }
        System.out.println(a);
    }
}
