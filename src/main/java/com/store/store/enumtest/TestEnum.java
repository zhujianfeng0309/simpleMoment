package com.store.store.enumtest;

/**
 * Created by Administrator on 2019/1/27.
 */
public enum TestEnum {
    HIGH(0,"高"),
    MEDIUM(2,"中"),
    LOW(3,"低");
    private int seq;
    private String desc;

    public int getSeq() {
        return seq;
    }

    public void setSeq(int seq) {
        this.seq = seq;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    private  TestEnum(int seq, String desc){
        desc = this.desc;
        this.seq =  seq;
    }

    public static void main (String [] args){

    }

}
