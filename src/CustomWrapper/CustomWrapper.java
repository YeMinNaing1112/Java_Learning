package CustomWrapper;

class CustomNumber{
    int num;
    public CustomNumber(int i) {
        num=i;
    }

    @Override// Use to String
    public String toString() {
        return String.valueOf(num);
    }
    public void show(){
        System.out.println(num );
    }
}

public class CustomWrapper {
    public static void main(String[] args) {
        CustomNumber customNumber=new CustomNumber(3);
        System.out.println(customNumber);
        customNumber.show();
    }
}
