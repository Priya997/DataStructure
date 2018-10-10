import java.util.*;
class Permutation{
  static int[][] arr;
  public static int permute(int n,int k){
    //for (int[] row : arr)
        //System.out.println(Arrays.toString(row));
        // System.out.println("n= "+n+" k= "+k+" value= "+arr[n][k]);
    if (arr[n][k]!=0) {
        return arr[n][k];
    }


    if(k==0)
      arr[n][k]=1;
    else if(k>n)
      arr[n][k]=0;
    else
        arr[n][k]= permute(n-1,k)+k*permute(n-1,k-1);

    // System.out.println("n= "+n+" k= "+k+" value= "+arr[n][k]);
    // System.out.println("");
    // System.out.println("");

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
    System.out.println(permute(n,k));
  }
}
