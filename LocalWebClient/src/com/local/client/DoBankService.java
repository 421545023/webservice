
package com.local.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for doBankService complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="doBankService">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="paramXml" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "doBankService", propOrder = {
    "paramXml"
})
public class DoBankService {

    protected String paramXml;

    /**
     * Gets the value of the paramXml property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParamXml() {
        return paramXml;
    }

    /**
     * Sets the value of the paramXml property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParamXml(String value) {
        this.paramXml = value;
    }

}
