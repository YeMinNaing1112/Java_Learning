package exception;

public class Exception1 {
    public static void main(String[] args) {
        int a = 50;
        int b = 0;
        try {
            int c;
            c=a/b;
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
