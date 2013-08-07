
package com.tscp.mvno.smpp.webservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.tscp.mvno.smpp.webservice package. 
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

    private final static QName _SendSMSMessageString_QNAME = new QName("http://webservice.smpp.mvno.tscp.com/", "sendSMSMessageString");
    private final static QName _SendSMSMessageResponse_QNAME = new QName("http://webservice.smpp.mvno.tscp.com/", "sendSMSMessageResponse");
    private final static QName _SendSMSMessageListResponse_QNAME = new QName("http://webservice.smpp.mvno.tscp.com/", "sendSMSMessageListResponse");
    private final static QName _SendSMSMessage_QNAME = new QName("http://webservice.smpp.mvno.tscp.com/", "sendSMSMessage");
    private final static QName _SendSMSMessageList_QNAME = new QName("http://webservice.smpp.mvno.tscp.com/", "sendSMSMessageList");
    private final static QName _WebServiceException_QNAME = new QName("http://webservice.smpp.mvno.tscp.com/", "WebServiceException");
    private final static QName _SendSMSMessageStringResponse_QNAME = new QName("http://webservice.smpp.mvno.tscp.com/", "sendSMSMessageStringResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.tscp.mvno.smpp.webservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TscpsmppResponse }
     * 
     */
    public TscpsmppResponse createTscpsmppResponse() {
        return new TscpsmppResponse();
    }

    /**
     * Create an instance of {@link SendSMSMessageString }
     * 
     */
    public SendSMSMessageString createSendSMSMessageString() {
        return new SendSMSMessageString();
    }

    /**
     * Create an instance of {@link SendSMSMessage }
     * 
     */
    public SendSMSMessage createSendSMSMessage() {
        return new SendSMSMessage();
    }

    /**
     * Create an instance of {@link SendSMSMessageStringResponse }
     * 
     */
    public SendSMSMessageStringResponse createSendSMSMessageStringResponse() {
        return new SendSMSMessageStringResponse();
    }

    /**
     * Create an instance of {@link SendSMSMessageList }
     * 
     */
    public SendSMSMessageList createSendSMSMessageList() {
        return new SendSMSMessageList();
    }

    /**
     * Create an instance of {@link WebServiceException }
     * 
     */
    public WebServiceException createWebServiceException() {
        return new WebServiceException();
    }

    /**
     * Create an instance of {@link Address }
     * 
     */
    public Address createAddress() {
        return new Address();
    }

    /**
     * Create an instance of {@link SmppDate }
     * 
     */
    public SmppDate createSmppDate() {
        return new SmppDate();
    }

    /**
     * Create an instance of {@link SendSMSMessageListResponse }
     * 
     */
    public SendSMSMessageListResponse createSendSMSMessageListResponse() {
        return new SendSMSMessageListResponse();
    }

    /**
     * Create an instance of {@link SendSMSMessageResponse }
     * 
     */
    public SendSMSMessageResponse createSendSMSMessageResponse() {
        return new SendSMSMessageResponse();
    }

    /**
     * Create an instance of {@link SmsMessage }
     * 
     */
    public SmsMessage createSmsMessage() {
        return new SmsMessage();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendSMSMessageString }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.smpp.mvno.tscp.com/", name = "sendSMSMessageString")
    public JAXBElement<SendSMSMessageString> createSendSMSMessageString(SendSMSMessageString value) {
        return new JAXBElement<SendSMSMessageString>(_SendSMSMessageString_QNAME, SendSMSMessageString.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendSMSMessageResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.smpp.mvno.tscp.com/", name = "sendSMSMessageResponse")
    public JAXBElement<SendSMSMessageResponse> createSendSMSMessageResponse(SendSMSMessageResponse value) {
        return new JAXBElement<SendSMSMessageResponse>(_SendSMSMessageResponse_QNAME, SendSMSMessageResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendSMSMessageListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.smpp.mvno.tscp.com/", name = "sendSMSMessageListResponse")
    public JAXBElement<SendSMSMessageListResponse> createSendSMSMessageListResponse(SendSMSMessageListResponse value) {
        return new JAXBElement<SendSMSMessageListResponse>(_SendSMSMessageListResponse_QNAME, SendSMSMessageListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendSMSMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.smpp.mvno.tscp.com/", name = "sendSMSMessage")
    public JAXBElement<SendSMSMessage> createSendSMSMessage(SendSMSMessage value) {
        return new JAXBElement<SendSMSMessage>(_SendSMSMessage_QNAME, SendSMSMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendSMSMessageList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.smpp.mvno.tscp.com/", name = "sendSMSMessageList")
    public JAXBElement<SendSMSMessageList> createSendSMSMessageList(SendSMSMessageList value) {
        return new JAXBElement<SendSMSMessageList>(_SendSMSMessageList_QNAME, SendSMSMessageList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WebServiceException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.smpp.mvno.tscp.com/", name = "WebServiceException")
    public JAXBElement<WebServiceException> createWebServiceException(WebServiceException value) {
        return new JAXBElement<WebServiceException>(_WebServiceException_QNAME, WebServiceException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendSMSMessageStringResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.smpp.mvno.tscp.com/", name = "sendSMSMessageStringResponse")
    public JAXBElement<SendSMSMessageStringResponse> createSendSMSMessageStringResponse(SendSMSMessageStringResponse value) {
        return new JAXBElement<SendSMSMessageStringResponse>(_SendSMSMessageStringResponse_QNAME, SendSMSMessageStringResponse.class, null, value);
    }

}
