package com.webpackge.controller;

/**
 * Created by ZHUJIANFENG on 2019/11/22.
 */
public class test {

    public static void main(String[] args) {
       /* Map map = new HashMap<>();
        Thread t1 = new Thread(){
            public void run(){
                for( int i =0;i<25;i++){
                    map.put(String.valueOf(i), String.valueOf(i));
                }

            }
        };

        Thread t2 =new Thread(){
            public void run(){
                for( int i =25;i<50;i++){
                    map.put(String.valueOf(i), String.valueOf(i));
                }

            }
        };
   t1.start();
        t2.start();
        try {
            Thread.currentThread().sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for(int l=0;l<50;l++){
             //如果key和value不同，说明在两个线程put的过程中出现异常。
             if(!String.valueOf(l).equals(map.get(String.valueOf(l)))){
                 System.err.println(String.valueOf(l)+":"+map.get(String.valueOf(l)));
                 }
             }*/


        Integer i;
        int a = 3;
        i = a;
        System.out.println(i);
    }


}
