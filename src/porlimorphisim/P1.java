package porlimorphisim;

public class P1 {
    static   void  sum(){
        System.out.println(1);
    }
    static   void  sum(int i){
      System.out.println(i +i);
    }
    static   void  sum(double i){
        System.out.println(i+i);
    }
    static   void  sum(int i,int a){
        System.out.println(i+a);
    }

    public static void main(String[] args) {
        sum();
        sum(1);
        sum(1.0);
        sum(1,2);
    }
}
