package soap.com.epam.lab.modelweb;

import model.Letter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;

import java.util.Collection;

@XmlAccessorType(XmlAccessType.FIELD)
public class Response<E> {


    @XmlElementRefs({ @XmlElementRef(type = SummaryFault.class), @XmlElementRef(type = SummarySuccess.class) })
    private Summary summary;

    @XmlElementRefs({ @XmlElementRef(type = Letter.class)})
    private E result;

    @XmlElementRefs({  @XmlElementRef(type = Letter.class)})
    private Collection<E> results;

    public Response() {}

    public Response(Summary summary) {
        this.summary = summary;
    }

    public Response(Summary summary, E result) {
        this.summary = summary;
        this.result = result;
    }

    public Response(Summary summary, Collection<E> results) {
        this.summary = summary;
        this.results = results;
    }

    public static <E> Response<E> success(String msg, Collection<E> results) {
        return new Response<E>(new SummarySuccess(msg), results);
    }

    public static <E> Response<E> fault(String msg) {
        return new Response<E>(new SummaryFault(msg));
    }


    public static <E> Response<E> success(String msg) {
        return new Response<E>(new SummarySuccess(msg));
    }

    public static <E> Response<E> success(String msg, E result) {
        return new Response<E>(new SummarySuccess(msg), result);
    }


}


