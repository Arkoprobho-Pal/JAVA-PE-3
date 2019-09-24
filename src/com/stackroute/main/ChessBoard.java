package com.stackroute.main;

import java.util.Scanner;

public class ChessBoard {
    public void MyChessBoard(){
        Scanner input=new Scanner(System.in);
        int Dimension;
        System.out.println("Enter the dimension of Chessboard:");
        Dimension=input.nextInt();
        String White="WW",Black="BB";
        String[][] board= new String[Dimension][Dimension];
        for(int i=0;i<Dimension;i++){
            for(int j=0;j<Dimension;j++){
                if(i%2==0 && j%2==0)
                {
                    System.out.print(White+"|");
                }
                if(i%2==0 && j%2==1)
                {
                    System.out.print(Black+"|");
                }

                if(i%2==1 && j%2==0)
                {
                    System.out.print(Black+"|");
                }
                if(i%2==1 && j%2==1)
                {
                    System.out.print(White+"|");
                }
            }
            System.out.println();
        }


    }

    public static void main(String[] args) {
        ChessBoard chessBoard=new ChessBoard();
        chessBoard.MyChessBoard();
    }
}
