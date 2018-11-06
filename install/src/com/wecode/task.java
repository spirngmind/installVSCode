package com.wecode;

//import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author zhenghang
 * @date 2018/11/7 2:13
 */
public class task {
    public static void main(String[] args) {
//        if(!isOpenExec("VSCodeSetup-x64-1.25.1.ex")){
//            System.out.println("end");
//        }
//        monitor();
        if(installStatus()){
            System.out.println("installed");
        }else{
            System.out.println("not installed");
        }
//        installStatus();
    }

    public static boolean installStatus(){
        monitor();
        if(registerbak.getVSCodeInstallStatus().equals("not installed")){
            return false;
        }
        return true;

    }

    public static void monitor(){
        boolean flag=true;
        while(flag){
            flag=isOpenExec("VSCodeSetup-x64-1.25.1.ex");
//            System.out.println("==");
        }
//        System.out.println("exit");
    }


    public static List Tasklist()
    {
        List list=new ArrayList();
        try
        {
            Process process = Runtime.getRuntime().exec("tasklist");
            Scanner in=new Scanner(process.getInputStream());
            while(in.hasNextLine()){
                String p=in.nextLine();
//                System.out.println(p);
                list.add(p);
            }
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
        return list;
    }

    public static boolean isOpenExec(String taskName){
        Process process=null;
        try
        {
            process = Runtime.getRuntime().exec("tasklist");

        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }

        Scanner in=new Scanner(process.getInputStream());
        while(in.hasNextLine()){
            String p=in.nextLine();
            String curtaskName=p.split(" ")[0];
            if(taskName.equals(curtaskName)){
//                System.out.println(curtaskName);
                return true;
            }
        }

        return false;
    }
}
