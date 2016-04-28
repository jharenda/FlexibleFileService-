package filepractice;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public class FileService {
    private TextFileReader reader;
    private TextWriter writer;
    
    public FileService() {
        reader = new TextFileReader();
        writer = new TextWriter();
    }
    
    public List<Map<String,Object>> readFile(File file,TextFormatter formatter) 
            throws FileNotFoundException, IOException {
        
        return reader.readFile(file, formatter);

    }

    public void writeFile(File file, TextFormatter formatter, List<Map<String,Object>> programData) {
        writer.writeFile(file, formatter, programData);
    }
    
    
}
