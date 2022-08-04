import java.util.*;
public class question_2 {
    public static int fun_oddsum(int a){
        int sum=0;
        int i;
        for(i=0;i<=a;i++){
            if(i%2!=0){
                sum=sum+i;
            }
        }
        return sum;
    }
    public static void main(String args[]){
    Scanner sc =new Scanner(System.in);
    int a=sc.nextInt();
    int oddsum=fun_oddsum(a);
    System.out.println(oddsum);
    }
}