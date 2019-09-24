package com.stackroute.main;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class FileList {
    public void FindFile(){
        String filepath = "/home/cgi/Stackroute/Java_PE-3/src/com/stackroute/main";
        File file=new File(filepath);
        File[] files=file.listFiles();
        for(File f:files){
            if(f.getName().endsWith(".java")){
                System.out.println(f.getName());
            }

        }
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the file name with extension:");
        String fileName=input.nextLine();
        String TargetFilePath=file.getPath()+"/"+fileName;
        DisplayFileContent(TargetFilePath);

    }
    public void DisplayFileContent(String targetpath){
        Path path=Paths.get(targetpath);
        try {
            byte[] data= Files.readAllBytes(path);
            for(byte b:data){
            System.out.print((char)b);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        FileList fileList=new FileList();
        fileList.FindFile();
    }
}
