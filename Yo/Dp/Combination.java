import java.util.*;
class Combination{
  static int[][] arr;
  public static int comb(int n,int k){

    if (arr[n][k]!=0) {
        return arr[n][k];

    }
    if(k==0)
      arr[n][k]=1;
    else if(n==k)
      arr[n][k]=1;
    else
        arr[n][k]= comb(n-1,k-1)+comb(n-1,k);
    return arr[n][k];
  }
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int k=sc.nextInt();
    arr=new int[n+1][k+1];
    if(k>n){
      System.out.println("Please Enter correct numbers");
    }
    else
    System.out.println(comb(n,k));
  }
}
