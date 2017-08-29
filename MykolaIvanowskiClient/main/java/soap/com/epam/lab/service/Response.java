
package main.java.soap.com.epam.lab.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for response complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="response">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element ref="{http://service.lab.epam.com.soap.java.main/}summaryFault"/>
 *           &lt;element ref="{http://service.lab.epam.com.soap.java.main/}summarySuccess"/>
 *         &lt;/choice>
 *         &lt;element ref="{http://service.lab.epam.com.soap.java.main/}letter"/>
 *         &lt;element ref="{http://service.lab.epam.com.soap.java.main/}letter" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "response", propOrder = {
    "content"
})
public class Response {

    @XmlElementRefs({
        @XmlElementRef(name = "summarySuccess", namespace = "http://service.lab.epam.com.soap.java.main/", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "summaryFault", namespace = "http://service.lab.epam.com.soap.java.main/", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "letter", namespace = "http://service.lab.epam.com.soap.java.main/", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> content;

    /**
     * Gets the rest of the content model. 
     * 
     * <p>
     * You are getting this "catch-all" property because of the following reason: 
     * The field name "Letter" is used by two different parts of a schema. See: 
     * line 16 of http://localhost:8080/MailService/MailService?xsd=1
     * line 15 of http://localhost:8080/MailService/MailService?xsd=1
     * <p>
     * To get rid of this property, apply a property customization to one 
     * of both of the following declarations to change their names: 
     * Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link SummaryFault }{@code >}
     * {@link JAXBElement }{@code <}{@link SummarySuccess }{@code >}
     * {@link JAXBElement }{@code <}{@link Letter }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getContent() {
        if (content == null) {
            content = new ArrayList<JAXBElement<?>>();
        }
        return this.content;
    }

}
