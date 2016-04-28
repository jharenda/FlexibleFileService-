package filepractice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author jlombardo
 */
public class TextFileReader {

    public List<Map<String,Object>> readFile(File file, TextFormatter formatter) 
            throws FileNotFoundException, IOException {
        
        List<String> fileData = new ArrayList<>();
        
        BufferedReader in = null;
        in = new BufferedReader(new FileReader(file));
        
        String line = in.readLine();
        while(line != null) {
            fileData.add(line);
            line = in.readLine();
        }
        in.close();
        
        return formatter.decode(fileData);
    }
    
  
    
}
