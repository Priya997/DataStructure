import java.util.Scanner;

public class Power {
    public static int helper_power(int a,int b){
        int c=1;
        for (int i=0;i<b;i++)
        {
            c=c*a;
        }
        return c;

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(helper_power(a,b));



    }
}
