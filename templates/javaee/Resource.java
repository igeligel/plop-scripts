package de.ostfalia.groupfour.controllers;

import de.ostfalia.groupfour.models.{{className}};

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/{{lowerCase className}}")
public class {{className}}Resource {

  @Inject
  {{className}}Service {{lowerCase className}}Service;

  @GET
  @Path("/{{ resourceid className }}")
  @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
  public {{className}} get{{className}}(@PathParam("{{lowerCase className}}Id") int {{lowerCase className}}Id) {
    return {{lowerCase className}}Service.findById({{lowerCase className}}Id);
  }

  @POST
  @Path("/")
  @Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
  @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
  public {{className}} post{{className}}({{className}} {{lowerCase className}}) {
    {{lowerCase className}}Service.persist({{lowerCase className}});
    return {{lowerCase className}};
  }

  @PUT
  @Path("/")
  @Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
  @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
  public {{className}} put{{className}}({{className}} {{lowerCase className}}) {
    {{lowerCase className}}Service.persist({{lowerCase className}});
    return {{lowerCase className}};
  }

  @DELETE
  @Path("/{{ resourceid className }}")
  @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
  public {{className}} delete{{className}}(@PathParam("{{lowerCase className}}Id") int {{lowerCase className}}Id) {
    return {{lowerCase className}}Service.delete({{lowerCase className}}Id);
  }
}
