import java.util.*;
public class question_3 {
    public static int fun_greatest(int a,int b){
        if(a>b)
        return a;
        else
        return b; 
    }
    public static void main(String args[]){
    Scanner sc =new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int great= fun_greatest(a, b);
    System.out.println(great);
    }
}