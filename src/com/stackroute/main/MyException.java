package com.stackroute.main;


public class MyException extends Exception{
        public MyException(String msg){
            super(msg);
        }
        public static void main(String[] args) {
            try{
                throw new MyException("This is my Exception");
            }catch (MyException e){
                System.out.println(e.getMessage());
            }
            finally {
                System.out.println("This is the finally");
            }
        }
}


