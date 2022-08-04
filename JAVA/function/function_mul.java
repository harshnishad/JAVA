import java.util.*;
public class function_mul {
    public static int function_mul(int a,int b){
        int mul =a*b;
        return mul;
    }
    public static void main(String args[]){
    Scanner sc =new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int mul= function_mul(a, b);
    System.out.println(mul);
    }
}