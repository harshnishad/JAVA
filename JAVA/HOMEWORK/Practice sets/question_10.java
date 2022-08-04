import java.util.*;
public class question_10{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int a=0,b=1;
    int limit=sc.nextInt();
    int i;
    for(i=2;i<=limit;i++){
      System.out.println(b+"");
      int temp=b;
      b=a+b;
      a=temp;
    }
    System.out.println();
  }
  
}  