
package com.tscp.mvno.smpp.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for address complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="address">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NPI" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TON" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "address", propOrder = {
    "address",
    "npi",
    "ton"
})
public class Address {

    protected String address;
    @XmlElement(name = "NPI")
    protected int npi;
    @XmlElement(name = "TON")
    protected int ton;

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress(String value) {
        this.address = value;
    }

    /**
     * Gets the value of the npi property.
     * 
     */
    public int getNPI() {
        return npi;
    }

    /**
     * Sets the value of the npi property.
     * 
     */
    public void setNPI(int value) {
        this.npi = value;
    }

    /**
     * Gets the value of the ton property.
     * 
     */
    public int getTON() {
        return ton;
    }

    /**
     * Sets the value of the ton property.
     * 
     */
    public void setTON(int value) {
        this.ton = value;
    }

}
