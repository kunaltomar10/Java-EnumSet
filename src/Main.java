import java.util.EnumSet;

enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

public class Main {
    public static void main(String[] args) {

        EnumSet<Day> weekdays = EnumSet.of(
            Day.MONDAY,
            Day.TUESDAY,
            Day.WEDNESDAY,
            Day.THURSDAY,
            Day.FRIDAY
        );

        System.out.println(weekdays);
    }
}

