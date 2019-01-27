package com.dwbook.phonebook.resources;

import com.dwbook.phonebook.dao.ContactDAO;
import com.dwbook.phonebook.representations.Contact;
import org.skife.jdbi.v2.DBI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/contact")
@Produces(MediaType.APPLICATION_JSON)
public class ContactResource {
    private static final Logger LOGGER = LoggerFactory.getLogger(ContactResource.class);
    private final ContactDAO contactDAO;

    @POST
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getContact(@PathParam("id") int id) {
        LOGGER.info("Trying to get the contact" + id);
        Contact contact = contactDAO.getContactById(id);
        return Response
                .ok(contact)
                .build();
    }
  /*  public Response getContact(@PathParam("id") int id ) {
        return Response
                .ok(new Contact(id,"Ram","Muppidi", "9885613442"))
                .build();
    }

    @POST
    @Path("/{id}")
    public Response createContact( @PathParam("id") int id,
            @FormParam("name") String name, @FormParam("phone") String phone){
        return Response
                .ok(new Contact(id,name,"Muppidi",phone))
                .build();
    }
*/

    @DELETE
    @Path("/{id}")
    public Response deleteContact(@PathParam("id") int id){
      return  Response
                .noContent()
                .build();
    }

    public ContactResource(DBI jdbi)
    {
        contactDAO = jdbi.onDemand(ContactDAO.class);
    }
}
