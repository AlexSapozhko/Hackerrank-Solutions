package net.sapozhko.alex.java.javadateandtime;

import java.time.DayOfWeek;
import java.util.Calendar;
import java.util.Scanner;

/**
 * @author sergii.sapozhko on 2017-04-22.
 */
public class JavaDateAndTime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String month = in.next();
        String day = in.next();
        String year = in.next();

        Calendar calendar = Calendar.getInstance();
        calendar.set(Integer.valueOf(year), Integer.valueOf(month) - 1, Integer.valueOf(day) - 1);
        System.out.println(DayOfWeek.of(calendar.get(Calendar.DAY_OF_WEEK)));
    }
}
