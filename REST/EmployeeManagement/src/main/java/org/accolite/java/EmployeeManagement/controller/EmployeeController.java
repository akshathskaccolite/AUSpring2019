package org.accolite.java.EmployeeManagement.controller;
import org.accolite.java.EmployeeManagement.service.EmployeeService;
import org.accolite.java.EmployeeManagement.dto.EmployeeDTO;
import java.util.*;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("myresource1")
public class EmployeeController {
	static EmployeeService es = new EmployeeService();
    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
	@Path("getall")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<EmployeeDTO> getAll() {
        return es.getAllEmployee();
    }
	
	@Path("{Id}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public EmployeeDTO getOne(@PathParam("Id") String id) {
		System.out.println(id);
        return es.getById(id);
    }
	
	@POST
	@Path("update")
	@Consumes({"application/xml","application/json"})
	public void updateOne(EmployeeDTO emp){
		System.out.println("HI11");
		es.updateEmp(emp);
	}
}
