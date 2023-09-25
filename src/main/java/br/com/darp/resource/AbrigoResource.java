package br.com.darp.resource;


import br.com.darp.model.Abrigo;
import br.com.darp.model.Pet;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Set;

@Path("/abrigos")
public class AbrigoResource {
    private Set<Abrigo> abrigos = Collections.newSetFromMap(Collections.synchronizedMap(new LinkedHashMap<>()));
    private Set<Pet> pets = Collections.newSetFromMap(Collections.synchronizedMap(new LinkedHashMap<>()));
    public AbrigoResource(){
        abrigos.add(new Abrigo("Abrigo 01","61321654","abrigo01@gmail.com"));
        abrigos.add(new Abrigo("Abrigo 02","61987456","abrigo02@hotmail.com"));
        pets.add(new Pet("gato","Tom","Cartoon",4,"cinza",Float.parseFloat("25")));
    }
    @GET
    public Response getAbrigos() {
        return Response.ok(abrigos).build();
    }
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response cadastrarAbrigo(Abrigo abrigo){
        System.out.println("Abrigo cadastrado!\n" + abrigo.toString());
        return Response.ok("Abrigo "+abrigo.toString()+" cadastrado com sucesso!").build();
    }
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/{id}/pets")
    public Response cadastrarPet(Pet pet){
        return Response.ok(pet.toString()).build();
    }
    @GET
    @Path("/{id}/pets")
    public Response listarPetsAbrigo(){
        return Response.ok(pets).build();
    }
}
