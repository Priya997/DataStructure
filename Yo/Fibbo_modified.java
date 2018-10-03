import java.util.*;
class Fibbo_modified{
  public static int fibbo(int n){
    int[] arr=new int[n+1];
    if (arr[n]!=0) {
        return arr[n];

    }
    if(n==0)
      arr[n]=1;
    else if(n==1)
      arr[n]=1;
    else
        arr[n]= fibbo(n-1)+fibbo(n-2);
    return arr[n];
  }
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    System.out.println(fibbo(n));
  }
}
