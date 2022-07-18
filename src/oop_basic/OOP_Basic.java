package oop_basic;
class Oop_Example{
    public static void main(String[] args) {
        OOP_Basic obj=new OOP_Basic();
        System.out.println(obj.i);
        System.out.println(OOP_Basic.b);
    }
}
public class OOP_Basic {
    static int b=3;//Globle(Static)
    int i=1;//Globle Variable(Instance)
    int num=45;
    public static void main(String[] args) {
        int i=  1;
        System.out.println(i);
        System.out.println(b);//b filed
        OOP_Basic obj=new OOP_Basic();//Class name obj=new Constructor();
        System.out.println(obj.i);
        String str="Mg Mg";

    }
}
