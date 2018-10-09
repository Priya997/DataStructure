import java.util.*;
class Bell_Number{
  static int[][] s;
  public static int bell(int[] arr, int n){
    if(arr[n]!=0){
      return arr[n];
    }
  if(n==0)
      arr[n]=1;
    else if(n==1)
      arr[n]=1;
    else{
      int sum=0;
        for(int i=n;i>0;i--){
          sum=sum+sCompute(n,i);
        }
        arr[n]=sum;
      }
    return arr[n];
  }
  public static int sCompute(int n, int k){
    if(s[n][k]!=0){
      return s[n][k];
    }
    if (n == 0 || k == 0 || k > n)
          s[n][k]=0;
    else if (k == 1 || k == n)
      s[n][k]=1;
    else
    s[n][k]=k*sCompute(n-1,k)+sCompute(n-1, k-1);

    return s[n][k];

  }
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int k=n;
    int[] arr=new int[n+1];
        s=new int[n+1][k+1];
    System.out.println(bell(arr,n));
  }
}
