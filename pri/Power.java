import java.util.Scanner;

public class Power {
    public static int helper_power(int a,int b){
        int[] arr=new int[b+1];
        if(arr[b]!=0)
        {
            return arr[b];
        }
        if(b==0)
        {
            arr[0]=1;
        }
        else if(b==1)
        {
            arr[1]=a;
        }
        else{
            if(b%2==0)
            {
                arr[b]=helper_power(a,b/2)*helper_power(a,b/2);
            }
            else{
                arr[b]=a*helper_power(a,(b-1)/2)*helper_power(a,(b-1)/2);
            }
        }

        return arr[b];

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(helper_power(a,b));



    }
}
