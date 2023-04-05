package dev.gade.githubcopilot;

import java.time.LocalDate;

public class CalenderUtils {
    int calculateDaysBeteenDates(LocalDate startDate, LocalDate endDate) {
        return (int) (endDate.toEpochDay() - startDate.toEpochDay());
    }
}
