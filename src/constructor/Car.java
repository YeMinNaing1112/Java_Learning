package constructor;

public class Car {
    String n;
    String m;
    int p;
    Car(String name, String model, int prize){
   this.n=name;
   this.m=model;
   this.p=prize;

    }

    public static void main(String[] args) {


      Car car1=new Car("Toyota","2016",2400000);
        System.out.println(car1.n+"\t"+car1.m+"\t"+car1.p);
        Car car2=new Car("Honda","2000",20000);
        System.out.println(car2.n+"\t"+car2.m+"\t"+car2.p);
        Car car3=new Car("BMW","2016",5400000);
        System.out.println(car3.n+"\t"+car3.m+"\t"+car3.p);
    }
}
