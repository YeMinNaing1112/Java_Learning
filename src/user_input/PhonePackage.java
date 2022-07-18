package user_input;

import java.util.Scanner;

public class PhonePackage {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Avaliable Package");
        System.out.println("999mb=*999#");
        System.out.println("700mb=*700#");
        System.out.println("600mb=*600#");
        System.out.println("500mb=*500#");
        System.out.println("Enter Your Pacage Code" );

        String code=scanner.nextLine();
        switch (code){
            case "*999#":
                System.out.println("999mb buying successful");
                break;
            case "*700#":
                System.out.println("700mb buying successful");
                break;
            case "*600#":
                System.out.println("600mb buying successful");
                break;
            case "*500#":
                System.out.println("500mb buying successful");
                break;
            default:
                System.out.println("In Correct Code");
        }
           }
}
