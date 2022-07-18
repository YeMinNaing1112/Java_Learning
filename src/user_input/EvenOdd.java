package user_input;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
            int i=scanner.nextInt();
            if (i%2==0){
                System.out.println("This is even");
            }else {
                System.out.println("This is odd");
            }
    }
}
