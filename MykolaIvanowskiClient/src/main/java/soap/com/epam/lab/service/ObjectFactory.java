
package soap.com.epam.lab.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the main.java.soap.com.epam.lab.service package. 
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

    private final static QName _SummaryFault_QNAME = new QName("http://service.lab.epam.com.soap/", "summaryFault");
    private final static QName _SummarySuccess_QNAME = new QName("http://service.lab.epam.com.soap/", "summarySuccess");
    private final static QName _Letter_QNAME = new QName("http://service.lab.epam.com.soap/", "letter");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: main.java.soap.com.epam.lab.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Letter }
     * 
     */
    public Letter createLetter() {
        return new Letter();
    }

    /**
     * Create an instance of {@link SummaryFault }
     * 
     */
    public SummaryFault createSummaryFault() {
        return new SummaryFault();
    }

    /**
     * Create an instance of {@link SummarySuccess }
     * 
     */
    public SummarySuccess createSummarySuccess() {
        return new SummarySuccess();
    }

    /**
     * Create an instance of {@link Summary }
     * 
     */
    public Summary createSummary() {
        return new Summary();
    }

    /**
     * Create an instance of {@link Response }
     * 
     */
    public Response createResponse() {
        return new Response();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SummaryFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.lab.epam.com.soap/", name = "summaryFault")
    public JAXBElement<SummaryFault> createSummaryFault(SummaryFault value) {
        return new JAXBElement<SummaryFault>(_SummaryFault_QNAME, SummaryFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SummarySuccess }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.lab.epam.com.soap/", name = "summarySuccess")
    public JAXBElement<SummarySuccess> createSummarySuccess(SummarySuccess value) {
        return new JAXBElement<SummarySuccess>(_SummarySuccess_QNAME, SummarySuccess.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Letter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.lab.epam.com.soap/", name = "letter")
    public JAXBElement<Letter> createLetter(Letter value) {
        return new JAXBElement<Letter>(_Letter_QNAME, Letter.class, null, value);
    }

}
