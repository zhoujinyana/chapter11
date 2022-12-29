package com.zjyedu.enum_;

public class EnumExercise {
    public static void main(String[] args) {
        System.out.println("===所有星期的信息如下===");
        Week[] values = Week.values();
        for(Week week : values){//values每次取一个数据给week
            System.out.println(week);
        }

    }
}
enum Week{
    MONDAY("星期一"),TUESDAY("星期二"),WEDNESDAY("星期三"),THURSDAY("星期四"),FRIDAY("星期五")
    ,SATURDAY("星期六"),SUNDAY("星期日");

    private String desc;


    Week(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }

    @Override
    public String toString() {
        return desc;
    }
}