import java.util.*;
public class question_4 {
    public static double func_curcumference(Double a){
        return 3.14 * 2 * a;
        
    }
    public static void main(String args[]){
    Scanner sc =new Scanner(System.in);
    double a=sc.nextDouble();
    double cir= func_curcumference(a);
    System.out.println(cir);
    }
}