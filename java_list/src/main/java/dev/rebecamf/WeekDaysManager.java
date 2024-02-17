package dev.rebecamf;


import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class WeekDaysManager {
    
     private List<String> daysOfWeek;

    public WeekDaysManager() {
        this.daysOfWeek = new ArrayList<>();
        createWeekDaysList();
    }

    private void createWeekDaysList() {

        daysOfWeek.add("Monday");
        daysOfWeek.add("Thuesday");
        daysOfWeek.add("Wensday");
        daysOfWeek.add("Thursday");
        daysOfWeek.add("Friday");
        daysOfWeek.add("Saturday");
        daysOfWeek.add("Sunday");
    }

    public List<String> getDaysOfWeek() {
        return daysOfWeek;
    }

    public int getSize() {
        return daysOfWeek.size();
    }

    public void removeDay(String day) {
        daysOfWeek.remove(day);
    }

    public String getDayOfWeek(int index) {
        if (index >= 0 && index < daysOfWeek.size()) {
            return daysOfWeek.get(index);
        } 
            return null;
    }
    
    public boolean containsDay(String day) {
        return daysOfWeek.contains(day);
    }

    public void sortDaysAlphabetically() {
        Collections.sort(daysOfWeek);
    }

    public void clearDaysOfWeek() {
        daysOfWeek.clear();
    }

    public void setDaysOfWeek(List<String> dayWheeks) {
        this.daysOfWeek = dayWheeks;
    }


}
