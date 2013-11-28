/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anjula.blog.service;

import javax.ejb.Stateless;
import javax.ejb.LocalBean;

/**
 *
 * @author We
 */
@Stateless
@LocalBean
public class SampleWebService {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    public SimpleObject getDetails(String id){
        SimpleObject result = new SimpleObject();        
        result.setId(id);
        result.setName("Anjula");
        result.setAddress("Kaduwela");        
        return result;        
    }
    
    public SimpleObject[] getArrayDetails(String id){
    
        SimpleObject result[] = new SimpleObject[2];
        
        SimpleObject temp1 = new SimpleObject();        
        temp1.setId(id);
        temp1.setName("Anjula");
        temp1.setAddress("Kaduwela"); 
        
        SimpleObject temp2 = new SimpleObject();        
        temp2.setId(id);
        temp2.setName("Sashika");
        temp2.setAddress("Ratnpura"); 
        
        result[0]=temp1;
        result[1]=temp2;
        
        return result;
    }
    
}
