import java.util.Scanner;

class Catalan {
    public static int helper_catalan(int n)
    {
        int[] arr=new int[n+1];

        if(arr[n]!=0){
            return arr[n];
        }
        if(n==0||n==1)
        {
            arr[n]=1;
        }
        else
        {
            int result=0;
            for(int i=0;i<n;i++)
            {
                result+=helper_catalan(i)*helper_catalan(n-i-1);

            }
            arr[n]=result;

        }

        return arr[n];
    }
    public static void main(String args[])
    {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(helper_catalan(n));
    }
}
