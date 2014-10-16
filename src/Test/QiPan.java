package Test;

public class QiPan {
static int MAX_SIZE=16;
static int board[][]=new int[MAX_SIZE][MAX_SIZE];
    static int tile=0;
public void chessboard(int tr,int tc,int dr,int dc,int size){
   if(size==1)
    return;
   
   int t=tile++,s=size/2;
   //覆盖左上角
   if(dr<tr+s&&dc<tc+s)
    chessboard(tr,tc,dr,dc,s);
   else{
    board[tr+s-1][tc+s-1]=t;
    chessboard(tr,tc,tr+s-1,tc+s-1,s);
   }
   //覆盖右上角
   if(dr<tr+s&&dc>=tc+s)
    chessboard(tr,tc+s,dr,dc,s);
   else{
    board[tr+s-1][tc+s]=t;
    chessboard(tr,tc+s,tr+s-1,tc+s,s);
   }
   //覆盖左下角
   if(dr>=tr+s&&dc<tc+s)
    chessboard(tr+s,tc,dr,dc,s);
   else{
    board[tr+s][tc+s-1]=t;
    chessboard(tr+s,tc,tr+s,tc+s-1,s);
   }
   //覆盖右下角
   if(dr>=tr+s&&dc>=tc+s)
    chessboard(tr+s,tc+s,dr,dc,s);
   else{
    board[tr+s][tc+s]=t;
    chessboard(tr+s,tc+s,tr+s,tc+s,s );
   }
   }


public static void main(String[] args) {
int i,j;

QiPan p1=new QiPan();
p1.chessboard(0,0,0,1,4);
for(i=0;i<4;i++){
   for(j=0;j<4;j++)
    System.out.print(board[i][j]+" ");
   System.out.print("\n");
}
}
}