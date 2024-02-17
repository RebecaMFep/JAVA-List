package dev.rebecamf;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class WeekDaysManagerTest {
    private WeekDaysManager manager;

    @BeforeEach
    public void setUp() {
        manager = new WeekDaysManager();
    }

    @Test
    public void testCreateWeekDaysList() {
        List<String> expectedDays = Arrays.asList("Monday", "Thuesday", "Wensday", "Thursday", "Friday", "Saturday", "Sunday");
        assertEquals(expectedDays, manager.getDaysOfWeek());
    }

    @Test
    public void testGetDaysOfWeek() {
        List<String> expectedDays = Arrays.asList("Monday", "Thuesday", "Wensday", "Thursday", "Friday", "Saturday", "Sunday");
        assertEquals(expectedDays, manager.getDaysOfWeek());
    }

    @Test
    public void testGetSize() {
        assertEquals(7, manager.getSize());
    }

    @Test
    public void testRemoveDay() {
        manager.removeDay("Sunday");
        assertFalse(manager.containsDay("Sunday"));
    }

    @Test
    public void testGetDayOfWeek() {
        assertEquals("Monday", manager.getDayOfWeek(0));
        assertEquals("Sunday", manager.getDayOfWeek(6));
        assertNull(manager.getDayOfWeek(7));
    }

    @Test
    public void testContainsDay() {
        assertTrue(manager.containsDay("Friday"));
        assertFalse(manager.containsDay("InvalidDay"));
    }

    @Test
    public void testSortDaysAlphabetically() {
        List<String> expectedSortedDays = Arrays.asList("Friday", "Monday", "Saturday", "Sunday", "Thuesday", "Thursday", "Wensday");
        manager.sortDaysAlphabetically();
        assertEquals(expectedSortedDays, manager.getDaysOfWeek());
    }

    @Test
    public void testClearDaysOfWeek() {
        manager.clearDaysOfWeek();
        assertTrue(manager.getDaysOfWeek().isEmpty());
    }

    @Test
    public void testSetDaysOfWeek() {
        List<String> customDays = new ArrayList<>(Arrays.asList("CustomDay1", "CustomDay2"));
        manager.setDaysOfWeek(customDays);
        assertEquals(customDays, manager.getDaysOfWeek());
    }
}





   
        
  