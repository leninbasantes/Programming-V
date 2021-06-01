/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.controller;

import ec.edu.ec.model.Patient;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author Edison BV
 */
public class PatientController {
    
    public void save(Patient patient){
        System.out.println("saving from a class and output in the web server console -> " + patient.getName());
        
    }
    
       public Map<String, String> getHeadersInfo(HttpServletRequest request) {

        Map<String, String> map = new HashMap<String, String>();
        Enumeration headerNames = request.getHeaderNames();
        while (headerNames.hasMoreElements()) {
            String key = (String) headerNames.nextElement();
            
String value = request.getHeader(key);
            map.put(key, value);
        }

        return map;
    }
}
