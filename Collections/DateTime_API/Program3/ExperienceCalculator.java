package Collections.DateTime_API.Program3;

import java.time.LocalDate;
import java.time.Period;

public class ExperienceCalculator {
    public static void main(String[] args) {

        // Change joining date if required
        LocalDate joiningDate = LocalDate.of(2022, 6, 15);

        LocalDate today = LocalDate.now();

        Period p = Period.between(joiningDate, today);

        System.out.println("Experience");
        System.out.println("Years  : " + p.getYears());
        System.out.println("Months : " + p.getMonths());
        System.out.println("Days   : " + p.getDays());
    }
}
