package com.company;

import java.util.*;

public class calendar_class {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(" The maximum no. of weeks in a year : " + c.getMaximum(Calendar.WEEK_OF_YEAR));

    }
}
