package com.pmunger.pm0173.constants;

import lombok.Data;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public enum EVacation {
    IndependenceDay("Independence Day"),
    LaborDay("Labor Day");

    String prettyName;

    private EVacation(String prettyName) {
        this.prettyName = prettyName;
    }

    @Data
    public class VacationInstance {
        Date vacationDate;
    }

    static int[] calendarKeys =
            {
                    Calendar.YEAR, Calendar.MONTH,
                    Calendar.DAY_OF_MONTH,
                    Calendar.HOUR,
                    Calendar.MINUTE,
                    Calendar.SECOND,
                    Calendar.MILLISECOND
            };

    public static List<VacationInstance> getVacationList(Date start, Date end) {
        ArrayList<VacationInstance> ret = new ArrayList<>();
        for (EVacation vacation : EVacation.values()) {
            Date vacationDate = new Date(start.getYear(), 1, 1);
            while (vacationDate.before(end) || vacationDate.equals(end)) {
                while (vacationDate.before(start)) {
                    switch (vacation) {
                        case IndependenceDay -> {
                            int day = 4;
                            int month = 7;
                            int year = vacationDate.getYear();
                            Calendar test = getCalendar(year, month, day);
                            if(test.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY)
                                test.add(Calendar.DAY_OF_MONTH, -1);
                            else if(test.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY)
                                test.add(Calendar.DAY_OF_MONTH, 1);
                            vacationDate = new Date(year, month, test.get(Calendar.DAY_OF_MONTH));
                        }
                        case LaborDay -> {
                            int month = 9;
                            int year = vacationDate.getYear();
                            Calendar test = getCalendar(year, month, 1);
                            test.set(Calendar.DAY_OF_WEEK, 2);
                            vacationDate = new Date(year, month, test.get(Calendar.DAY_OF_MONTH));
                        }
                        default -> {
                            throw new IllegalArgumentException("Unexpected vacation '" + vacation.name() + "'.");
                        }
                    }
                    if(vacationDate.before(start))
                        vacationDate = new Date(vacationDate.getYear() + 1, 1, 1);
                }
                if(vacationDate.before(end) || vacationDate.equals(end)) {
                    VacationInstance vacationInstance = vacation.new VacationInstance();
                    vacationInstance.setVacationDate(vacationDate);
                    ret.add(vacationInstance);
                    vacationDate = new Date(vacationDate.getYear() + 1, 1, 1);
                }
                else
                    break;
            }
        }
        return ret;
    }

    private static Calendar getCalendar(int year, int month, int day) {
        Calendar test = Calendar.getInstance();
        for (int calendarKey : calendarKeys) {
            switch (calendarKey) {
                case Calendar.YEAR -> test.set(calendarKey, year);
                case Calendar.MONTH -> test.set(calendarKey, month);
                case Calendar.DAY_OF_MONTH -> test.set(calendarKey, day);
                default -> test.set(calendarKey, 0);
            }
        }
        return test;
    }
}
