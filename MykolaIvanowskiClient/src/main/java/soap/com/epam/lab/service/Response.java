
package soap.com.epam.lab.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;


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
        "summaryFault",
        "summarySuccess",
        "letters"
})
public class Response<T> {

    @XmlElement(namespace = "http://service.lab.epam.com.soap/")
    protected SummaryFault summaryFault;

    @XmlElement(namespace = "http://service.lab.epam.com.soap/")
    protected SummarySuccess summarySuccess;


    @XmlElements({@XmlElement(name = "letter", namespace = "http://service.lab.epam.com,soap/", type = Letter.class)})
    protected List<T> letters;

    /**
     * Gets the value of the summaryFault property.
     *
     * @return possible object is
     * {@link SummaryFault }
     */
    public SummaryFault getSummaryFault() {
        return summaryFault;
    }

    /**
     * Sets the value of the summaryFault property.
     *
     * @param value allowed object is
     *              {@link SummaryFault }
     */
    public void setSummaryFault(SummaryFault value) {
        this.summaryFault = value;
    }

    /**
     * Gets the value of the summarySuccess property.
     *
     * @return possible object is
     * {@link SummarySuccess }
     */
    public SummarySuccess getSummarySuccess() {
        return summarySuccess;
    }

    /**
     * Sets the value of the summarySuccess property.
     *
     * @param value allowed object is
     *              {@link SummarySuccess }
     */
    public void setSummarySuccess(SummarySuccess value) {
        this.summarySuccess = value;
    }


    public List<T> getResults() {
        return this.letters;
    }


    @Override
    public String toString() {
        return "Response{" +
                "summaryFault=" + summaryFault +
                ", summarySuccess=" + summarySuccess +
                ", letters=" + letters +
                '}';
    }
}
