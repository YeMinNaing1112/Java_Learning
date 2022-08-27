package string;

import java.util.Arrays;

public class StringExample {
    public static void main(String[] args) {
        String str= "Ye Min Naing";
        String str1=new String("Ye Min Naing");
        char ch[]={'Y','M','N'};
        String str2=new String(ch);

        System.out.println(str);
        System.out.println(str1);
        System.out.println(str2);

        char ch1[]=str1.toCharArray();
        System.out.println(Arrays.toString(ch1));

    }
}
