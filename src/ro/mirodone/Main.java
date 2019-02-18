package ro.mirodone;

public class Main {

    public static void main(String[] args) {

        String someCharacters = "abcDeeeF321dfkgkratoghlb";
        System.out.println(someCharacters.replaceAll(".","1"));

        System.out.println(someCharacters.replaceAll("^abcDeee","0"));
        System.out.println(someCharacters.replaceAll("[^abcDeee]","0"));
        System.out.println(someCharacters);

        System.out.println(someCharacters.matches("^Hello")); //returns false
        System.out.println(someCharacters.matches("^abcDeee")); //returns false
        System.out.println(someCharacters.matches("^abcDeeeF321dfkgkrtoghlb")); // returns true
        // - hole string must mach to return true

        System.out.println(someCharacters.replaceAll("oghlb$","THE END"));
        System.out.println(someCharacters.replaceAll("[ed]","X"));
        System.out.println(someCharacters.replaceAll("[ed][Ff]","X"));

        String newCharacters = "abcDeeeF321Ghhiiiiijkl99z";
        System.out.println(newCharacters.replaceAll("[^ej]","X"));
        System.out.println(newCharacters.replaceAll("[a-fA-F3-8]","Y"));// replace all ch from
        // a to f, A to F, and number from 3 to 8
        System.out.println(newCharacters.replaceAll("\\d", "X")); // replace all digits
        System.out.println(newCharacters.replaceAll("\\D","Y")); // replace all letters

        String blankSpaces = "a b c d e f g h j k l m n o p letters";
        System.out.println(blankSpaces);
        System.out.println(blankSpaces.replaceAll("\\s","")); // removes all spaces
        System.out.println(blankSpaces.replaceAll("\\S", "")); // replace all characters with space character
        System.out.println(blankSpaces.replaceAll("\\w", "X"));// replace all characters with X and space remains
        System.out.println(blankSpaces.replaceAll("\\W", "X"));// replace all space character with X
        System.out.println(blankSpaces.replaceAll("\\b", "X"));// surround all letters/words with X



    }
}
