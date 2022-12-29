public class HomeWork06 {
    public static void main(String[] args) {
        Person person = new Person("唐僧",new Horse());
        person.common();

    }
}
interface Vehicles{
    public void work();
}
class Horse implements Vehicles{

    @Override
    public void work() {
        System.out.println("一般情况下，使用马儿前进");

    }
}
class Boat implements Vehicles{

    @Override
    public void work() {
        System.out.println("遇到河流，使用船前进");

    }
}
class Factory{
    private static Horse horse = new Horse();//饿汉式
    public static Horse getHorse(){
        return horse;
    }
    public static Boat getBoat(){
        return new Boat();
    }
}
class Person{
    private String name;
    private Vehicles vehicles;

    public Person(String name, Vehicles vehicles) {
        this.name = name;
        this.vehicles = vehicles;
    }
    public void passriver(){
        if (!(vehicles instanceof Boat)) {
           vehicles = Factory.getBoat();

        }

        vehicles.work();
    }
    public void common(){
        if(!(vehicles instanceof Horse)){
            vehicles = Factory.getHorse();
        }

        vehicles.work();
    }
}