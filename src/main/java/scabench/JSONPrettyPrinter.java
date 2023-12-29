package scabench;


import org.json.JSONObject;
import org.json.XML;
import java.io.*;

/**
 * Simple application -- reads JSON from a file and
 * pretty-prints in to the console.
 * @author jens dietrich
 */
public class XML2JSONConverter {

    public static void main (String[] args) throws FileNotFoundException {
        File input = new File(args[0]);
        JSONObject json = new JSONObject(input);
        System.out.println(json.toString(4));
    }

}
