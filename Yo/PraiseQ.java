import java.util.Scanner;
class PraiseQ{
  public static int myMethod(int p, int q){
    int[] arr=new int[q+1];
    if (arr[n]!=0) {
        return arr[n];

    }   
    if(q==0)
      arr[0]=1;
    else if(q==1)
      arr[1]=p;
    else if(q%2==0){
      arr[q]=myMethod(p,q/2)*myMethod(p,q/2);
      //return myMethod(p,q/2)*myMethod(p,q/2);
    }
    else{
      arr[q]=p*myMethod(p,(q-1)/2)*myMethod(p,(q-1)/2);
    }
    return arr[q];
  }
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int p=sc.nextInt();
    int q=sc.nextInt();
    System.out.println(myMethod(p,q));

  }
}
