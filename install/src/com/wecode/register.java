package com.wecode;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;

/**
 * @author zhenghang
 * @date 2018/11/7 1:44
 */
public class register {
    /**
    public static void main(String[] args) throws Exception {
        String regQuery="reg query HKEY_LOCAL_MACHINE\\SOFTWARE\\Classes\\Applications\\Code.exe\\shell\\open\\command";
        getPisition(regQuery);
    }

    public static void getPisition(String regQuery) throws  Exception {
        task ps=null;
        ps=Runtime.getRuntime().exec(regQuery);
        ps.getOutputStream().close();
        InputStreamReader i=new InputStreamReader(ps.getInputStream());
        String line;
        BufferedReader ir=new BufferedReader(i);
//        System.out.println("ok1");
        while((line=ir.readLine())!=null){
//            System.out.println(line);
//            if(line.contains("(默认)")){
//                System.out.println("installed");
//                System.out.println(line);
//            }
            if(line.indexOf("\"")!=-1){
//                System.out.println(line);
                int startPos=line.indexOf("\"")+1;
                int endPos=line.lastIndexOf("exe")+3;
                String filename=line.substring(startPos,endPos);
                System.out.println(filename);
                File file=new File(filename);
                if(file.exists()){
                    System.out.println("vscode installed");
                }else{
                    System.out.println("vscode not installed");
                }
            }


        }
    }
     **/
}
