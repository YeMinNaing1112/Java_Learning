package string;

public class StringExample2 {
    public static void main(String[] args) {
        String name1="Ye Min Naing";
        String name2="ye Min Naing";
        String name3="Ye Min Naing";
        String name4=new String("Ye Min Naing");
        String name5=new String("Ye Min Naing");

        System.out.println(name1.equals(name2));

        System.out.println(name3.equalsIgnoreCase(name2));

        System.out.println(name4 == name5);

        System.out.println(name4.equals(name5));

        System.out.println("A".compareTo("B"));


    }
}
