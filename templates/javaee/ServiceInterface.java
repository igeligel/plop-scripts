package de.ostfalia.groupfour.integration.interfaces;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/{{camelCase className}}")
public interface {{className}}ServiceInterface {
  @GET
  @Path("/{{ resourceid className }}")
  @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
  Response get{{className}}ById(@PathParam("{{camelCase className}}Id") Integer cityId);

  @POST
  @Path("/")
  @Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
  Response post{{className}}({{className}}PersistModel {{camelCase className}}PostModel);

  @PUT
  @Path("/")
  @Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
  Response put{{className}}({{className}}PersistModel {{camelCase className}}PostModel);

  @DELETE
  @Path("/{{ resourceid className }}")
  Response delete{{className}}(@PathParam("{{camelCase className}}Id") Integer {{camelCase className}}Id);
}
