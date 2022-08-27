package varargs;

public class VarArgs {
    static void calculate(Integer... values){//{12,12,12}//Integer... //int num[]
        int a=0;
        for (Integer i : values) {
            a+=i;
        }
        System.out.println(a);
    }

    public static void main(String[] args) {
        calculate(12,12,12);
    }
}
