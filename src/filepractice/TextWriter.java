package filepractice;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author jlombardo
 */
public class TextWriter {
    public void writeFile(File file, TextFormatter formatter, List<Map<String,Object>> programData) throws IOException {
        List<String> list = formatter.encode(programData);
 boolean append = true;   // you can change this

 

       

        // This is where we setup our streams (append = false means overwrite)
        // new FileWriter() creates the file if doesn't exit
        PrintWriter out = new PrintWriter(
                new BufferedWriter(
                        new FileWriter(file, append)));
 List<Double> dataArray = new ArrayList<>(list);
        for (Double fileData : dataArray) {

           out.println(String.valueOf(fileData));
        }
        // }
         out.close(); 
        System.out.println("Wrote file to: " + file.getAbsolutePath());
    }
    }

