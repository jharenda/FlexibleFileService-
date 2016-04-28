package filepractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author jlombardo
 */
public class GarageDataFormatter implements TextFormatter {
    
    @Override
    public List<Map<String,Object>> decode(List<String> data) {
//        String rawData = data.get(0);
//        String[] parts = rawData.split(",");
//        
//        double totalHours = Double.parseDouble(parts[0]);
//        double totalFees = Double.parseDouble(parts[1]);
        
        double totalHours = Double.parseDouble(data.get(0));
        double totalFees = Double.parseDouble(data.get(1));
        
        Map<String,Object> record = new HashMap<>();
        record.put("totalHours", totalHours);
        record.put("totalFees", totalFees);
        
        List<Map<String,Object>> list = new ArrayList<>();
        list.add(record);
        
        return list;
    }
    
    public List<String> encode(List<Map<String,Object>> programData) {
        
        return null;
    }
}
