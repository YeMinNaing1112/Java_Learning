package user_input;

import java.util.Scanner;

public class Caculator {
    public static void main(String[] args) {
        Scanner caculate=new Scanner(System.in);
        System.out.println("Enter First Num");
        int first=caculate.nextInt();

        System.out.println("Enter your second");
        int sec=caculate.nextInt();

        System.out.println("Enter your Operators");

        String oper=caculate.next();
        int result;
        switch (oper){

            case "+":
                result=first+sec;
                System.out.println("The Answer is " + result);
                break;
            case "-":
                result=first-sec;
                System.out.println("The Answer is " + result);
                break;
            case "*":
                result=first*sec;
                System.out.println("The Answer is " + result);
                break;
            case "/":
                result=first/sec;
                System.out.println("The Answer is " + result);
                break;

        }


    }
}
