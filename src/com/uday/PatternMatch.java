package com.uday;

public class PatternMatch {
    public static void main(String[] args) {
        String obj = "Uday Sagar";
        if (obj instanceof String) {
            String s = obj;
            System.out.println("length of "+s+" is "+s.length());
        }

        //in java 12
        //but removed in higher versions
        if (obj instanceof String s) {
            System.out.println(s.length());
        }

    }
}
