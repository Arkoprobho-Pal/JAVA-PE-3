package com.stackroute.main;

import java.util.Scanner;

public class AddMatrix {
    public void MatrixAddition(){
        Scanner input=new Scanner(System.in);
        int row,column;
        System.out.println("Input number of rows of matrix:");
        row=input.nextInt();
        System.out.println("Input number of columns of matrix:");
        column=input.nextInt();
        int[][] Matrix1=new int[row][column];
        int[][] Matrix2=new int[row][column];
        System.out.println("Input elements of first matrix: 1");
        for(int i=0;i<row;i++){
            for (int j=0;j<column;j++){
                Matrix1[i][j]=input.nextInt();
            }
        }
        System.out.println("Input elements of second matrix: 1");
        for(int i=0;i<row;i++){
            for (int j=0;j<column;j++){
                Matrix2[i][j]=input.nextInt();
            }
        }
        //---------------------end of matrix insertion-
        int[][] ResultMatrix=new int[row][column];
        for(int i=0;i<row;i++){
            for (int j=0;j<column;j++){
                 ResultMatrix[i][j]=Matrix1[i][j]+Matrix2[i][j];
            }
        }
        //--------------end of addition operation
        System.out.println("Sum of the matrices:-");
        for(int i=0;i<row;i++){
            for (int j=0;j<column;j++){
                System.out.print(ResultMatrix[i][j]+"  ");
            }
            System.out.print("\n");
        }
    }
    public static void main(String[] args){
        AddMatrix addMatrix=new AddMatrix();
        addMatrix.MatrixAddition();
    }
}
