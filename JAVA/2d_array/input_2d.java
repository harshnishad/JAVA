import java.util.*;
public class input_2d {
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
     System.out.println("printing 2_d array below :");
     for(int i=0;i<row;i++){
            for(int j=0;j<colm;j++){
               
               System.out.println(marks[i][j]+" ");
            }
            System.out.println();
     }

    
    }
}