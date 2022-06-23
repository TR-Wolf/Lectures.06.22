import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class ImmutableClasses {
    public static void main(String[] args) {
        String s = "JAY";
        s.toLowerCase();
        System.out.println(s);
        // What is printed and why?

        String t = "JAY";
        t = t.toLowerCase();
        System.out.println(t);
        // What is printed and why?

        String x = "JAY";
        String y = x;
        x = x.toLowerCase();
        System.out.println(y);
        // What is printed and why?

        Date d = new Date();
        d.setHours(23);
        System.out.println(d);
        // What is printed and why?
        d.setTime(1l);
        System.out.println(d);
        // What is printed and why?


        ZonedDateTime datetime = ZonedDateTime.now();
        datetime.plus(1L, ChronoUnit.CENTURIES);
        System.out.println(datetime);
        // What is printed and why?

        // 1. What other standard Java classes are immutable?
        // 2. Why do the Java people over at Oracle like immutable classes?
        // 3. Do other languages have immutable classes or something equivalent?
        // 4. Why is it really important to learn about immutable classes? 

    }
}
