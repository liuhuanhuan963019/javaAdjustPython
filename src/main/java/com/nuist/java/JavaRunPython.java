package com.nuist.java;

import org.python.util.PythonInterpreter;

public class JavaRunPython {
    public static void main(String[] args) {
        PythonInterpreter interpreter = new PythonInterpreter();
        //1。直接使用该方法在exec中输入相关字符串
//        interpreter.exec("a = 'hello world'");
//        interpreter.exec("print(a)");
        //2。直接调用python文件
        //文件所存放的位置
        interpreter.execfile("src/main/java/com/nuist/python/javaPythonFile.py");
    }
}
