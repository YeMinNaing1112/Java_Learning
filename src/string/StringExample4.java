package string;

import java.util.Arrays;

/**
 * subString
 * split
 */
public class StringExample4 {
    public static void main(String[] args) {
        String name="Ye Min Naing";
        System.out.println(name.substring(6));
        System.out.println(name.substring(0,2));

        String str="Welcome to Myanmar";
        System.out.println(Arrays.toString(str.split("\\s")));
    }
}

