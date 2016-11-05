package {{packageName}};

import static org.junit.Assert.assertEquals;

import de.ostfalia.groupfour.integration.models.{{className}};
import org.junit.Test;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.MediaType;

public class {{className}}Test {
  String mainUrl = "http://localhost:8080/dvdrental-gruppe-4/resources";
  Client client;

  @Test
  public void checkPostAndGet() {
    // TODO: Add right constructor.
    {{className}} {{camelCase className}} = new {{className}}();
    // POST
    client = ClientBuilder.newClient();
    {{camelCase className}} = client.target(mainUrl).path("{{camelCase className}}")
        .request(MediaType.APPLICATION_JSON)
        .post(Entity.entity({{camelCase className}}, MediaType.APPLICATION_JSON))
        .readEntity({{className}}.class);
    // TODO: AsserTests
    int oldId = {{camelCase className}}.get{{className}}Id();
    // GET
    client = ClientBuilder.newClient();
    {{camelCase className}} = client.target(mainUrl).path("{{camelCase className}}").path(Integer.toString(oldId))
        .request()
        .get()
        .readEntity({{className}}.class);
    // TODO: AsserTests
    assertEquals(oldId, {{camelCase className}}.get{{className}}Id());
  }

  @Test
  public void checkPutAndDelete() {
    // TODO: Add right constructor.
    {{className}} {{camelCase className}} = new {{className}}();
    // PUT
    client = ClientBuilder.newClient();
    {{camelCase className}} = client.target(mainUrl).path("{{camelCase className}}")
        .request(MediaType.APPLICATION_JSON)
        .put(Entity.entity({{camelCase className}}, MediaType.APPLICATION_JSON))
        .readEntity({{className}}.class);
    // TODO: AsserTests
    int oldId = {{camelCase className}}.get{{className}}Id();
    // DELETE
    client = ClientBuilder.newClient();
    {{camelCase className}} = client.target(mainUrl).path("{{camelCase className}}").path(Integer.toString(oldId))
        .request()
        .delete()
        .readEntity({{className}}.class);
    // TODO: AsserTests
    assertEquals(oldId, {{camelCase className}}.get{{className}}Id());
  }
}
