package com.zjyedu.annotation_;

public class TestFrock {
    public static void main(String[] args) {
        Frock frock = new Frock();
        System.out.println(frock.getSerialNum());
        System.out.println(Frock.getNextNum());
        System.out.println(Frock.getNextNum());


    }
}
class Frock{
    private static int currentNum = 100000;
    private int serialNum;

    public int getSerialNum() {
        return serialNum;
    }


    public Frock(){
        serialNum = getNextNum();
    }

    public static int getNextNum(){
        currentNum+=100;
        return currentNum;
    }
}