

import java.util.Scanner;
import java.util.regex.Pattern;

public class SimpleRegexChecker {
    public static void main(String arg[]){
        final String sentencePattern="^[A-Z].*\\.$";
        String inputString;
        System.out.println("enter string");
        Scanner s = new Scanner(System.in);
        inputString=s.nextLine();
        if(Pattern.matches(sentencePattern,inputString))
        System.out.println("String matched pattern");
        else System.out.println("String not matched with pattern");
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
