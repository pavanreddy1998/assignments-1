import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

public class CharacterCounter {
    public static void main(String[] arg) throws Exception {

        final String inputFilePath = "./" + arg[0];    //taking file name from argument
        final String outputFilePath = "./out.txt";
        try {
            File file = new File(inputFilePath);

            BufferedReader buffer = new BufferedReader(new FileReader(file));

            String string;

            Map<Character, Integer> hashmap = new HashMap<Character, Integer>();

            while ((string = buffer.readLine()) != null) {
                char[] charArray = string.toCharArray();
                for (char character : charArray) {
                    if (hashmap.containsKey(character)) {
                        hashmap.put(character, hashmap.get(character) + 1);
                    } else {
                        hashmap.put(character, 1);
                    }
                }
            }
            PrintStream fileOut = new PrintStream(outputFilePath);
            System.setOut(fileOut);
            for (Map.Entry entry : hashmap.entrySet()) {
                System.out.println("" + entry.getKey() + " " + entry.getValue());
            }
        } catch (Exception E) {
            System.out.println("Please pass the correct filename as an argument to the program");
        }
    }

}


/**

  
1. Input and output files are present in the same directory.


2.If trying to execute the program with no arguments
      Please pass the correct filename as an argument to the program


3. if file does not exist
      Please pass the correct filename as an argument to the program


*/
