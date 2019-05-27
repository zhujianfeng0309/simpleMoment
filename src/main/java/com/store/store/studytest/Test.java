package com.store.store.studytest;

/**
 * Created by zhujianfeng on 2019/1/27.
 */
public class Test {
    private static int a = 111;

    public static void method (int a){
        a = 777;
    }
    public static void method(){
        a = 888;
    }
    public static void main (String [] args){
       //method(a);
        String name = "woshi ";
       method();
        System.out.println(a);
    }


}
