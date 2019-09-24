package com.stackroute.main;

import java.util.Scanner;

import static java.lang.StrictMath.abs;

public class FindConsecutive {
    public void CheckSeries(){
        Scanner input=new Scanner(System.in);
        String StringInput;
        System.out.println("Enter the digits separating by Comma:");
        StringInput=input.nextLine();
        String[] StringArray=StringInput.split(",");
        int count=0;
        for(String a:StringArray){
            count++;
        }
        //System.out.println(count);
        int[] digitArray=new int[count];
        for (int i=0;i<count;i++)
        {
            digitArray[i]=Integer.parseInt(StringArray[i]);
        }
        String decision ="are consecutive numbers";
        int check1=0,check2=0;
        for (int i=0;i<count-1;i++){
            if(Math.abs(digitArray[i]-digitArray[i+1])!=1){
                decision="non consecutive numbers";
                //System.out.println("hi im here1");
                break;
            }
            if(count==7 && digitArray[i]-digitArray[i+1]==-1){
                check1++;
               // System.out.println("hi im here2");
            }
            else if(digitArray[i]-digitArray[i+1]==1 && count==7){
                        check2++;
               // System.out.println("hi im here3");
            }
        }
        if (check1>0 && check2>0){
            decision="non consecutive numbers";
          //  System.out.println("hi im here4");
        }
        for (int i=0;i<count;i++){
            System.out.print(digitArray[i]+",");
        }
        System.out.print(" "+decision);

        }

    public static void main(String[] args) {

        FindConsecutive findConsecutive=new FindConsecutive();
        findConsecutive.CheckSeries();
    }
}
