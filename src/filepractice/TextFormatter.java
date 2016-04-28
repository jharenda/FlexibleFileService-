/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filepractice;

import java.util.List;
import java.util.Map;

/**
 *
 * @author jlombardo
 */
public interface TextFormatter {

    List<Map<String, Object>> decode(List<String> data);
    
    List<String> encode(List<Map<String,Object>> programData);
   
}
