
package com.google.api.ads.adwords.jaxws.v201409.cm;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "MediaService", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201409", wsdlLocation = "https://adwords.google.com/api/adwords/cm/v201409/MediaService?wsdl")
public class MediaService
    extends Service
{

    private final static URL MEDIASERVICE_WSDL_LOCATION;
    private final static WebServiceException MEDIASERVICE_EXCEPTION;
    private final static QName MEDIASERVICE_QNAME = new QName("https://adwords.google.com/api/adwords/cm/v201409", "MediaService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("https://adwords.google.com/api/adwords/cm/v201409/MediaService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        MEDIASERVICE_WSDL_LOCATION = url;
        MEDIASERVICE_EXCEPTION = e;
    }

    public MediaService() {
        super(__getWsdlLocation(), MEDIASERVICE_QNAME);
    }

    public MediaService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    /**
     * 
     * @return
     *     returns MediaServiceInterface
     */
    @WebEndpoint(name = "MediaServiceInterfacePort")
    public MediaServiceInterface getMediaServiceInterfacePort() {
        return super.getPort(new QName("https://adwords.google.com/api/adwords/cm/v201409", "MediaServiceInterfacePort"), MediaServiceInterface.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns MediaServiceInterface
     */
    @WebEndpoint(name = "MediaServiceInterfacePort")
    public MediaServiceInterface getMediaServiceInterfacePort(WebServiceFeature... features) {
        return super.getPort(new QName("https://adwords.google.com/api/adwords/cm/v201409", "MediaServiceInterfacePort"), MediaServiceInterface.class, features);
    }

    private static URL __getWsdlLocation() {
        if (MEDIASERVICE_EXCEPTION!= null) {
            throw MEDIASERVICE_EXCEPTION;
        }
        return MEDIASERVICE_WSDL_LOCATION;
    }

}