package inheritance;
class C{
    int a=3;
}
class D extends C{
    int b=4;
}

public class Multilevel extends D{
    public static void main(String[] args) {
        Multilevel m=new Multilevel();
        System.out.println(m.b);
        System.out.println(m.a);

    }
}
