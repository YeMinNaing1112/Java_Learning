package looping;

import java.util.Arrays;

public class Arrey {
    public static void main(String[] args) {
//        String []names={"Mg Mg","Ma Ma","U Ba"};
//        int[] num={1,2,3,4,5,6};
//        System.out.println(Arrays.toString(names));
//        System.out.println(Arrays.toString(num));
//        System.out.println(num.length);
//        System.out.println(num[4]);
//        for (int i=0;i< num.length;i++){
//
//            num[4]=num[4]+2;
//            System.out.println(num[4]);
//        }
//        for (int i = num.length - 1; i >= 0; i--) {
//            System.out.println(num[i]);
//        }
//        for (int i : num) {
//            System.out.println(i);
//        }

        int num1[][]={
                {1,2,3,4,5,6},
                {2,4,6,8,10,12},
                {1,3,5,7,9,11,13}
        };
        System.out.println(num1[2][4]);

        for (int i = 0; i < num1.length; i++) {
            for (int i1 = 0; i1 < num1[1].length; i1++) {
                System.out.println(num1[i][i1]);
            }



            int num[]={11,22,33,44,55};
            for (int i1 = 0; i1 < num.length; i1++) {
                System.out.println(num[i1]);
            }
        }
    }
}
