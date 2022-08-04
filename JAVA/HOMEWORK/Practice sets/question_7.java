import java.util.*;
public class question_7{
    public static void main(String args[]){
       int positive =0,negative=0,zero=0;
       System.out.println("print 1 to continue & 0 to stop");
        Scanner sc =new Scanner(System.in);
        int input=sc.nextInt();
        while(input==1){
            System.out.println("enter your number :");
            int number =sc.nextInt();
            if(number>0){
                positive++;
            }else if(number<0){
                negative++;
            }else{
                zero++;
            }
            System.out.println("press 1 to continue & 0 to stop");
            input=sc.nextInt();
        }
        System.out.println("positive"+positive);
        System.out.println("negative"+negative);
        System.out.println("zero"+zero);

        }
        
    }