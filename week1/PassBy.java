import java.util.Date;

public class PassBy {
    public static void main(String[] args) {
        String s = "JAY";
        workWithImmutableClass(s);
        System.out.println(s);
        // What is printed and why?

        String t = "Thomas";
        appendString(t, "-suffix");
        System.out.println(t);
        // What is printed and why?

        String x = "wo shi yi ge hao laoshi";
        x = usefullyCombine(x, ".");
        System.out.println(x);
        // What is printed and why?

        Date completelyMutable = new Date();
        workWithMutableClass(completelyMutable);
        System.out.println(completelyMutable);
        // What is printed and why?


    }
    
    private static void workWithImmutableClass(String s) {
        s.toLowerCase();
        System.out.println("Within method: " + s);
    }
    
    private static void appendString(String s, String appendMe) {
        s += appendMe;
        System.out.println("Within method: " + s);
    }
    
    private static void workWithMutableClass(Date d) {
        d.setTime(1_000L);
        System.out.println("Within method: " + d);
    }

    private static String usefullyCombine(String s, String appendMe) {

        return s + appendMe;
        // What are some other ways we could implement this method?
        // For example, return new String(s + appendMe);
    }
}
