package ro.mirodone;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternClass {

    public static void main(String[] args) {

        StringBuilder htmlText = new StringBuilder("<h1>Header</h1>");
        htmlText.append("<h2>Title</h2>");
        htmlText.append("<p>Paragraph 1</p>");
        htmlText.append("<p>Another paragraph </p>");
        htmlText.append("<h2>About</h2>");
        htmlText.append("<p>About paragraph</p>");

/*        String h2Pattern = ".*<h2>.*"; // "." will match every character and "*" means zero or more //
        // everything before and after h2 and will have the hole string, will have a match > true*/

        String h2Pattern = "<h2>"; // we have to use this in order to use the counter
        Pattern pattern = Pattern.compile(h2Pattern, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(htmlText);
        System.out.println(matcher.matches());

        matcher.reset(); // we can use a matcher only once ! so we have to reset it.

        System.out.println(htmlText);

        int count = 0;
        while (matcher.find()){
            count++;
            System.out.println("Occurrence " + count + " : " + matcher.start() + " to " + matcher.end());
        }

        String h2GroupPattern = "(<h2>.*?</h2>)";// using ? we make a lazy quantifier // will print only the tag <h2>
        Pattern groupPattern = Pattern.compile(h2GroupPattern);
        Matcher groupMatcher = groupPattern.matcher(htmlText);
        System.out.println(groupMatcher.matches());
        groupMatcher.reset();

        while (groupMatcher.find()){
            System.out.println("Occurrence: "+ groupMatcher.group(1));
        }
       // =======================================================
        //match sample phone number

        String phone1 = "1234567890"; //no match
        String phone2 = "(123) 456-7890"; //match
        String phone3 = "123 456-7890"; //no match
        String phone4 = "(123)456-7890"; //no match

        System.out.println("Phone 1 : " + phone1.matches("^([\\(]{1}[0-9]{3}[\\)]{1}[ ]{1}[0-9]{3}[\\-]{1}[0-9]{4})$"));
        System.out.println("Phone 1 : " + phone2.matches("^([\\(]{1}[0-9]{3}[\\)]{1}[ ]{1}[0-9]{3}[\\-]{1}[0-9]{4})$"));
        System.out.println("Phone 1 : " + phone3.matches("^([\\(]{1}[0-9]{3}[\\)]{1}[ ]{1}[0-9]{3}[\\-]{1}[0-9]{4})$"));
        System.out.println("Phone 1 : " + phone4.matches("^([\\(]{1}[0-9]{3}[\\)]{1}[ ]{1}[0-9]{3}[\\-]{1}[0-9]{4})$"));


    }
}
