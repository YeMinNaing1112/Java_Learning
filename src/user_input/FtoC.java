package user_input;

import java.util.Scanner;

public class FtoC {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int f= scanner.nextInt();
        int c=f-32;
        int d=c*5/9;
        System.out.println(d);

    }
}
