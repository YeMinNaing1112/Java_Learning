package abstraction;

public interface Main {
    void calculate();
}
class  No2{
    Main obj;

    public No2(Main obj) {
        this.obj = obj;
    }
    void bla(){
        obj.calculate();
    }
}
class No1 implements Main{

    @Override
    public void calculate() {
        System.out.println("I am calculate");
    }

    public static void main(String[] args) {
        No2 no2=new No2(new No1());
        no2.bla();
    }

}
