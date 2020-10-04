package com.nuist;

import org.python.util.PythonInterpreter;

public class JavaRunPython {
    public static void main(String[] args) {
        PythonInterpreter interpreter = new PythonInterpreter();
        //直接使用该方法在exec中输入相关字符串
        interpreter.exec("a = 'hello world'");
        interpreter.exec("print(a)");
    }
}
