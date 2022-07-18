package three_operators;

public class ThreeOperators {
    public static void main(String[] args) {
        //Unary Operators
        int a=1;
       a=a++;
        System.out.println(a);

        //Binary
       int b=9;
       int c=a+b;
        System.out.println(c);

        //Ternary
        String user=(a>3)?"True":"False";
        System.out.println(user);


    }
}
