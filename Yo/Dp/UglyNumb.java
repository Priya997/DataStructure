import java.util.*;
class UglyNumb{
  static int ugly(int[] arr, int n){
    int multiply2=0, x=0;
    int multiply3=0, y=0;
    int multiply5=0, z=0;
    arr[0]=1;
    for(int i=1;i<n;i++){
      multiply2=2*arr[x];
      multiply3=3*arr[y];
      multiply5=5*arr[z];
      if(multiply2<multiply3 && multiply2<multiply5){
        arr[i]=multiply2;
        x++;
      }
      else if(multiply3<multiply2 && multiply3<multiply5){
        arr[i]=multiply3;
        y++;
      }
      else if(multiply5<multiply2 && multiply5<multiply3){
        arr[i]=multiply5;
        z++;
      }
      else if(multiply2==multiply3 && multiply3==multiply5)
      {
        arr[i]=multiply2;
        x++;y++;z++;
      }
      else if(multiply2==multiply3){
        arr[i]=multiply2;
        x++;y++;
      }
      else if(multiply3==multiply5){
        arr[i]=multiply3;
        y++;z++;
      }
      else if(multiply2==multiply5){
        arr[i]=multiply2;
        x++;z++;
      }

      // System.out.println(Arrays.toString(arr) +" x= "+x+" y= "+y+" z= "+z);
      // System.out.println("multiply2= "+multiply2+" multiply3= "+multiply3+" multiply5= "+ multiply5);
    }
    return arr[n-1];

  }
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] arr=new int[n];
    System.out.println(ugly(arr, n));

  }
}
