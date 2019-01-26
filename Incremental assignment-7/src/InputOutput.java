import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

public class InputOutput {
    public static void main(String[] arg)throws Exception {
        try {
            File file = new File("./" + arg[0]);     //taking file name from argument

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
            PrintStream fileOut = new PrintStream("./out.txt");
            System.setOut(fileOut);
            for (Map.Entry entry : hashmap.entrySet()) {
                System.out.println("" + entry.getKey() + " " + entry.getValue());
            }
        }
        catch (Exception E){
            System.out.println("Error occured ,Exception"+E);
        }
    }

}


/**

Input and output files are present in the same directory.
*/
