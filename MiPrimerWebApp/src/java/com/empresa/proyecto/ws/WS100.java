/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.empresa.proyecto.ws;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author SantiDuque
 */
@WebService(serviceName = "WS100")
public class WS100 {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getMensaje")
    public String getMensaje(@WebParam(name = "code") String code) {
        String msg = "Hola bienvenido al webservice "+code;
        return msg;
    }


    
}
