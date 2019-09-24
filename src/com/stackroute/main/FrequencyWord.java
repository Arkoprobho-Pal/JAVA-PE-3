package com.stackroute.main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class FrequencyWord {

    public void FindWordFrequency() throws IOException {
        String pathFile="/home/cgi/Stackroute/Java_PE-3/src/com/stackroute/main/test.txt";

        String data = "";
        File file=new  File(pathFile);
        try {
            FileReader fileReader=new FileReader(file);
            int i;
            while ((i=fileReader.read())!=-1){
                    data=data+(char)i;
            }
            data=data.replaceAll("[,.;:]"," ");
            //split data string
            //System.out.println(data);
            String[] dataArray=data.trim().split("\\s+");

            createHashMap(dataArray);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
    void createHashMap(String[] stringArr){
        //--creating Empty hash map
        System.out.println("stringArr[0] : "+stringArr[0]);

        HashMap<String,Integer> hashMap=new HashMap<String, Integer>();
        for (int i=0;i<stringArr.length;i++){
            Integer count=hashMap.get(stringArr[i]);
            if(hashMap.get(stringArr[i])==null){
                hashMap.put(stringArr[i],1);
            }
            else{
                hashMap.put(stringArr[i],++count);
            }
        }
        System.out.println(hashMap);
    }

    public static void main(String[] args) throws IOException {
        FrequencyWord  frequencyWord=new FrequencyWord();
        frequencyWord.FindWordFrequency();
    }
}
