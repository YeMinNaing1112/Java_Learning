package string;

import java.util.Calendar;
import java.util.GregorianCalendar;

import static java.util.Calendar.MAY;

/**
 * Concat
 */
public class StringExample3 {
    public static void main(String[] args) {
        System.out.println("Ye Min " + " Naing");
        System.out.println("Ye Min ".concat("Naing"));

        String message=3+4+"Hello"+3+4;
        System.out.println(message);

        StringBuilder builder =new StringBuilder("Hello ");
        builder.append("World");
        System.out.println(builder);

        System.out.println(String.format("%s%s%s", "Ye", "Min", "Naing"));
        Calendar c = new GregorianCalendar(1995, MAY, 23);
        String s = String.format("Duke's Birthday: %1$tb %1$te, %1$tY", c);
    }
}
