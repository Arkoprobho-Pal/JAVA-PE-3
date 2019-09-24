package com.stackroute.main;

import java.awt.desktop.SystemSleepEvent;
import java.util.Scanner;

public class StudentMarks {

    public void setStudentNum()
    {
        Scanner input = new Scanner(System.in);
        int numOfStudent;
        System.out.println("Enter the Student number: ");
        numOfStudent=input.nextInt();
        int[] NumArray=new int[numOfStudent];
        System.out.println("insert their respective  numbers (Range 0 to 100)");
        for (int i=0;i<numOfStudent;i++)
        {
            NumArray[i]=input.nextInt();
            try{

                if(NumArray[i]>100 || NumArray[i]<0){
                    throw new Exception("Range Error ! Number should be between 0 and 100");
                }
            }catch (Exception e){
                System.out.println(e);
                System.out.println("Be a nice User and Try Again ");
                System.exit(0);
            }
        }
        for (int i=0;i<numOfStudent;i++)
        {

                System.out.println("Student NO. "+(i+1)+" got the Number :"+NumArray[i]);

        }
    }
    public static void main(String[] args){
        StudentMarks studentMarks=new StudentMarks();
        studentMarks.setStudentNum();
    }
}

