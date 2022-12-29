package com.zjyedu.annotation_;

public class HomeWork04 {
    public static void main(String[] args) {
        cellphone cellphone = new cellphone();
        cellphone.testWork(new computer() {
            @Override
            public double work(double n1, double n2) {
                return n1 + n2;
            }
        },10,8);


    }
}
interface computer{
    public double work(double n1,double n2);
}
class cellphone {
    public void testWork(computer computer,double n1,double n2){
        double result = computer.work(n1,n2);
        System.out.println(result);

    }



}