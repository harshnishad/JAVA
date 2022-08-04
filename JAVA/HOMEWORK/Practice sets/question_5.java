import java.util.*;
public class question_5 {
    public static boolean func_age(int a){
        if(a>=18){
        return true;
        } else{
            return false;
        }

    }
    public static void main(String args[]){
    Scanner sc =new Scanner(System.in);
    int a=sc.nextInt();
    System.out.println(func_age(a));
    }
}