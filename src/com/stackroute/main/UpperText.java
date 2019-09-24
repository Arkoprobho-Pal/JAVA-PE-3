package com.stackroute.main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class UpperText {
    public void ConvertUpper() throws IOException {
        File file=new File("/home/cgi/Stackroute/Java_PE-3/src/com/stackroute/main/test.txt");
        FileReader fileReader=new FileReader(file);
        int i;
        System.out.println("LengthOfFile: "+file.length());
        while((i=fileReader.read())!=-1){

            System.out.print((Character.toUpperCase((char) i)));
        }
        fileReader.close();
    }

    public static void main(String[] args) throws IOException {
        UpperText upperText=new UpperText();
        upperText.ConvertUpper();
    }
}
