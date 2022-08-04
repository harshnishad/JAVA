public class syntax{
    public static void main(String args[]){
    int[][] marks=new int[3][3];
    marks[0][0]=90;
    marks[0][1]=92;
    marks[0][2]=91;
    marks[1][1]=98;
    marks[1][2]=97;
    marks[2][1]=96;
    marks[2][2]=95;

    System.out.println(marks[0][0]);
    for(int i=0;i<3;i++){
             for(int j=0;j<3;j++){
                System.out.println(marks[i][j]);
             }
    }
    }

}