package inheritance;
class E extends Hierarchical{
    public static void main(String[] args) {
        E e=new E();
        System.out.println(e.a);
    }
}
class F extends  Hierarchical{
    public static void main(String[] args) {
        F f=new F();
        System.out.println(f.a);
    }
}
public class Hierarchical {
    int a=4;
}
