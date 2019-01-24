import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

public class I_O {
    public static void main(String[] arg)throws Exception {
        try {
            File file = new File("./" + arg[0]);     //taking file name from argument

            BufferedReader br = new BufferedReader(new FileReader(file));

            String st;

            Map<Character, Integer> hm = new HashMap<Character, Integer>();

            while ((st = br.readLine()) != null) {
                char[] strArray = st.toCharArray();
                for (char c : strArray) {
                    if (hm.containsKey(c)) {
                        hm.put(c, hm.get(c) + 1);
                    } else {
                        hm.put(c, 1);
                    }
                }
            }
            PrintStream fileOut = new PrintStream("./out.txt");
            System.setOut(fileOut);
            for (Map.Entry entry : hm.entrySet()) {
                System.out.println("" + entry.getKey() + " " + entry.getValue());
            }
        }
        catch (Exception E){
            System.out.println("Error occured ,Exception"+E);
        }
    }




}
