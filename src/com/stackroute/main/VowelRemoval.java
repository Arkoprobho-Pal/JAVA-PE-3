package com.stackroute.main;

import java.util.Scanner;

public class VowelRemoval {
    public void StringVowelErase(){
        Scanner input=new Scanner(System.in);
        int arraySize;
        System.out.println("Enter Number of Places you want to enter :");
        arraySize=input.nextInt();
        input.nextLine();
        String[] placeArray=new String[arraySize];

        System.out.println("Enter the places:");
        for(int i=0;i<arraySize;i++){
            placeArray[i]=input.nextLine();
            placeArray[i]=placeArray[i].replaceAll("[aeiou]","");
        }

        for(int i=0;i<arraySize;i++){
            System.out.println("Place Name without Vowels: "+i+" "+placeArray[i]);
        }
    }

    public static void main(String[] args) {
        VowelRemoval vowelRemoval=new VowelRemoval();
        vowelRemoval.StringVowelErase();
    }
}
