package oop_basic;

public class Method_Example {
    void display(){
        System.out.println("My Name is Ye Min Naing");
    }

    static  void  show(){
        System.out.println("My Name is Zan zan");
    }
    static void example(){
        System.out.println("Hello World");
    }

    public static void main(String[] args) {
        Method_Example me=new Method_Example();
        me.display();
        show();
        Method_Example.example();
    }

}
