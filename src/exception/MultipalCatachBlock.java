package exception;

public class MultipalCatachBlock {
    public static void main(String[] args) {
        int  a=3;
        int b=0;
       try {
           int c=a/b;
           System.out.println(c);

           int array[]=new int[5];
           System.out.println(array[6]);
       }catch (ArithmeticException e){
           System.out.println("this is arithmethicException");
       }catch (ArrayIndexOutOfBoundsException e){
           System.out.println("this is ArrayIndexOutOfBoundException ");
       }catch (Exception e){
           System.out.println("this is general");
       }
    }
}
