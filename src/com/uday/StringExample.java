package com.uday;

public class StringExample {
    public static void main(String[] args) {
       String input="Sunday";
       switch(input){
           case "Monday":
           case "Tuesday":
           case "Wednesday":
           case "Thursday":
           case "Friday":
               System.out.println("Weekdays");
               break;
           case "Saturday":
           case "Sunday":
               System.out.println("Weekends");
               break;
           default:
               System.out.println("invalid Day");
       }
        switch (input) {
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> System.out.println("Weekdays");
            case "Saturday", "Sunday" -> System.out.println("Weekends");
            default -> System.out.println("invalid Day");
        }
        String daysInAWeekStr = "Days in a week \n" +
                "Sunday\n" +
                "Monday\n" +
                "Tuesday\n" +
                "Wednesday\n" +
                "Thursday\n" +
                "Friday\n" +
                "Saturday\n";

//        String daysInAWeekStr = `Days in a week
//        Sunday
//                Monday
//        Tuesday
//                Wednesday
//        Thursday
//                Friday
//        Saturday`;
       System.out.println(daysInAWeekStr);

    }
}

 