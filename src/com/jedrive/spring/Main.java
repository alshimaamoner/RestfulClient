package com.jedrive.spring;
import java.util.List;
import java.util.*;
import org.glassfish.jersey.client.ClientConfig;
import com.fasterxml.jackson.core.type.TypeReference;
import javax.ws.rs.*;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import javax.ws.rs.core.*;
import javax.ws.rs.client.*;
import java.net.URI;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import javax.ws.rs.client.AsyncInvoker;

public class Main {
    private static Client client = ClientBuilder.newClient();
    private static ObjectMapper objectMapper = new ObjectMapper();

    public static void main(String[] args) throws ExecutionException, InterruptedException, JsonProcessingException {
///////////////////Get User
//        WebTarget webresource = client.target("http://localhost:9090/RestfulServer-1.0-SNAPSHOT/rest/user/get");

//        final AsyncInvoker asyncInvoker = webresource.request(MediaType.APPLICATION_JSON).async();
//        final Future<Response> responseFuture = asyncInvoker.get();
//        final Response response = responseFuture.get();
//        if (response.getStatus() != 200) {
//            throw new RuntimeException("Failed : HTTP error code :" + response.getStatus());
//        }
//        System.out.println("Response received : " + response);
//        User users = (User) response.readEntity(User.class);
//        System.out.println("Response get All uSER from  Server");
//        System.out.println("Name:" + users.getName());
//        System.out.println("NetSalary");
        /////get NetSalary
        WebTarget webresource = client.target("http://localhost:9090/RestfulServer-1.0-SNAPSHOT/rest/user/getSalary");
        User user=new User();
        user.setName("sho");
        user.setSalary(10000);
        user.setBouns(122);
        user.setDeduction(1);
        user.setAddress("octobar");
        ObjectMapper objectMapper = new ObjectMapper();
        String reques =objectMapper.writeValueAsString(user);
        Response response=client
                .target("http://localhost:9090/RestfulServer-1.0-SNAPSHOT/rest/user/getAll")
                .request(MediaType.APPLICATION_JSON)
                .post(Entity.entity(reques, MediaType.APPLICATION_JSON));
        System.out.println(response.readEntity(String.class));

    }
}
