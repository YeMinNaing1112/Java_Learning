package abstraction;

public interface NumberEx {
    void calculate();
}
class II{
    NumberEx obj;// NumberEx obj=new NumberEx(); interface
                 //NumberEx obj=new I();
    public II(NumberEx obj){
        this.obj=obj;
    }

    void blah(){
        obj.calculate();
    }
}


class I implements NumberEx{

    @Override
    public void calculate() {
        System.out.println("I'm calculating method");
    }

    public static void main(String[] args) {
        II ii=new II(new I());
        ii.blah();
    }
}
