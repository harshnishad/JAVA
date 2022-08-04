import java.util.*;
public class function_fact {
    public static int function_fact(int a){
        int fact=1;
        int i;
        for(i=a;i>0;i--){
            fact=fact*i;
        }
        return fact;
    }
    public static void main(String args[]){
    Scanner sc =new Scanner(System.in);
    int a=sc.nextInt();
    int factorial = function_fact(a);
    System.out.println(factorial);
    }
}