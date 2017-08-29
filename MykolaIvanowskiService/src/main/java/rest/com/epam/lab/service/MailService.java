package rest.com.epam.lab.service;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public interface MailService {
    @GET
    @Path("/letter")
    @Produces(MediaType.APPLICATION_JSON)
    Response getAllLetters();

    @POST
    @Path("/addLetter")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    Response send(String letter);

    @DELETE
    @Path("/removeLetter")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    Response deleteLetter(int id );

    @GET
    @Path("/getLetterByEmail/{email}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    Response getLetterByEmail(@PathParam("email")  String email);

    @GET
    @Path("/getLetterBySubject/{subject}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    Response getLetterBySubject(@PathParam("subject")  String subject);
}
