package com.zjyedu.annotation_;

public class Override_ {
    public static void main(String[] args) {

    }
}
class father{
    public void say(){

    }
}
class son extends father{
    //如果你写了@Overtyide注解，编译器就会去检查该方法是否真的重写了父类的
    //方法，如果的确重写了，则编译通过，如果没有构成重写，则编译错误

    @Override
    public void say() {
        super.say();
    }
}
