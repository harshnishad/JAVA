import java.util.*;
public class question_8 {
    public static int func_pow(int x, int n){
        int sum=1;
        int i;
        for(i=1;i<=n;i++){
            sum=sum*x;
        }
        return sum; 
    }
    public static void main(String args[]){
    Scanner sc =new Scanner(System.in);
    int x=sc.nextInt();
    int n=sc.nextInt();
    int pow=func_pow(x, n);
    System.out.println(pow);
    }
}