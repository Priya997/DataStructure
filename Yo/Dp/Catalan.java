import java.util.*;
class Catalan{
  public static int catalanNumb(int n){
    int[] arr=new int[n+1];

    if (arr[n]!=0) {
        return arr[n];
    }
    if(n==0)
      arr[n]=1;
    else if(n==1)
      arr[n]=1;
    else{
      int sum=0;
      for(int i=0;i<n;i++){
        sum+=catalanNumb(i)*catalanNumb(n-i-1);
      }
        arr[n]=sum;
    }
    return arr[n];
  }
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    System.out.println(catalanNumb(n));
  }
}
