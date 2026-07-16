package Collections.DateTime_API.Program4;

import java.time.LocalDate;

public class LeapYear {
    public static void main(String[] args) {

        int year = LocalDate.now().getYear();

        if (LocalDate.now().isLeapYear())
            System.out.println(year + " is a Leap Year");
        else
            System.out.println(year + " is not a Leap Year");
    }
}
