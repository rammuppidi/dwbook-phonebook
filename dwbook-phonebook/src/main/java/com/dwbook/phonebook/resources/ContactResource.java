package com.dwbook.phonebook.resources;
import com.dwbook.phonebook.dao.ContactDAO;
import com.dwbook.phonebook.representations.Contact;
import org.skife.jdbi.v2.DBI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.validation.Validator;
import javax.validation.ConstraintViolation;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.net.URISyntaxException;
import java.util.Set;
import java.util.ArrayList;
import java.net.URI;


@Path("/contact")
@Produces(MediaType.APPLICATION_JSON)

public class ContactResource {
    private static final Logger LOGGER = LoggerFactory.getLogger(ContactResource.class);
    private final ContactDAO contactDAO;
    private final Validator validator;

    public ContactResource(DBI jdbi, Validator validator )
    {
        this.validator = validator;
        this.contactDAO = jdbi.onDemand(ContactDAO.class);
    }


    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getContact(@PathParam("id") int id) {
        LOGGER.info("Trying to get the contact" + id);
        Contact contact = contactDAO.getContactById(id);
        return Response
                .ok(contact)
                .build();
    }

    @POST
    public Response createContact( Contact contact) throws URISyntaxException {
        //Validate the contact data
        Set<ConstraintViolation<Contact>> violations = validator.validate(contact);

        if (violations.size() > 0) {
            ArrayList<String> validationMessages = new ArrayList<String>();
            for (ConstraintViolation<Contact> violation : violations) {
                validationMessages.add(violation.getPropertyPath().toString() + violation.getMessage());
            }
            return Response
                    .status(Response.Status.BAD_REQUEST)
                    .entity(validationMessages)
                    .build();
        } else {
            // No validation errors so store the contact
            int newContactID = contactDAO.createContact(contact.getFirstName(), contact.getLastName(), contact.getPhone());

            return Response.created(new URI(String.valueOf(newContactID ))).build();


        }
    }

    @DELETE
    @Path("/{id}")
    public Response deleteContact(@PathParam("id") int id){
      return  Response
                .noContent()
                .build();
    }
}
