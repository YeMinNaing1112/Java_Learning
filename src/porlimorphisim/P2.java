package porlimorphisim;
class  Parent{
    void eat(){
        System.out.println("I eat apple");
    }
}
public class P2 extends Parent {
    @Override
    void eat() {
        System.out.println("I eat banana");
    }

    public static void main(String[] args) {
      P2 obj=new P2();
      obj.eat();
    }
}
