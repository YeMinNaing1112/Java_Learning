package Exercise;

public class Testing {
    public static void main(String[] args) {

        String star = "*";
        int i = 1;
        while (i <= 5) {
            System.out.println(star);
            i++;
            star += "*";
        }

        int check=0;
        int num[]={12,34,534,65};
        int  min=num[0];
        for (int i1 = 0; i1 < num.length; i1++) {

             check=num[i1];
             if (min>check){
                 min=check;
             }

        }
        System.out.println(min);





      int fat=1;
      for (int i2=1;i2<=5;i2++){
          fat=fat*i2;
        }
        System.out.println(fat);
    }
}
