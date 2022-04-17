import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

public class Gigasecond {
    private static final Long GIGASECOND = (long) Math.pow(10, 9);
    public LocalDateTime timeNow;

    public Gigasecond(LocalDate moment) {
        this.timeNow = moment.atStartOfDay();
    }

    public Gigasecond(LocalDateTime moment) {
        this.timeNow = moment;
    }

    public LocalDateTime getDateTime() {
        return this.timeNow.plusSeconds(GIGASECOND);
    }

    public static void main(String[] args) {
        Gigasecond gigasecond = new Gigasecond(LocalDateTime.of(2022, Month.APRIL, 4,12, 40, 0));
        System.out.println(gigasecond.getDateTime());

        Gigasecond gigasecond2 = new Gigasecond(LocalDate.of(2022, Month.APRIL, 17));
        System.out.println(gigasecond2.getDateTime());

    }
}
