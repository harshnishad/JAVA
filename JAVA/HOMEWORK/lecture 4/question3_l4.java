import java.util.*;
public class question3_l4 {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    if(n==1){
      int c=sc.nextInt();
      do{
        
        if(c>=90){
          System.out.println("THIS IS GOOD");
        }
        else if(90>=c||c>=60){
          System.out.println("THIS IS ALSO GOOD");
        }
        else{
          System.out.println("THIS IS GOOD AS WELL");
        }
      }
    while(n==0);
  }
}
}