package dev.gade.githubcopilot;

import java.time.LocalDate;

public class CalenderUtils {
    int calculateDaysBeteenDates(LocalDate startDate, LocalDate endDate) {
        return (int) (endDate.toEpochDay() - startDate.toEpochDay());
    }

    //function to sort a list of dates
public void sortDates(LocalDate[] dates) {
        LocalDate temp;
        for (int i = 0; i < dates.length; i++) {
            for (int j = i + 1; j < dates.length; j++) {
                if (dates[i].isAfter(dates[j])) {
                    temp = dates[i];
                    dates[i] = dates[j];
                    dates[j] = temp;
                }
            }
        }
    }


}
