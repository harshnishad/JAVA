import java.util.*;
public class question_1 {
    public static int function_avg(int a,int b,int c){
        int d=a+b+c;
        int avg=d/3;
        return avg;
    }
    public static void main(String args[]){
    Scanner sc =new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt();
    int avg= function_avg(a,b,c);
    System.out.println(avg);
    }
}