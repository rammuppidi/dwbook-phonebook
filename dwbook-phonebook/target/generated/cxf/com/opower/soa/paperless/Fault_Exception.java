
package com.opower.soa.paperless;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.2.4
 * 2019-01-26T22:55:31.890+05:30
 * Generated source version: 3.2.4
 */

@WebFault(name = "Fault", targetNamespace = "http://ouaf.oracle.com/")
public class Fault_Exception extends Exception {

    private com.opower.soa.paperless.Fault fault;

    public Fault_Exception() {
        super();
    }

    public Fault_Exception(String message) {
        super(message);
    }

    public Fault_Exception(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public Fault_Exception(String message, com.opower.soa.paperless.Fault fault) {
        super(message);
        this.fault = fault;
    }

    public Fault_Exception(String message, com.opower.soa.paperless.Fault fault, java.lang.Throwable cause) {
        super(message, cause);
        this.fault = fault;
    }

    public com.opower.soa.paperless.Fault getFaultInfo() {
        return this.fault;
    }
}
