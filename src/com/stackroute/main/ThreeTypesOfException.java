package com.stackroute.main;

public class ThreeTypesOfException {
    public static void main(String[] args) {
        try {
            int[] arr=new int[-1];
        }catch (NegativeArraySizeException e){
            System.out.println(e);
        }
        try {
            int[] arr=new int[4];
            int k=arr[4];
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        try {
            int[] arr=null;
           int k=arr[0];
        }catch (NullPointerException e){
            System.out.println(e);
        }
    }
}
