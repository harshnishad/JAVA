import java.util.*;
public class pattern6 {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    int i;
    int j;
    for(i=1;i<=n;i++);{
      for(j=1;j<=n-i;j++){
      System.out.println(" ");
     }
      for(j=1;j<=1;j++){
        System.out.println("*");
      }
    }
      System.out.println();
 }
}  