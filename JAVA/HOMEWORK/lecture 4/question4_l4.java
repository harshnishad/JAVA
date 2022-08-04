import java.util.*;
public class question4_l4 {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n= sc.nextInt();
    int i;
    int count=0;
    for(i=1;i<=n;i++){
        if(n%i==0){
            count++;
        }

    }
    System.out.println(count);
    if(count==2){
        System.out.println("prime");
    }
    else{
        System.out.println("not prime");
    }
  }
}  
