
package soap.com.epam.lab.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for summary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="summary">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "summary")
@XmlSeeAlso({
    SummaryFault.class,
    SummarySuccess.class
})
public class Summary {

    public static final String GET_ALL ="GET_ALL";
    public static final String SEND ="SEND";
    public static final String DELETE ="DELETE";
    public static final String GET_BY_EMAIL ="GET BY EMAIL";
    public static final String GET_BY_SUBJECT ="GET BY SUBJECT";

}
