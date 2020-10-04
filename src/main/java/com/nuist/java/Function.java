package com.nuist.java;

import org.python.core.*;
import org.python.util.PythonInterpreter;

public class Function {
    public static void main(String[] args) {
        PythonInterpreter interpreter = new PythonInterpreter();
        interpreter.execfile("src/main/java/com/nuist/python/add.py");

        // 第一个参数为期望获得的函数（变量）的名字，第二个参数为期望返回的对象类型
        PyFunction pyFunction = interpreter.get("add", PyFunction.class);
        int a = 5, b = 10;
        //调用函数，如果函数需要参数，在Java中必须先将参数转化为对应的“Python类型”
        PyObject pyObject = pyFunction.__call__(new PyInteger(a), new PyInteger(b));
        System.out.println("the answer is:" + pyObject);
    }

}