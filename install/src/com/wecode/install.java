package com.wecode;

/**
 * @author zhenghang
 * @date 2018/11/7 2:51
 */
public class install {
    public static void main(String[] args) {
        installVSCode();
    }
    public static void installVSCode(){
            final Runtime runtime = Runtime.getRuntime();
            Process process = null;
            try {
                process = runtime.exec("E:\\workspace\\vscode\\VSCodeSetup-x64-1.25.1.exe");
            } catch (final Exception e) {
                System.out.println("Error exec!");
            }
    }
}
