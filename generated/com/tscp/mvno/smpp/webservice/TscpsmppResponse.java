
package com.tscp.mvno.smpp.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tscpsmppResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tscpsmppResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="commandId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="commandStatus" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="dataEncoding" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="deliveryTime" type="{http://webservice.smpp.mvno.tscp.com/}smppDate" minOccurs="0"/>
 *         &lt;element name="destination" type="{http://webservice.smpp.mvno.tscp.com/}address" minOccurs="0"/>
 *         &lt;element name="errorCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="expiryTime" type="{http://webservice.smpp.mvno.tscp.com/}smppDate" minOccurs="0"/>
 *         &lt;element name="finalDate" type="{http://webservice.smpp.mvno.tscp.com/}smppDate" minOccurs="0"/>
 *         &lt;element name="length" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="messageId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="messageLen" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="messageStatus" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="messageText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="priority" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="protocolID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="registered" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="sequenceNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="serviceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="source" type="{http://webservice.smpp.mvno.tscp.com/}address" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tscpsmppResponse", propOrder = {
    "commandId",
    "commandStatus",
    "dataEncoding",
    "deliveryTime",
    "destination",
    "errorCode",
    "expiryTime",
    "finalDate",
    "length",
    "message",
    "messageId",
    "messageLen",
    "messageStatus",
    "messageText",
    "priority",
    "protocolID",
    "registered",
    "sequenceNum",
    "serviceType",
    "source"
})
public class TscpsmppResponse {

    protected int commandId;
    protected int commandStatus;
    protected int dataEncoding;
    protected SmppDate deliveryTime;
    protected Address destination;
    protected int errorCode;
    protected SmppDate expiryTime;
    protected SmppDate finalDate;
    protected int length;
    protected byte[] message;
    protected String messageId;
    protected int messageLen;
    protected int messageStatus;
    protected String messageText;
    protected int priority;
    protected int protocolID;
    protected int registered;
    protected int sequenceNum;
    protected String serviceType;
    protected Address source;

    /**
     * Gets the value of the commandId property.
     * 
     */
    public int getCommandId() {
        return commandId;
    }

    /**
     * Sets the value of the commandId property.
     * 
     */
    public void setCommandId(int value) {
        this.commandId = value;
    }

    /**
     * Gets the value of the commandStatus property.
     * 
     */
    public int getCommandStatus() {
        return commandStatus;
    }

    /**
     * Sets the value of the commandStatus property.
     * 
     */
    public void setCommandStatus(int value) {
        this.commandStatus = value;
    }

    /**
     * Gets the value of the dataEncoding property.
     * 
     */
    public int getDataEncoding() {
        return dataEncoding;
    }

    /**
     * Sets the value of the dataEncoding property.
     * 
     */
    public void setDataEncoding(int value) {
        this.dataEncoding = value;
    }

    /**
     * Gets the value of the deliveryTime property.
     * 
     * @return
     *     possible object is
     *     {@link SmppDate }
     *     
     */
    public SmppDate getDeliveryTime() {
        return deliveryTime;
    }

    /**
     * Sets the value of the deliveryTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link SmppDate }
     *     
     */
    public void setDeliveryTime(SmppDate value) {
        this.deliveryTime = value;
    }

    /**
     * Gets the value of the destination property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getDestination() {
        return destination;
    }

    /**
     * Sets the value of the destination property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setDestination(Address value) {
        this.destination = value;
    }

    /**
     * Gets the value of the errorCode property.
     * 
     */
    public int getErrorCode() {
        return errorCode;
    }

    /**
     * Sets the value of the errorCode property.
     * 
     */
    public void setErrorCode(int value) {
        this.errorCode = value;
    }

    /**
     * Gets the value of the expiryTime property.
     * 
     * @return
     *     possible object is
     *     {@link SmppDate }
     *     
     */
    public SmppDate getExpiryTime() {
        return expiryTime;
    }

    /**
     * Sets the value of the expiryTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link SmppDate }
     *     
     */
    public void setExpiryTime(SmppDate value) {
        this.expiryTime = value;
    }

    /**
     * Gets the value of the finalDate property.
     * 
     * @return
     *     possible object is
     *     {@link SmppDate }
     *     
     */
    public SmppDate getFinalDate() {
        return finalDate;
    }

    /**
     * Sets the value of the finalDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link SmppDate }
     *     
     */
    public void setFinalDate(SmppDate value) {
        this.finalDate = value;
    }

    /**
     * Gets the value of the length property.
     * 
     */
    public int getLength() {
        return length;
    }

    /**
     * Sets the value of the length property.
     * 
     */
    public void setLength(int value) {
        this.length = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setMessage(byte[] value) {
        this.message = ((byte[]) value);
    }

    /**
     * Gets the value of the messageId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageId() {
        return messageId;
    }

    /**
     * Sets the value of the messageId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageId(String value) {
        this.messageId = value;
    }

    /**
     * Gets the value of the messageLen property.
     * 
     */
    public int getMessageLen() {
        return messageLen;
    }

    /**
     * Sets the value of the messageLen property.
     * 
     */
    public void setMessageLen(int value) {
        this.messageLen = value;
    }

    /**
     * Gets the value of the messageStatus property.
     * 
     */
    public int getMessageStatus() {
        return messageStatus;
    }

    /**
     * Sets the value of the messageStatus property.
     * 
     */
    public void setMessageStatus(int value) {
        this.messageStatus = value;
    }

    /**
     * Gets the value of the messageText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageText() {
        return messageText;
    }

    /**
     * Sets the value of the messageText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageText(String value) {
        this.messageText = value;
    }

    /**
     * Gets the value of the priority property.
     * 
     */
    public int getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     */
    public void setPriority(int value) {
        this.priority = value;
    }

    /**
     * Gets the value of the protocolID property.
     * 
     */
    public int getProtocolID() {
        return protocolID;
    }

    /**
     * Sets the value of the protocolID property.
     * 
     */
    public void setProtocolID(int value) {
        this.protocolID = value;
    }

    /**
     * Gets the value of the registered property.
     * 
     */
    public int getRegistered() {
        return registered;
    }

    /**
     * Sets the value of the registered property.
     * 
     */
    public void setRegistered(int value) {
        this.registered = value;
    }

    /**
     * Gets the value of the sequenceNum property.
     * 
     */
    public int getSequenceNum() {
        return sequenceNum;
    }

    /**
     * Sets the value of the sequenceNum property.
     * 
     */
    public void setSequenceNum(int value) {
        this.sequenceNum = value;
    }

    /**
     * Gets the value of the serviceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceType() {
        return serviceType;
    }

    /**
     * Sets the value of the serviceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceType(String value) {
        this.serviceType = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setSource(Address value) {
        this.source = value;
    }

}
