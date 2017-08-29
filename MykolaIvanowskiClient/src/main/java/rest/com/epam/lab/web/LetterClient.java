package rest.com.epam.lab.web;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import model.Letter;
import rest.com.epam.lab.helper.Parser;
import javax.ws.rs.core.MediaType;


public class LetterClient {

    private Client client;
    private WebResource resource;
    private ClientResponse clientResponse;
    private Parser<Letter> parser = new Parser<Letter>();

    public  LetterClient() {

        setClient(Client.create());
    }

    public ClientResponse getRequest(String url) {

        resource = client.resource(url);
        clientResponse = resource.accept(MediaType.APPLICATION_JSON)
                .get(ClientResponse.class);
        return clientResponse;
    }
    public ClientResponse getRequest(String url, String data) {

        resource = client.resource(url);
        clientResponse = resource.accept(MediaType.APPLICATION_FORM_URLENCODED_TYPE)
                .get(ClientResponse.class);
        return clientResponse;
    }

    public ClientResponse postRequest(String url, Letter letter){
        setResource(getClient()
                .resource(url));
        setClientResponse(getResource()
                .accept(MediaType.APPLICATION_JSON)
                .type(MediaType.APPLICATION_JSON)
                .post(ClientResponse.class));
        return getClientResponse();
    }

    public ClientResponse deleteRequest(String url, int id) {
        setResource(getClient()
                .resource(url));
        setClientResponse(getResource()
                .accept(MediaType.APPLICATION_JSON)
                .type(MediaType.APPLICATION_JSON)
                .delete(ClientResponse.class));
        return getClientResponse();
    }


    public Client getClient() {

        return client;
    }

    public void setClient(Client client) {

        this.client = client;
    }

    public WebResource getResource() {

        return resource;
    }

    public void setResource(WebResource resource) {

        this.resource = resource;
    }

    public ClientResponse getClientResponse() {

        return clientResponse;
    }

    public void setClientResponse(ClientResponse clientResponse) {

        this.clientResponse = clientResponse;
    }

    public Parser<Letter> getParser() {

        return parser;
    }

    public void setParser(Parser<Letter> parser) {
        this.parser = parser;
    }
}
