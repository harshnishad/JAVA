import java.util.*;
public class pattern5 {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    int i;
    int j;
    for(i=n;i>=1;i--){
              for(j=1;j<i;j++){
                System.out.print("*");
              }
              System.out.println(" ");
    }

}

}  