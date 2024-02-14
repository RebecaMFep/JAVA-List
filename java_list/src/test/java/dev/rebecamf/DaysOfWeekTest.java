package dev.rebecamf;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;


    
    // @Test
    // void testCreateListOfDayTheWeek() {
    //     DaysOfWeek list  = new DaysOfWeek();
    //     list.createListOfDayTheWeek();
    //     assertEquals(7 , list.getLenghtList());
    // }


   
        
   public class DaysOfWeekTest {

    @Test
    void testCreateListOfDayTheWeek() {
        DaysOfWeek ds = new DaysOfWeek();
        List<String> diasEsperados = Arrays.asList("Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo");
        List<String> diasObtenidos = ds.getDays();
        assertEquals(7, .getLenghtList());
    }

   }
