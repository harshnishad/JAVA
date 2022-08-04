import java.util.*;
public class pattern3 {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    int i;
    int j;
    for(i=0;i<n;i++){
              for(j=0;j<i;j++){
                System.out.print("*");
              }
              System.out.println(" ");
    }

}

}  