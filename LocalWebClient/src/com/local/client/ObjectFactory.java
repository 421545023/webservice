
package com.local.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.local.client package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _DoBankService_QNAME = new QName("http://service.bank.yinhai.com/", "doBankService");
    private final static QName _DoBankServiceResponse_QNAME = new QName("http://service.bank.yinhai.com/", "doBankServiceResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.local.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DoBankServiceResponse }
     * 
     */
    public DoBankServiceResponse createDoBankServiceResponse() {
        return new DoBankServiceResponse();
    }

    /**
     * Create an instance of {@link DoBankService }
     * 
     */
    public DoBankService createDoBankService() {
        return new DoBankService();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoBankService }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.bank.yinhai.com/", name = "doBankService")
    public JAXBElement<DoBankService> createDoBankService(DoBankService value) {
        return new JAXBElement<DoBankService>(_DoBankService_QNAME, DoBankService.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoBankServiceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.bank.yinhai.com/", name = "doBankServiceResponse")
    public JAXBElement<DoBankServiceResponse> createDoBankServiceResponse(DoBankServiceResponse value) {
        return new JAXBElement<DoBankServiceResponse>(_DoBankServiceResponse_QNAME, DoBankServiceResponse.class, null, value);
    }

}
