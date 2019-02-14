
import java.util.Scanner;
import java.util.logging.Logger;
import java.util.regex.Pattern;

public class SimpleRegexChecker {

    static final Logger LOGGER = Logger.getLogger(SimpleRegexChecker.class.getName());

    public static void main(String[] arg) {

        String inputString;
        LOGGER.info("Enter string");
        Scanner s = new Scanner(System.in);
        inputString = s.nextLine();
        if (isValidSentence(inputString)) {
            LOGGER.info("String matched pattern");
        } else {
            LOGGER.info("String not matched with pattern");
        }
    }

    static boolean isValidSentence(String sentence) {
        final String sentencePattern = "^[A-Z].*\\.$";
        return Pattern.matches(sentencePattern, sentence);
    }
}


/**
  *Test cases:
      Input                      Output
    1.Pavan                      String not matched with pattern
    2.Pavan.                     String matched pattern
    3.my name is pavan reddy.    String not matched with pattern
    4.My name is pavan reddy.    String matched pattern
    5.heLLo WELCOME.             String not matched with pattern
    6.                           String not matched with pattern
    7.324234                     String not matched with pattern


   */
