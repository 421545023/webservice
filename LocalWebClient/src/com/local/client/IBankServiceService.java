
package com.local.client;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "IBankServiceService", targetNamespace = "http://service.bank.yinhai.com/", wsdlLocation = "http://127.0.0.1:8080/cshf/services/IBankService?wsdl")
public class IBankServiceService
    extends Service
{

    private final static URL IBANKSERVICESERVICE_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(com.local.client.IBankServiceService.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = com.local.client.IBankServiceService.class.getResource(".");
            url = new URL(baseUrl, "http://127.0.0.1:8080/cshf/services/IBankService?wsdl");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'http://127.0.0.1:8080/cshf/services/IBankService?wsdl', retrying as a local file");
            logger.warning(e.getMessage());
        }
        IBANKSERVICESERVICE_WSDL_LOCATION = url;
    }

    public IBankServiceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public IBankServiceService() {
        super(IBANKSERVICESERVICE_WSDL_LOCATION, new QName("http://service.bank.yinhai.com/", "IBankServiceService"));
    }

    /**
     * 
     * @return
     *     returns IBankService
     */
    @WebEndpoint(name = "IBankServicePort")
    public IBankService getIBankServicePort() {
        return super.getPort(new QName("http://service.bank.yinhai.com/", "IBankServicePort"), IBankService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IBankService
     */
    @WebEndpoint(name = "IBankServicePort")
    public IBankService getIBankServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://service.bank.yinhai.com/", "IBankServicePort"), IBankService.class, features);
    }

}
