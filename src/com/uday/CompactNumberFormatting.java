package com.uday;

import java.text.NumberFormat;
import java.util.Locale;

public class CompactNumberFormatting {

    /*
    output will be
    Compact Formatting is:
    value is 2.59K
    value is 2.911 thousand
    value is 2.91 thousand
    */

    public static void main(String[] args)
    {
        System.out.println("Compact Formatting is:");
        NumberFormat upvotes = NumberFormat
                .getCompactNumberInstance(new Locale("en", "US"), NumberFormat.Style.SHORT);
        upvotes.setMaximumFractionDigits(2);

        System.out.println("value is "+upvotes.format(2592) );


        NumberFormat upvotes2 = NumberFormat
                .getCompactNumberInstance(new Locale("en", "US"), NumberFormat.Style.LONG);
        upvotes2.setMaximumFractionDigits(2);
        System.out.println("value is "+upvotes2.format(2911) );

        NumberFormat upvotes3 = NumberFormat
                .getCompactNumberInstance(new Locale("en", "US"), NumberFormat.Style.LONG);
        upvotes3.setMaximumFractionDigits(3);
        System.out.println("value is "+upvotes3.format(2911) );


    }


}

 