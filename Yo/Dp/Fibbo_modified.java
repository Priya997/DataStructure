import java.util.*;
class Fibbo_modified{
  public static int fibbo(int[] arr, int n){

    if (arr[n]!=0) {
        return arr[n];

    }
    if(n==0)
      arr[n]=1;
    else if(n==1)
      arr[n]=1;
    else
        arr[n]= fibbo(arr, n-1)+fibbo(arr, n-2);
    return arr[n];
  }
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] arr=new int[n+1];
    System.out.println(fibbo(arr,n));
  }
}
