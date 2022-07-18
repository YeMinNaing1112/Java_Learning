package Method;

public class MethodExample3 {
    void show(int a) {
        System.out.println(a);
    }

    void sum(int a, int b) {
        System.out.println(a+b);
    }
    String display(String s){
        return s;
    }
    String name(String firstname,String lastname){
        return firstname + "-" + lastname;
    }

    public static void main(String[] args) {
        MethodExample3 obj=new MethodExample3();
        obj.show(2);
        obj.sum(2,5);
        System.out.println(obj.display("Ye Min Naing"));
        System.out.println(obj.name("YeMin", "Naing"));
    }

}
