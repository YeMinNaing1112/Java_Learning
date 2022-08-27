package abstraction;

public interface InterFace {
    void firstName();
}
class Child implements InterFace{

    @Override
    public void firstName() {
        System.out.println("My name is Mg Mg");
    }
}
class Show {
    public static void main(String[] args) {
        Child child = new Child();
        child.firstName();
    }
}
