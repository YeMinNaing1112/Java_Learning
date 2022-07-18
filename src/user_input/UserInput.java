package user_input;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        System.out.println("Enter Your Name");
        Scanner scanner=new Scanner(System.in);
        String name=scanner.nextLine();
        System.out.println(name.toUpperCase());
    }
}
