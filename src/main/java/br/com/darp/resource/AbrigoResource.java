package br.com.darp.resource;


import br.com.darp.model.Abrigo;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Set;

@Path("/abrigos")
public class AbrigoResource {
    private Set<Abrigo> abrigos = Collections.newSetFromMap(Collections.synchronizedMap(new LinkedHashMap<>()));
    public AbrigoResource(){
        abrigos.add(new Abrigo(1L,"Abrigo 01"));
        abrigos.add(new Abrigo(2L,"Abrigo 02"));
    }
    @GET
    public Response getAbrigos() {
        return Response.ok(abrigos).build();
    }
}
