package model;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import javax.xml.bind.annotation.XmlRootElement;

@JsonIgnoreProperties(ignoreUnknown = true)
@XmlRootElement(name = "letter")
public class Letter {

    private int id;
    private String subject;
    private String mail;
    private String body;

    public Letter() {}

    public Letter(int id, String subject, String mail, String body) {
        this.id = id;
        this.subject = subject;
        this.mail = mail;
        this.body = body;
    }

    public Integer getLetterId() {
        return id;
    }

    public void setLetterId(Integer letterId) {
        this.id = letterId;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getMailTo() {
        return mail;
    }

    public void setMailTo(String mailTo) {
        this.mail = mailTo;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((body == null) ? 0 : body.hashCode());
        result = prime * result + ((mail == null) ? 0 : mail.hashCode());
        result = prime * result + ((subject == null) ? 0 : subject.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Letter other = (Letter) obj;
        if (body == null) {
            if (other.body != null)
                return false;
        } else if (!body.equals(other.body))
            return false;
        if (mail == null) {
            if (other.mail != null)
                return false;
        } else if (!mail.equals(other.mail))
            return false;
        if (subject == null) {
            if (other.subject != null)
                return false;
        } else if (!subject.equals(other.subject))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Letter [subject=" + subject + ", mailTo=" + mail + ", body=" + body + "]";
    }
}

