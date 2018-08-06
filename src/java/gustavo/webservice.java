/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gustavo;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ejb.Stateless;

/**
 *
 * @author bicap
 */
@WebService(serviceName = "webservice")
@Stateless()
public class webservice {

    /**
     * Web service operation
     * @param param1
     * @param param2
     * @return 
     */
    @WebMethod(operationName = "add")
    public String add(@WebParam(name = "param1") int param1, @WebParam(name = "param2") int param2) {
        //TODO write
        return "La suma es "+ (param1+param2);
    }
}
