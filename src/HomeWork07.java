public class HomeWork07 {
    public static void main(String[] args) {
        Car car = new Car(60);
        car.getAir().flow();
        


    }
}
class Car{
    private double temper;

    public Car(double temper) {
        this.temper = temper;
    }

    class Air{
        public void flow(){
            if(temper > 40){
                System.out.println("吹冷气");
            }else if(temper < 0){
                System.out.println("吹暖气");

            }else{
                System.out.println("关闭空调");
            }
        }
    }
    public Air getAir(){
        return new Air();
    }

}