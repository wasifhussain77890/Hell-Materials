
// important import statements  
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class currentdate {

    // main method
    public static void main(String[] argvs) {
        long millis = System.currentTimeMillis();

        // creating a new object of the class Date
        java.util.Date date = new java.util.Date(millis);
        System.out.println(date);

    }
}