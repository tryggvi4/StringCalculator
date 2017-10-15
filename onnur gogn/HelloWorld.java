import org.joda.time.DateTime;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        DateTime today = new DateTime();
        System.out.println("Today is a: " +
        today.dayOfWeek().getAsText());
    }
}