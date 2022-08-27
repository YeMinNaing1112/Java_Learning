package inheritance;

class  Engine{
    void run(){
        System.out.println("The Engine is Running");
    }
}
public class Car {
    Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    void car(){
      engine.run();
    }
    public static void main(String[] args) {
        Engine engine=new Engine();
        Car car=new Car(engine);
        car.car();
    }
}
