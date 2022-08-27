package abstraction;

abstract  class AB{//Abstract
abstract void sum();
}
class ABC extends AB{

    @Override
    void sum() {
        System.out.println(3+3);
    }
}
class ABC1 extends  AB{

    @Override
    void sum() {
        System.out.println(4+7);
    }
}

public class Abstraction{
    public static void main(String[] args) {
ABC abc=new ABC();
abc.sum();
ABC1 abc1=new ABC1();
abc1.sum();
    }


}
