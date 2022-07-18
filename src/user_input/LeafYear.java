package user_input;

import java.util.Scanner;
public class LeafYear {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int i=scanner.nextInt();
        if (i%4==0){
            System.out.println("This is a leaf Year");
        }else {
            System.out.println("This is not a leaf Year");
        }
    }
}
