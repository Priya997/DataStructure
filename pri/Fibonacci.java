import java.util.Scanner;

public class Fibonacci {

    public static int Helper_fibo(int n){
        int a=0;
        int b=1;
        int c[] = new int[n+2];
        c[0]=a;
        c[1]=b;
        for (int i=2;i<=n;i++)
        {
            c[i]=c[i-1]+c[i-2];
        }
        return c[n];
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        System.out.println(Helper_fibo(n));

    }
}
