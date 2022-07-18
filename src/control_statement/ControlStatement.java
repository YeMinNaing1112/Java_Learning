package control_statement;

public class ControlStatement {
    public static void main(String[] args) {
        if (3 < 2) {
            System.out.println("2 is greater than 3");
        } else {
            System.out.println("3 is greater than 2");
        }

        if (1 > 3) {
            System.out.println("Input1 is greater than 3");
        } else if (2 > 3) {
            System.out.println("Input2 is greater than 3");
        } else if (3 > 3) {
            System.out.println("Input3 is greater than 3");
        } else {
            System.out.println("Input4 is greater than 3");
        }


        int val = 2;
        switch (val) {
            case 2:
                System.out.println(2);
                break;
            case 1:
                System.out.println(1);
                break;
            default:
                System.out.println("default");
        }
    }
}
