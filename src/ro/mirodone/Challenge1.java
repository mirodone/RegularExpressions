package ro.mirodone;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Challenge1 {

    public static void main(String[] args) {

        //write the string literal regular expression that will match the string
        String ch1 = "I want a bike.";
        System.out.println(ch1.matches("I want a bike."));
        String ch2 = "I want a car.";

        String regExp = "I want a \\w+.";
        System.out.println(ch1.matches(regExp) + "-" + ch2.matches(regExp));

        //using group
        String regExp1= "I want a (bike|car).";
        System.out.println(ch1.matches(regExp1) + "-" + ch2.matches(regExp1));

        //match using pattern

        String iPattern ="I want a \\w+.";
        Pattern pattern = Pattern.compile(iPattern);
        Matcher matcher = pattern.matcher(ch1);
        System.out.println(matcher.matches());
        matcher =  pattern.matcher(ch2);
        System.out.println(matcher.matches());

        String ch4 = "Replace all with underscores.";
        System.out.println(ch4.replaceAll(" ", "_"));
        System.out.println(ch4.replaceAll("\\s", "_"));

        String ch5 = "aaabccccccdddeefffq";
        System.out.println(ch5.matches("[a-q]+"));

        // match the ch5 string exactly

        System.out.println(ch5.matches("^a{3}bc{6}d{3}e{2}f{3}q$"));
        System.out.println(ch5.replaceAll("^a{3}bc{6}d{3}e{2}f{3}q$", "Replaced"));

        //

        String ch7 = "abcd.123";
        System.out.println(ch7.matches("^[a-z][A-z]+\\.\\d+$"));


        String ch11 = "11111-1111";
        System.out.println(ch11.matches("\\d{5}-\\d{4}$"));

    }
}
