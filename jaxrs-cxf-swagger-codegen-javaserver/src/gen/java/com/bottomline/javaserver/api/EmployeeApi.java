package com.bottomline.javaserver.api;

import com.bottomline.javaserver.model.Employee;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;
import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Swagger Employee Demo
 *
 * <p>Sample Swagger Demo
 *
 */
@Path("/")
public interface EmployeeApi  {

    /**
     * Find employee by ID
     *
     * Returns a single Employee
     *
     */
    @GET
    @Path("/findEmployeeDetails/{employeeId}")
    @Produces({ "application/json" })
    @Operation(summary = "Find employee by ID", tags={ "employee" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(schema = @Schema(implementation = Employee.class))),
        @ApiResponse(responseCode = "400", description = "Invalid Employee ID supplied"),
        @ApiResponse(responseCode = "404", description = "Employee not found") })
    public Employee getEmployeeDetails(@PathParam("employeeId") Integer employeeId);
}
