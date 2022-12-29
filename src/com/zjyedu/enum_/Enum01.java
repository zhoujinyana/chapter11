package com.zjyedu.enum_;

public class Enum01 {
    public static void main(String[] args) {
        System.out.println(season.SUMMER);

    }

}
enum season{

    SPRING("春天","温暖"),SUMMER("夏天","炎热");//放在第一行
    private String name;
    private String desc;

    //定义了四个对象
//    public static final season SPRING = new season("春天","温暖");
//    public static final season SUMMER = new season("夏天","温暖");
//    public static final season AUTUMN = new season("秋天","温暖");
//    public static final season WINTER = new season("冬天","温暖");


    private season(String name, String desc) {//私有化，防止被new
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }



    public String getDesc() {
        return desc;
    }

    @Override
    public String toString() {
        return "season{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}