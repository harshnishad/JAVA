import java.util.*;
public class search_2d {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
     int row=sc.nextInt();
     int colm=sc.nextInt();
     
     int[][] marks =new int[row][colm];
     for(int i=0;i<row;i++){
            for(int j=0;j<colm;j++){
                marks[i][j]=sc.nextInt();
            }
     }
     System.out.println("enter a no to get location :");
     int number=sc.nextInt();
     for(int i=0;i<row;i++){
            for(int j=0;j<colm;j++){
               if(number==marks[i][j]){
                System.out.println("x found at : ("+i+","+j+")" );
               }
            }
            System.out.println();
     }

    
    }
}