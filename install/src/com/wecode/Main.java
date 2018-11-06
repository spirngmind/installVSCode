package com.wecode;

import java.io.File;

/**
 * @author zhenghang
 * @date 2018/11/7 0:46
 */
public class Main {
    public static void main(String[] args) {
        if(registerbak.getVSCodeInstallStatus().equals("not installed")){
            install.installVSCode();
        }

        File file=null;
        if(task.installStatus()){
            System.out.println("installed");
            file = new File("E:\\workspace\\vscode\\installVSCode\\installed.txt");

        }else{
            System.out.println("not installed");
            file = new File("E:\\workspace\\vscode\\installVSCode\\uninstalled.txt");
        }

        try {
            file.createNewFile();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
