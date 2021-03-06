package com.opower.soa.paperless;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * WXMaintainCSSUserAccount version 1: Maintain Self-Service User Account
 *
 * This class was generated by Apache CXF 3.2.4
 * 2019-01-26T22:55:31.922+05:30
 * Generated source version: 3.2.4
 *
 */
@WebService(targetNamespace = "http://ouaf.oracle.com/webservices/c1/WXMaintainCSSUserAccount", name = "WXMaintainCSSUserAccountPortType")
@XmlSeeAlso({ObjectFactory.class})
public interface WXMaintainCSSUserAccountPortType {

    @WebMethod(operationName = "WXMaintainCSSUserAccount", action = "http://ip-172-31-18-81.us-west-2.compute.internal/webservices/WXMaintainCSSUserAccount#WXMaintainCSSUserAccount")
    @RequestWrapper(localName = "WXMaintainCSSUserAccount", targetNamespace = "http://ouaf.oracle.com/webservices/c1/WXMaintainCSSUserAccount", className = "com.opower.soa.paperless.WXMaintainCSSUserAccount")
    @ResponseWrapper(localName = "WXMaintainCSSUserAccount", targetNamespace = "http://ouaf.oracle.com/webservices/c1/WXMaintainCSSUserAccount", className = "com.opower.soa.paperless.WXMaintainCSSUserAccount")
    public void wxMaintainCSSUserAccount(
        @WebParam(mode = WebParam.Mode.INOUT, name = "head", targetNamespace = "http://ouaf.oracle.com/webservices/c1/WXMaintainCSSUserAccount")
        javax.xml.ws.Holder<com.opower.soa.paperless.WXMaintainCSSUserAccount.Head> head,
        @WebParam(mode = WebParam.Mode.INOUT, name = "mainData", targetNamespace = "http://ouaf.oracle.com/webservices/c1/WXMaintainCSSUserAccount")
        javax.xml.ws.Holder<com.opower.soa.paperless.WXMaintainCSSUserAccount.MainData> mainData,
        @WebParam(mode = WebParam.Mode.INOUT, name = "custom", targetNamespace = "http://ouaf.oracle.com/webservices/c1/WXMaintainCSSUserAccount")
        javax.xml.ws.Holder<com.opower.soa.paperless.WXMaintainCSSUserAccount.Custom> custom,
        @WebParam(mode = WebParam.Mode.INOUT, name = "errorInformation", targetNamespace = "http://ouaf.oracle.com/webservices/c1/WXMaintainCSSUserAccount")
        javax.xml.ws.Holder<com.opower.soa.paperless.WXMaintainCSSUserAccount.ErrorInformation> errorInformation
    ) throws Fault_Exception;
}
