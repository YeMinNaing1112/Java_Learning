package Method;
class Car{
    Car car(){
        System.out.println("It s car");
        return null;
    }
}
public class MethodExample {
    int sum(){
        int a=3;
        int b=3;
        int c=a+b;
        System.out.println("Other Tesks");
        return c;

    }
    void eat(){
//        System.out.println("I am eating");
        System.out.println(1);
    }

     String name(){
        return "MgMg";
     }
    public static void main(String[] args) {
        MethodExample obj=new MethodExample();
        obj.eat();
        obj.sum();
        System.out.println(obj.sum());
        System.out.println(obj.name());

        Car car=new Car();
        System.out.println(car.car());
    }
}
