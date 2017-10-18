import static java.time.format.DateTimeFormatter.*;
import java.time.LocalTime;

public class Main {

    public static void main(String[] args){
        String time = "23:00";
        String s = "";
        s.indexOf(",");
        System.out.println(LocalTime.parse(time, ofPattern("HH:mm")));
        System.out.println(LocalTime.ofSecondOfDay(82800));
    }
}
