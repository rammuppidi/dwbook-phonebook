package com.opower.soa.paperless;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * WXMaintainCSSUserAccount version 1: Maintain Self-Service User Account
 *
 * This class was generated by Apache CXF 3.2.4
 * 2019-01-26T22:55:31.936+05:30
 * Generated source version: 3.2.4
 *
 */
@WebServiceClient(name = "WXMaintainCSSUserAccountService",
                  wsdlLocation = "file:/D:/Opower/DSS/Code/dropwizard-sample/dwbook-phonebook/src/main/java/com/dwbook/phonebook/models/resources/WXMaintainCSSUserAccount.wsdl",
                  targetNamespace = "http://ouaf.oracle.com/webservices/c1/WXMaintainCSSUserAccount")
public class WXMaintainCSSUserAccountService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://ouaf.oracle.com/webservices/c1/WXMaintainCSSUserAccount", "WXMaintainCSSUserAccountService");
    public final static QName WXMaintainCSSUserAccountPort = new QName("http://ouaf.oracle.com/webservices/c1/WXMaintainCSSUserAccount", "WXMaintainCSSUserAccountPort");
    static {
        URL url = null;
        try {
            url = new URL("file:/D:/Opower/DSS/Code/dropwizard-sample/dwbook-phonebook/src/main/java/com/dwbook/phonebook/models/resources/WXMaintainCSSUserAccount.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(WXMaintainCSSUserAccountService.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "file:/D:/Opower/DSS/Code/dropwizard-sample/dwbook-phonebook/src/main/java/com/dwbook/phonebook/models/resources/WXMaintainCSSUserAccount.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public WXMaintainCSSUserAccountService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public WXMaintainCSSUserAccountService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WXMaintainCSSUserAccountService() {
        super(WSDL_LOCATION, SERVICE);
    }

    public WXMaintainCSSUserAccountService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public WXMaintainCSSUserAccountService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public WXMaintainCSSUserAccountService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns WXMaintainCSSUserAccountPortType
     */
    @WebEndpoint(name = "WXMaintainCSSUserAccountPort")
    public WXMaintainCSSUserAccountPortType getWXMaintainCSSUserAccountPort() {
        return super.getPort(WXMaintainCSSUserAccountPort, WXMaintainCSSUserAccountPortType.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WXMaintainCSSUserAccountPortType
     */
    @WebEndpoint(name = "WXMaintainCSSUserAccountPort")
    public WXMaintainCSSUserAccountPortType getWXMaintainCSSUserAccountPort(WebServiceFeature... features) {
        return super.getPort(WXMaintainCSSUserAccountPort, WXMaintainCSSUserAccountPortType.class, features);
    }

}
