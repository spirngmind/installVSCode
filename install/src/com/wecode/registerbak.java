package com.wecode;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;

/**
 * @author zhenghang
 * @date 2018/11/7 1:44
 */
public class registerbak {
    public static void main(String[] args) throws Exception {
        System.out.println(getVSCodeInstallStatus());
    }

//    public static boolean monitorInstall(){
//        while();
//    }
    public static String getVSCodeInstallStatus(){
        String regQuery="reg query HKEY_LOCAL_MACHINE\\SOFTWARE\\Classes\\Applications\\Code.exe\\shell\\open\\command";
        String res="not installed";
        try {
            res=getInstallInfo(regQuery);
        }catch (Exception e){
            e.printStackTrace();
        }
        return  res;
    }


    public static String getInstallInfo(String regQuery) throws  Exception {
        Process ps=null;
        ps=Runtime.getRuntime().exec(regQuery);
        ps.getOutputStream().close();
        InputStreamReader i=new InputStreamReader(ps.getInputStream());
        String line;
        BufferedReader ir=new BufferedReader(i);
        while((line=ir.readLine())!=null){
            if(line.indexOf("\"")!=-1){
                int startPos=line.indexOf("\"")+1;
                int endPos=line.lastIndexOf("exe")+3;
                String filename=line.substring(startPos,endPos);
//                System.out.println(filename);
                File file=new File(filename);
                if(file.exists()){
//                    System.out.println("vscode installed");
                    return filename;
                }else{
//                    System.out.println("vscode not installed");
                    return "not installed";
                }
            }
        }
        return "not installed";
    }
}
