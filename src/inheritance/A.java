package inheritance;

import javax.sound.midi.Soundbank;

class B{
    int b=22;
    void b(){
        System.out.println("Hello World");
    }
}
public class A extends B{
    int a=23;
    void a(){
        System.out.println("This is A");
    }

    public static void main(String[] args) {
       A a=new A();
        System.out.println(a.b);
        a.b();
    }
}
