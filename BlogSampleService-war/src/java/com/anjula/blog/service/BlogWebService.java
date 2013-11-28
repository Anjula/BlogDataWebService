/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anjula.blog.service;

import javax.ejb.EJB;
import javax.jws.WebService;
import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author We
 */
@WebService(serviceName = "BlogWebService")
@Stateless()
public class BlogWebService {
    @EJB
    private SampleWebService ejbRef;// Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Web Service Operation")

    @WebMethod(operationName = "getDetails")
    public SimpleObject getDetails(@WebParam(name = "id") String id) {
        return ejbRef.getDetails(id);
    }

    @WebMethod(operationName = "getArrayDetails")
    public SimpleObject[] getArrayDetails(@WebParam(name = "id") String id) {
        return ejbRef.getArrayDetails(id);
    }
    
}
