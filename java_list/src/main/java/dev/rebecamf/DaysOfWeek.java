package dev.rebecamf;


import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class DaysOfWeek {
    
     private List<String> days;

    public DaysOfWeek() {
        days = new ArrayList<>();
        createDays();
    }

    private void createDays() {

        days.add("Monday");
        days.add("Thuesday");
        days.add("Wensday");
        days.add("Thursday");
        days.add("Friday");
        days.add("Saturday");
        days.add("Sunday");
    }

    public List<String> getDays() {
        return Collections.unmodifiableList(days);
    }

    public int getDaysNumbers() {
        return days.size();
    }

    public boolean deleteDay(String day) {
        return days.remove(day);
    }

    public String getDayIndex(int index) {
        return days.get(index);
    }

    public boolean existDay(String day) {
        return days.contains(day);
    }

    public void orderDaysAlfabetic() {
        Collections.sort(days);
    }

    public void clearDays() {
        days.clear();
    }
}
