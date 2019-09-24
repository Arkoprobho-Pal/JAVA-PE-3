package com.stackroute.main;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class FirstLastDayOfWeek {
    public void CalculateFirstLastDay(){
        DateFormat dateFormat=new SimpleDateFormat("EEE dd/MM/YYYY");
        Calendar calendar=Calendar.getInstance();
        calendar.setFirstDayOfWeek(Calendar.MONDAY);
        calendar.set(Calendar.DAY_OF_WEEK,calendar.getFirstDayOfWeek());
        System.out.println(dateFormat.format(calendar.getTime()));
        calendar.set(Calendar.DAY_OF_WEEK,Calendar.SUNDAY);

        System.out.println(dateFormat.format(calendar.getTime()));

    }

    public static void main(String[] args) {
        FirstLastDayOfWeek firstLastDayOfWeek=new FirstLastDayOfWeek();
        firstLastDayOfWeek.CalculateFirstLastDay();
    }
}
